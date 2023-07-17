package sdet_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ujetix.genericUtils.JavaScriptUtility;

public class JavaScriptPractice
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
		
		
		JavaScriptUtility js = new JavaScriptUtility(driver);
		
		//launch the application
		js.launchApplication("https:docs.phptravels.com/");
		
		
		//get url of current page
		String url = js.getUrlOfCurrentPage();
		System.out.println(url);
		
		//get title of page
		String title = js.getTitleOfCurrentPage();
		System.out.println(title);
		
		//scrolldown
		js.scrollDown();
		
		
		Thread.sleep(4000);
		
		
		//scrollUp
		js.scrollUp();
		
		//scroll till element
		WebElement ele = driver.findElement(By.linkText("API Response Error"));
		js.scrollTillElement(ele);
		js.click(ele);
		
		
		//scrollTIllELement //scrollBar1()
		WebElement smile = driver.findElement(By.xpath("//div[@aria-label='OK content']"));
		js.scrollTillElement(smile);
		
		
		//click on it
		js.click(smile);
		System.out.println(title);
	
		
	}

}
