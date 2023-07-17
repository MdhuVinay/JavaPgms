package practiceSDET48;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.tms.ujetixObjectRepositories.AdminLoginPage;
import com.tms.ujetixObjectRepositories.Admin_HomePage;
import com.tms.ujetixObjectRepositories.CreatePackagePage;

import ujetix.genericUtils.ExcelUtility;
import ujetix.genericUtils.FileUtitlity;
import ujetix.genericUtils.JavaUtillity;
import ujetix.genericUtils.WebDriverUtility;

public class CreatePackageTest
{
	public static void main(String[] args) throws IOException, EncryptedDocumentException
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

		//admin login
		driver.get(ADMIN_URL);
		AdminLoginPage adminlogin = new AdminLoginPage(driver);
		adminlogin.adminLogin(USERNAME_ADMIN, PASSWORD_ADMIN);

		Admin_HomePage home = new Admin_HomePage(driver);
		home.verifyAdminHomePage();

		//create tourpackage dropdown
		home.createTourPackagePage();

		//Random value
		int number = jUtil.getRandomNumber();

		String PKG_NAME = eUtil.getDataFromExcel("Sheet2", 1, 0)+number;
		String PKG_TYPE =eUtil.getDataFromExcel("Sheet2", 1, 1);
		String PKG_LOCATION = eUtil.getDataFromExcel("Sheet2", 1, 2);
		String PKG_PRICE = eUtil.getDataFromExcel("Sheet2", 1, 3);
		String PKG_FEATURE = eUtil.getDataFromExcel("Sheet2", 1, 4);
		String PKG_DETAILS = eUtil.getDataFromExcel("Sheet2", 1, 5);
		String PKG_IMAGE = eUtil.getDataFromExcel("Sheet2", 1, 6);

		//enter the details
		CreatePackagePage create = new CreatePackagePage(driver);
		create.createpackage(driver);

	}
}
