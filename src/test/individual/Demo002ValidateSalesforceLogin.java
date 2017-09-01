package test.individual;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;


import appModule.salesforce.SignIn_Action;
import Utilities.reporter.Screenshotter;

public class Demo002ValidateSalesforceLogin {
	
	public void Demo002_run(WebDriver driver)
	{
		System.out.println("Running Demo002");
		
		//initializing screenshotter
		String testCaseName = this.getClass().getSimpleName();
		Screenshotter camera = new Screenshotter(driver, testCaseName);
		

		driver.get("https://www.salesforce.com/");
		camera.takeTestScreenshot(driver, "Navigates To Saleforce home page, validates against page title");
		
		
		// Use your Module SignIn now
		SignIn_Action.Execute(driver);
        
        camera.takeTestScreenshot(driver, "Navigates To Salesforce login page, logs in, validates against landing page title");
		assertEquals("Home | Salesforce", driver.getTitle());
		
		
	}

}
