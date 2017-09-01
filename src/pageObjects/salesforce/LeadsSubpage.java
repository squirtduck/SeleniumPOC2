package pageObjects.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeadsSubpage {
	private static WebElement element = null;
	 
    public static WebElement btn_New(WebDriver driver){
 
         element = driver.findElement(By.xpath("//a[@title='New']"));
 
         return element;
 
         }

}
