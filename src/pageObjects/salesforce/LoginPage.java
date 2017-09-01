package pageObjects.salesforce;

import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
 
public class LoginPage {
 
        private static WebElement element = null;
 
    public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@id='username']"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@id='password']"));
 
         return element;
 
         }
     
     public static WebElement chkbx_RememberMe(WebDriver driver)
     {
    	 element = driver.findElement(By.xpath("//input[@id='rememberUn']"));
    	 return element;
     }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@id='Login']"));
 
         return element;
 
         }
 
}