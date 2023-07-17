package sdet_training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ManageIssuesPage 
{
	public ManageIssuesPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void actionClick(WebDriver driver,String Comments) 
	{
		driver.findElement(By.xpath("//span[.='"+Comments+"']/../..//a[.='View ']")).click();
	}
}
