package practiceSDET48;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Propert_file_datafetch
{
	public static void main(String[] args) throws IOException
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/logindata.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PWD = prop.getProperty("password");
		String BROWSER = prop.getProperty("browser");
		WebDriver driver = null;
		if (BROWSER.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
			driver= new ChromeDriver();
		} 
		else if(BROWSER.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
			driver= new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(URL);
		driver.findElement(By.id("email")).sendKeys(USERNAME);
		driver.findElement(By.name("pass")).sendKeys(PWD);
		driver.findElement(By.id("loginbutton")).click();
		
		
		
	}

}
