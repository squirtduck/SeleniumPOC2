package pageObjects.salesforce;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

public class HomePage 
{
	private static WebElement element = null;
	public static WebElement lnk_MyAccount(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[contains(@class,'global_login')]"));
		return element;
	}
}