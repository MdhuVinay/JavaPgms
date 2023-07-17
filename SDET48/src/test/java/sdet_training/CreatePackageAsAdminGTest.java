package sdet_training;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ujetix.genericUtils.BaseClass;
import ujetix.genericUtils.ExcelUtility;
import ujetix.genericUtils.FileUtitlity;
import ujetix.genericUtils.IPathConstants;
import ujetix.genericUtils.JavaUtillity;
import ujetix.genericUtils.WebDriverUtility;

public class CreatePackageAsAdminGTest extends BaseClass
{
	@Test
	public static void test1() throws IOException
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

		//launch the browser
		@BeforeClass
		
		//implicit wait
		wUtil.waitTillPageGetsLoad(driver);
		
		//maximize browser
		wUtil.maximizeWindow(driver);

		//admin login
		@BeforeMethod
		
		//tourpackage dropdown
		driver.findElement(By.xpath("//span[.=' Tour Packages']")).click();
		driver.findElement(By.linkText("Create")).click();

		//Random value
		int number = jUtil.getRandomNumber();

		
		String PKG_NAME = eUtil.getDataFromExcel("Sheet2", 1, 0)+number;
		String PKG_TYPE =eUtil.getDataFromExcel("Sheet2", 1, 1);
		String PKG_LOCATION = eUtil.getDataFromExcel("Sheet2", 1, 2);
		String PKG_PRICE = eUtil.getDataFromExcel("Sheet2", 1, 3);
		String PKG_FEATURE = eUtil.getDataFromExcel("Sheet2", 1, 4);
		String PKG_DETAILS = eUtil.getDataFromExcel("Sheet2", 1, 5);
		String PKG_IMAGE = eUtil.getDataFromExcel("Sheet2", 1, 6);

		//tourpackage dropdown
		driver.findElement(By.xpath("//span[.=' Tour Packages']")).click();
		driver.findElement(By.linkText("Create")).click();

		//enter the details
		driver.findElement(By.id("packagename")).sendKeys(PKG_NAME);
		driver.findElement(By.id("packagetype")).sendKeys(PKG_TYPE);
		driver.findElement(By.id("packagelocation")).sendKeys(PKG_LOCATION);
		driver.findElement(By.id("packageprice")).sendKeys(PKG_PRICE);
		driver.findElement(By.id("packagefeatures")).sendKeys(PKG_FEATURE);

		//scroll action
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		WebElement create_btn = driver.findElement(By.name("submit"));

		Point Create_location = create_btn.getLocation();
		int x1 = Create_location.getX();
		int y1 = Create_location.getY();
		jse.executeScript("window.scrollBy("+x1+","+y1+")");

		driver.findElement(By.id("packagedetails")).sendKeys(PKG_DETAILS);
		driver.findElement(By.id("packageimage")).sendKeys(PKG_IMAGE);
		create_btn.click();

		WebElement create = driver.findElement(By.xpath("//div[@class='succWrap']"));
		String create_text = create.getText();
		if (create_text.contains("Successfully")) 
		{
			System.out.println("Successfully created");
		}
		else
		{
			System.out.println("not created");
		}
		
		//taking the screenshot of created page
		
		wUtil.takeScreenShot(driver, "confirm");
		
		
		
		//admin logout
		driver.findElement(By.xpath("//div[@class='user-name']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.findElement(By.linkText("Back to home")).click();

		//user login
		driver.get(USER_URL);
		driver.findElement(By.xpath("//li[@class='sigi']")).click();
		driver.findElement(By.xpath("//h3[text()='Signin with your account ']"
				+ "/following-sibling::input[1]")).sendKeys(USERNAME_USER);
		driver.findElement(By.xpath("//h3[text()='Signin with your account ']"
				+ "/following-sibling::input[2]")).sendKeys(PASSWORD_USER);
		driver.findElement(By.name("signin")).click();

		//verification of log in
		WebElement user = driver.findElement(By.xpath("//li[@class='sig']"));
		String user_text = user.getText();
		if (user_text.contains(USERNAME_USER))
		{
			System.out.println("user logged in sucessfully");
		} else 
		{
			System.out.println("logout failed");
		}

		//tour package clicking
		driver.findElement(By.linkText("Tour Packages")).click();

		//verifie the created tour package
		List<WebElement> packages = driver.findElements(By.xpath("//div[@class='rom-btm']/div[2]/h4"));
		if(packages.contains(PKG_NAME))
		{
			System.out.println("created package is present");
		}
		else 
		{
			System.out.println("created package is present");
		}
		//clicking on write us link
			driver.findElement(By.linkText(" / Write Us ")).click();

		//dropdown
		WebElement dropdown = driver.findElement(By.id("country"));
		Select drop = new Select(dropdown);
		drop.selectByIndex(1);

		//description
		driver.findElement(By.name("description")).sendKeys("Not working");
		//click on submit
		driver.findElement(By.name("submit")).click();



		String msg2 = driver.findElement(By.xpath("//h4[text()='  Info successfully submited ']")).getText();
		if (msg2.contains("success"))
		{
			System.out.println("write us completed");
		} 
		else
		{
			System.out.println("write us not completed");
		}

		//logout as user
		driver.findElement(By.linkText("/ Logout")).click();

		//admin login
		driver.get(ADMIN_URL);
		driver.findElement(By.name("username")).sendKeys(USERNAME_ADMIN);
		driver.findElement(By.name("password")).sendKeys(PASSWORD_ADMIN);
		driver.findElement(By.name("login")).click();

		WebElement homepage = driver.findElement(By.xpath("//a[@href='index.html']"));
		String homes = homepage.getText();
		if (homes.contains("Home")) 
		{
			System.out.println("admin home page is displaying");
		}
		else 
		{
			System.out.println("admin home page is not displaying");
		}
		//manage issue
		driver.findElement(By.linkText("Manage Issues")).click();
		
		List<WebElement> view_link = driver.findElements(By.xpath("//td[@data-th='Action ']"));
		int size=view_link.size()-1;
		Actions action = new Actions(driver);
		action.scrollToElement(view_link.get(size)).click().perform();
	}

}
