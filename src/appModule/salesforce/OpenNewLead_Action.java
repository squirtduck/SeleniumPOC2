package appModule.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.salesforce.LeadsSubpage;


public class OpenNewLead_Action {
	
	public static void Execute(WebDriver driver)
	{
		// explicit wait - to wait for the New button on Leads page  to load
        WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='New']")));
		LeadsSubpage.btn_New(driver).click();
	}

}