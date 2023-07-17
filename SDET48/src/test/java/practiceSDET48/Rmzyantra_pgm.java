package practiceSDET48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.mysql.jdbc.Driver;

public class Rmzyantra_pgm 
{
	public static void main(String[] args) throws SQLException 
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("http://rmgtestingserver:8084/");
		driver.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//a[text()='Projects']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-success']")).click();

		String project_name="ujetix5";
		driver.findElement(By.xpath("//input[@name='projectName']")).sendKeys(project_name);
		driver.findElement(By.xpath("//input[@name='createdBy']")).sendKeys("tilak5");
		WebElement dropdown = driver.findElement(By.xpath("//label[text()='Project Status ']/..//select"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Connection connection = null;
		try
		{
			Driver driver1 = new Driver();
			DriverManager.registerDriver(driver1);
			connection = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			Statement statement = connection.createStatement();
			ResultSet result = statement.executeQuery("Select * from project");


			while(result.next())
			{
				String a=result.getString(4);
				if(a.contains(project_name))
				{
					System.out.println("created");
					break;
				}
			}
		}
		finally
		{
			connection.close();
		}
	}

}
