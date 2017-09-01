package appModule.salesforce;

import org.openqa.selenium.WebDriver;

import pageObjects.salesforce.LandingPageDashboard;

public class NavigateToLeads_Action {
	public static void Execute(WebDriver driver)
	{
		LandingPageDashboard.btn_LeadsLink(driver).click();
		LandingPageDashboard.btn_LeadsText(driver).click();	
	}

}
