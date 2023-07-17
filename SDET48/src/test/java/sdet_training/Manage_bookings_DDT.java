package sdet_training;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Manage_bookings_DDT
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
		
		//manage bookings
				driver.findElement(By.xpath("//a[@href='manage-bookings.php']")).click();
				//scroll to element
				JavascriptExecutor jse=(JavascriptExecutor)driver;
				
				WebElement confirm_link = driver.findElement(By.xpath("//a[@href='manage-bookings.php?bckid=11']"));
				Point location = confirm_link.getLocation();
				int x = location.getX();
				int y = location.getY();
				jse.executeScript("window.scrollBy("+x+","+y+")");
				confirm_link.click();
				
				Alert popup = driver.switchTo().alert();
				popup.accept();
				
				WebElement msg = driver.findElement(By.xpath("//div[@class='succWrap']"));
				String admin_msg = msg.getText();
				if (admin_msg.contains("Confirm successfully"))
				{
					System.out.println("confirmed");
				}
				else 
				{
					System.out.println("not confirmed");
				}
				//logout
				driver.findElement(By.xpath("//div[@class='user-name']")).click();
				driver.findElement(By.xpath("//a[@href='logout.php']")).click();
				
				
				//user login
				driver.get(USER_URL);
				driver.findElement(By.xpath("//li[@class='sigi']")).click();
				driver.findElement(By.xpath("//h3[text()='Signin with your account ']"
						+ "/following-sibling::input[1]")).sendKeys(USERNAME_USER);
				driver.findElement(By.xpath("//h3[text()='Signin with your account ']"
						+ "/following-sibling::input[2]")).sendKeys(PASSWORD_USER);
				driver.findElement(By.name("signin")).click();
				
				//click on booking history
				WebElement user = driver.findElement(By.xpath("//li[@class='sig']"));
				String username = user.getText();
				if (username.contains("nuj"))
				{
					System.out.println("user home page displayong");
				}
				else
				{
					System.out.println("user home page is not dispalying");
				}
				
				driver.findElement(By.xpath("//a[@href='tour-history.php']")).click();

				
				//logout
				driver.findElement(By.linkText("/ Logout")).click();
		
		
	}
	
}
