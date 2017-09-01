package appModule.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.salesforce.NewLeadsAria;

public class FillOutMinimalLeadInformation_Action {
	
	public static void Execute(WebDriver driver)
	{
		// explicit wait - to wait for the new Leads form  to load
        WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
		NewLeadsAria.txtbx_NewLeadLastName(driver).sendKeys("Tigalo");
		NewLeadsAria.txtbx_NewLeadCompanyName(driver).sendKeys("El Dubs");
		NewLeadsAria.btn_Save(driver).click();
		
		
	}

}
