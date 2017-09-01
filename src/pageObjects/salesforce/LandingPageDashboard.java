package pageObjects.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageDashboard {
	private static WebElement element = null;
	 
    
 
     public static WebElement btn_LeadsText(WebDriver driver){
 
 
         element = driver.findElement(By.xpath("//span[text()='Leads']"));
         //element = driver.findElement(By.xpath("//header[@id='oneHeader']/div[4]/div/div[2]/nav/ul/li[5]/a/span"));
       
 
         return element;
 
         }
     
     public static WebElement btn_LeadsLink(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("//a[@title='Leads']"));
         return element;
 
         }
     public static WebElement btn_leadsDropdown(WebDriver driver){
    	 
         //element = driver.findElement(By.xpath("//a[@title='Leads']"));
         element = driver.findElement(By.xpath("//span[text()='Leads']//../following-sibling::div//a[contains(@class,'button')]"));
       
 
         return element;
         }
     
     public static WebElement btn_newLeadsChoice(WebDriver driver){
    	 
         //element = driver.findElement(By.xpath("//a[@title='Leads']"));
         element = driver.findElement(By.xpath("//span[text()='Leads']//../following-sibling::div//a[@title='New Lead']"));
       
 
         return element;
         }
     
     public static WebElement btn_UserProfile(WebDriver driver){
    	 
         element = driver.findElement(By.xpath("//button[contains(@class, 'UserProfile')]"));
 
         return element;
 
         }
     
     
     
	

}
