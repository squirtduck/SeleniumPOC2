package appModule.salesforce;

import org.openqa.selenium.WebDriver;

import pageObjects.salesforce.LandingPageDashboard;

public class OpenNewLead2_Action {
	
	public static void Execute(WebDriver driver)
	{
		LandingPageDashboard.btn_leadsDropdown(driver).click();
		LandingPageDashboard.btn_newLeadsChoice(driver);
	}

}
