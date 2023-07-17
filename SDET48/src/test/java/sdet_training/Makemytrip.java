package sdet_training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytrip 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");

		String src = "Bengaluru";
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();

		String dst="Mumbai";
		driver.findElement(By.id("toCity")).sendKeys(dst);
		driver.findElement(By.xpath("//p[text()='Mumbai, India']")).click();
		
		driver.findElement(By.id("departure")).click();
		driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--today']")).click();
		driver.findElement(By.id("return")).click();
		driver.findElement(By.xpath("//div[@aria-label='Fri May 12 2023']")).click();
		driver.findElement(By.xpath("//input[@id='travellers']")).click();
		driver.findElement(By.xpath("//li[@data-cy='adults-3']")).click();
		driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click();
		driver.findElement(By.xpath("//a[.='Search']")).click();
	}

}