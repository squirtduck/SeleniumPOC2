package appModule.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.environmentConstants.InputParameters;
import pageObjects.salesforce.*;

public class SignIn_Action{

	public static void Execute(WebDriver driver)
	{
		HomePage.lnk_MyAccount(driver).click(); 
		LoginPage.txtbx_UserName(driver).sendKeys(InputParameters.getParameter(InputParameters.SALESFORCE_LOGIN_KEY));
		
		LoginPage.txtbx_Password(driver).sendKeys(InputParameters.getParameter(InputParameters.SALESFORCE_PASSWORD_KEY));
		LoginPage.btn_LogIn(driver).click();
		
		// explicit wait - to wait for the landing page to load
        WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class, 'UserProfile')]")));
        //wait1.until(ExpectedConditions.visibilityOf(LandingPageDashboard.btn_UserProfile(driver)));
	}

}


