package sdet_training;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import ujetix.genericUtils.ExcelUtility;
import ujetix.genericUtils.FileUtitlity;
import ujetix.genericUtils.JavaUtillity;
import ujetix.genericUtils.WebDriverUtility;

public class Create_tour_Package
{
	public  void test()
	{

		ExcelUtility eUtil = new ExcelUtility();
		JavaUtillity jUtil = new JavaUtillity();
		WebDriverUtility wUtil = new WebDriverUtility();
		FileUtitlity fUtil = new FileUtitlity();
		
		
		//launch browser
		@testcla
		System.setProperties("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();


		//implicit wait
		wUtil.waitTillPageGetsLoad(driver);
		
		//maximize browser
		wUtil.maximizeWindow(driver);
		
		//admin login
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/admin/index.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("login")).click();

		WebElement home = driver.findElement(By.xpath("//a[@href='index.html']"));
		String h = home.getText();
		if (h.contains("Home")) 
		{
			System.out.println("admin home page is displaying");
		}
		else 
		{
			System.out.println("admin home page is not displaying");
		}

		//tourpackage dropdown
		driver.findElement(By.xpath("//span[.=' Tour Packages']")).click();
		driver.findElement(By.linkText("Create")).click();

		//enter the details
		driver.findElement(By.id("packagename")).sendKeys("Arequipa tour");
		driver.findElement(By.id("packagetype")).sendKeys("Family package");
		driver.findElement(By.id("packagelocation")).sendKeys("Arequipa");
		driver.findElement(By.id("packageprice")).sendKeys("180 USD");
		driver.findElement(By.id("packagefeatures")).sendKeys("Free Pickup and drop");

		//scroll action
		JavascriptExecutor jse=(JavascriptExecutor)driver;

		WebElement create_btn = driver.findElement(By.name("submit"));

		Point Create_location = create_btn.getLocation();
		int x1 = Create_location.getX();
		int y1 = Create_location.getY();
		jse.executeScript("window.scrollBy("+x1+","+y1+")");

		driver.findElement(By.id("packagedetails")).sendKeys(":It is 5 days package include all meals and hotel bookings etc.");
		driver.findElement(By.id("packageimage")).sendKeys("C:\\Users\\thesu\\OneDrive\\Pictures\\Screenshots\\2023-05-05 (1).png");
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
		//admin logout
		driver.findElement(By.xpath("//div[@class='user-name']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();
		driver.findElement(By.linkText("Back to home")).click();

		//tour package clicking
		driver.findElement(By.linkText("Tour Packages")).click();

		//scroll to element				
		WebElement package_name = driver.findElement(By.xpath("//h4[.='Package Name: Arequipa tour']"));
		Point location = package_name.getLocation();
		int x = location.getX();
		int y = location.getY();
		jse.executeScript("window.scrollBy("+x+","+y+")");

		String package_text = package_name.getText();
		if (package_text.contains("Arequipa")) 
		{
			System.out.println("Successfully found the created package name");
		}
		else
		{
			System.out.println("not found the created package name");
		}
		
		//enquiry link clicking after scroll action
		WebElement enquiry_link = driver.findElement(By.xpath("//a[@href='enquiry.php']"));
		Point enquiry_location = enquiry_link.getLocation();
		int x2 = enquiry_location.getX();
		int y2 = enquiry_location.getY();
		jse.executeScript("window.scrollBy("+x2+","+y2+")");
		enquiry_link.click();


		//enter the details
		driver.findElement(By.id("fname")).sendKeys("Abi");
		driver.findElement(By.id("email")).sendKeys("Abi12@gmail.com");
		driver.findElement(By.id("mobileno")).sendKeys("9475869872");
		driver.findElement(By.id("subject")).sendKeys("no. of member in family");
		driver.findElement(By.id("description")).sendKeys("How many family member allowed in this tour package");
		driver.findElement(By.name("submit1")).click();

		//admin login
		driver.findElement(By.linkText("Admin Login")).click();
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/admin/index.php");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.name("login")).click();

		//click on manage enquiry
		driver.findElement(By.xpath("//span[.='Manage Enquiries']")).click();
		driver.findElement(By.xpath("//span[.='Abi']/../following-sibling::td[5]")).click();
		Alert alert_read = driver.switchTo().alert();
		alert_read.accept();

		//admin logout
		driver.findElement(By.xpath("//div[@class='user-name']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();

















	}
}
