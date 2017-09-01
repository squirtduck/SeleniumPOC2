package pageObjects.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewLeadsAria {
	
	private static WebElement element = null;
	 
    public static WebElement txtbx_NewLeadLastName(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
 
         return element;
 
         }
    
    public static WebElement txtbx_NewLeadCompanyName(WebDriver driver){
    	 
        element = driver.findElement(By.xpath("//div[contains(@class, 'forcePageBlock')]//span[contains(text(), 'Company')]//../following-sibling::input"));

        return element;

        }
    
    public static WebElement btn_Save(WebDriver driver){
   	 
        element = driver.findElement(By.xpath("//button[@title='Save']"));

        return element;

        }

}