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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CreatePackageAsAdminDTTTest
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/resources/TMS_login_details.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String ADMIN_URL = prop.getProperty("admin_url");
		String USER_URL = prop.getProperty("user_url");
		String USERNAME_ADMIN = prop.getProperty("username_admin");
		String PASSWORD_ADMIN = prop.getProperty("password_admin");
		String USERNAME_USER = prop.getProperty("username_user");
		String PASSWORD_USER = prop.getProperty("password_user");
		String BROWSER = prop.getProperty("browser");

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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//maximize browser
		driver.manage().window().maximize();

		//admin login
		driver.get(ADMIN_URL);
		driver.findElement(By.name("username")).sendKeys(USERNAME_ADMIN);
		driver.findElement(By.name("password")).sendKeys(PASSWORD_ADMIN);
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

		FileInputStream fis2 = new FileInputStream("./src/test/resources/TMS_packagedata.xlsx");
		Workbook book = WorkbookFactory.create(fis2);
		Sheet sh = book.getSheet("Sheet2");

		//Random value
		Random random = new Random();
		int number = random.nextInt(1000);

		String PKG_NAME = sh.getRow(1).getCell(0).getStringCellValue()+number;
		String PKG_TYPE = sh.getRow(1).getCell(1).getStringCellValue()+number;
		String PKG_LOCATION = sh.getRow(1).getCell(2).getStringCellValue()+number;
		String PKG_PRICE = sh.getRow(1).getCell(3).getStringCellValue()+number;
		String PKG_FEATURE = sh.getRow(1).getCell(4).getStringCellValue()+number;
		String PKG_DETAILS = sh.getRow(1).getCell(5).getStringCellValue()+number;
		String PKG_IMAGE = sh.getRow(1).getCell(6).getStringCellValue();

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
		
		//fetch data from excel
		Sheet sh1 = book.getSheet("Sheet1");
		String FNAME = sh1.getRow(1).getCell(0).getStringCellValue()+number;
		String EMAIL = sh1.getRow(1).getCell(1).getStringCellValue();
		int MBLNO = (int)sh1.getRow(1).getCell(2).getNumericCellValue();
		String mblno = MBLNO+"";
		String SUBJECT = sh1.getRow(1).getCell(3).getStringCellValue()+number;
		String DESCRIPTION = sh1.getRow(1).getCell(4).getStringCellValue()+number;
		
		//enter the details
		driver.findElement(By.id("fname")).sendKeys(FNAME);
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("mobileno")).sendKeys(mblno);
		driver.findElement(By.id("subject")).sendKeys(SUBJECT);
		driver.findElement(By.id("description")).sendKeys(DESCRIPTION);
		driver.findElement(By.name("submit1")).click();
		
		//admin login
		driver.findElement(By.linkText("Admin Login")).click();
		driver.get("http://rmgtestingserver/domain/Online_Tourism_Management_System/admin/index.php");
		driver.findElement(By.name("username")).sendKeys(USERNAME_ADMIN);
		driver.findElement(By.name("password")).sendKeys(PASSWORD_ADMIN);
		driver.findElement(By.name("login")).click();
		
		//click on manage enquiry
		driver.findElement(By.xpath("//span[.='Manage Enquiries']")).click();
		List<WebElement> enquiry = driver.findElements(By.xpath("//tbody//tr//td[.='Abi']/parent::tr//a[.='Pending']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(enquiry.get(enquiry.size()-1)).scrollToElement(enquiry.get(enquiry.size()-1)).click().perform();
		
		
		Alert alert_read = driver.switchTo().alert();
		alert_read.accept();
		
		
		//admin logout
		driver.findElement(By.xpath("//div[@class='user-name']")).click();
		driver.findElement(By.xpath("//a[@href='logout.php']")).click();

		





	}
}
