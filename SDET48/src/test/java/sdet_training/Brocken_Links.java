package sdet_training;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Brocken_Links 
{
	public static void main(String[] args)
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		ArrayList<String> brokenLinks = new ArrayList<String>();
		for (int i = 0; i < allLinks.size(); i++) 
		{
			String links = allLinks.get(i).getAttribute("href");
			int statusCode=0;
			try 
			{
					URL url = new URL(links);
					URLConnection urlconnection= url.openConnection();
					HttpURLConnection httpURLConnection=(HttpURLConnection)urlconnection;
					statusCode = httpURLConnection.getResponseCode();
					if(statusCode>=400)
					{
						brokenLinks.add(links+"  ==> "+statusCode);
					
					}
					
			}
			catch (Exception e)
			{
				brokenLinks.add(links+"  ==> "+statusCode);
				continue;

			}
		}
		System.out.println(brokenLinks);
	}
}
