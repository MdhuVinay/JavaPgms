package sdet_training;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tms.ujetixObjectRepositories.AdminLoginPage;
import com.tms.ujetixObjectRepositories.Admin_HomePage;
import com.tms.ujetixObjectRepositories.UserLoginPage;
import com.tms.ujetixObjectRepositories.User_Homepage;
import com.tms.ujetixObjectRepositories.ViewChildBrowserPopupPage;
import com.tms.ujetixObjectRepositories.Write_Us_Popup;

import admin_ujetix.ManageIssuesPage;
import ujetix.genericUtils.ExcelUtility;
import ujetix.genericUtils.FileUtitlity;
import ujetix.genericUtils.JavaScriptUtility;
import ujetix.genericUtils.JavaUtillity;
import ujetix.genericUtils.WebDriverUtility;

public class IssueRemark_Admin
{
	public static void main(String[] args) throws Exception
	{
		ExcelUtility eUtil = new ExcelUtility();
		JavaUtillity jUtil = new JavaUtillity();
		WebDriverUtility wUtil = new WebDriverUtility();
		FileUtitlity fUtil = new FileUtitlity();


		String ADMIN_URL =fUtil.getPropertData("admin_url");
		String USER_URL = fUtil.getPropertData("user_url");
		String USERNAME_ADMIN = fUtil.getPropertData("username_admin");
		String PASSWORD_ADMIN = fUtil.getPropertData("password_admin");
		String USERNAME_USER = fUtil.getPropertData("username_user");
		String PASSWORD_USER = fUtil.getPropertData("password_user");
		String BROWSER = fUtil.getPropertData("browser");

		WebDriver driver;
		if (BROWSER.equals("chrome"))
		{
			//launch browser
			driver=new ChromeDriver();

		} 
		else if (BROWSER.equalsIgnoreCase("firefox")) 
		{
			//launch browser
			driver=new FirefoxDriver();
		}
		else
		{
			//launch browser
			driver=new ChromeDriver();
		}
		//implicit wait
		wUtil.waitTillPageGetsLoad(driver);

		//maximize browser
		wUtil.maximizeWindow(driver);
		
		// login as user
		driver.get(USER_URL);
		UserLoginPage userlogin = new UserLoginPage(driver);
		userlogin.userLogin(USERNAME_USER, PASSWORD_USER);
		
		//homepage
		User_Homepage userhomepage=new User_Homepage(driver);
		userhomepage.getWriteUs_link().click();
		
		//wrtieus page
		String message="Not at all confirming";
		Write_Us_Popup writeus = new Write_Us_Popup(driver);
		writeus.create_Issue(message);
		
		//logout as user
		userhomepage.getLogout_link().click();


		//login as admin
		driver.get(ADMIN_URL);
		AdminLoginPage adminlogin = new AdminLoginPage(driver);
		adminlogin.adminLogin(USERNAME_ADMIN, PASSWORD_ADMIN);
		
		//homepage
		Admin_HomePage admin_home = new Admin_HomePage(driver);
		admin_home.getManageIssues_link().click();
		ManageIssuesPage manageissue = new ManageIssuesPage(driver);
		String Comments="Arequipa tour946 Booking issue";
		manageissue.actionClick(driver, Comments);

		//handling popup
		JavaScriptUtility jsu = new JavaScriptUtility(driver);
		jsu.scrollDown();
		ViewChildBrowserPopupPage childbrowser = new ViewChildBrowserPopupPage(driver);
		String title = childbrowser.updatePopup(driver);
		// validate 
			if(title.equals("Update Compliant"))
			{
				childbrowser.getTextarea().sendKeys("OK Alright i will try to check once ");
				childbrowser.getUpdate_btn().click();
			}
			
		// logout as admin
		admin_home.logoutCLick();
		adminlogin.getBack_link().click();
		
		// login as user
		userlogin.userLogin(USERNAME_USER, PASSWORD_USER);
		
		// click on issue ticket 
		
		UserHomePage uh=new UserHomePage(driver);
		uh.getIssueticketslink().click();
		IssueTicketsPage it=new IssueTicketsPage(driver);
		int last=it.getAdminremark().size()-1;
		String text = it.getAdminremark().get(last).getText();

		if(text.contains("OK Alright i will try to check once"))
		{
			System.out.println("Text is displayed under remarks section");
		}
		else {
			System.out.println("text is not displayed");
		}
		// logout as user
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		// close the application
		driver.quit();
	}

}
