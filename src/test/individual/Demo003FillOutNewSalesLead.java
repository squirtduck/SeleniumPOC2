package test.individual;

import org.openqa.selenium.WebDriver;

import Utilities.reporter.Screenshotter;
import appModule.salesforce.FillOutMinimalLeadInformation_Action;
import appModule.salesforce.NavigateToLeads_Action;
import appModule.salesforce.OpenNewLead_Action;
//import appModule.salesforce.OpenNewLead_Action;
import appModule.salesforce.SignIn_Action;

public class Demo003FillOutNewSalesLead {
	
	public void Demo003_run(WebDriver driver)
	{
		System.out.println("Running Demo003");
		
		//initializing screenshotter
		String testCaseName = this.getClass().getSimpleName();
		Screenshotter camera = new Screenshotter(driver, testCaseName);
		

		driver.get("https://www.salesforce.com/");
		camera.takeTestScreenshot(driver, "Navigates To Saleforce home page, validates against page title");
		
		
		// Use your Module SignIn now
		SignIn_Action.Execute(driver);
        camera.takeTestScreenshot(driver, "Navigates To Salesforce login page, logs in, validates against landing page title");
        
        //navigate to Leads subpage
        NavigateToLeads_Action.Execute(driver);
        camera.takeTestScreenshot(driver, "Navigate to the Leads subpage via the Landing dashboard");
        
        OpenNewLead_Action.Execute(driver);
        camera.takeTestScreenshot(driver, "Open a new lead on the Leads Sub Page");
        
        FillOutMinimalLeadInformation_Action.Execute(driver);
        camera.takeTestScreenshot(driver, "Fill out new lead's last name and company name, and then save");
        
        try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        camera.takeTestScreenshot(driver, "Shows that new lead has been successfully input");
		
		
		
	}

}
