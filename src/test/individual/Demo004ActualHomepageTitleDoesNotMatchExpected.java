package test.individual;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import Utilities.reporter.Screenshotter;
import appModule.salesforce.SignIn_Action;

public class Demo004ActualHomepageTitleDoesNotMatchExpected {
	
	public void Demo004_run(WebDriver driver)
	{
		System.out.println("Running Demo004");
		
		//initializing screenshotter
		String testCaseName = this.getClass().getSimpleName();
		Screenshotter camera = new Screenshotter(driver, testCaseName);
				

		driver.get("https://www.salesforce.com/");
		camera.takeTestScreenshot(driver, "Navigates To Saleforce home page, validates against page title");
		assertEquals("The Star Trek Home Page", driver.getTitle());
		
		
		
	}

}
