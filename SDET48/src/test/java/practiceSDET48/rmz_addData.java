package practiceSDET48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.jdbc.Driver;

public class rmz_addData 
{
	public static void main(String[] args) throws SQLException
	{
		Connection connection=null;
		String p_name="ujetix11";
		try
		{
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			connection = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("insert into project values('TY_PROJ_999','TilakLN','11/05/2023','"+p_name+"','Created',0)");
			if(result>0)
			{
				System.out.println("query inserted");
			}
			else
			{
				System.out.println("query not inserted");
			}	
		}
		finally
		{
			connection.close();
		}
		
		
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.manage().window().maximize();
		driver1.get("http://rmgtestingserver:8084/");
		driver1.findElement(By.id("usernmae")).sendKeys("rmgyantra");
		driver1.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		driver1.findElement(By.xpath("//button[@type='submit']")).click();

		driver1.findElement(By.xpath("//a[text()='Projects']")).click();
		List<WebElement> pro_names = driver1.findElements(By.xpath("//th[.='ProjectName']/../../..//td[2]"));
		
		for(WebElement p:pro_names)
		{
			String text = p.getText();
			if(text.contains(p_name))
			{
				System.out.println("created project is present");
				break;
			}
		}

	}
}
