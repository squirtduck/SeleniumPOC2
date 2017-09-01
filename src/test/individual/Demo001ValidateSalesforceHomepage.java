package test.individual;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Utilities.reporter.Screenshotter;

public class Demo001ValidateSalesforceHomepage 
{
	
	public void Demo001_run(WebDriver driver)
	{
		System.out.println("Running Demo001");
		
		//initializing screenshotter
		String testCaseName = this.getClass().getSimpleName();
		Screenshotter camera = new Screenshotter(driver, testCaseName);
		

		driver.get("https://www.salesforce.com/");
		assertEquals("Salesforce.com: The Customer Success Platform To Grow Your Business", driver.getTitle());
		camera.takeTestScreenshot(driver, "Navigates To Saleforce home page, validates against page title");
	}

}
