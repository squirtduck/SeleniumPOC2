package Utilities.browsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Utilities.environmentConstants.InputParameters;

public class browserChrome 
{
	
	public static WebDriver initializeChromeDriver()
	{
	    
	    String chromePath = System.getProperty("user.dir") + InputParameters.getParameter(InputParameters.CHROME_PATH_KEY);//Parameters.getParameter(Parameters.IE_PATH_KEY);
	   
	    
	    File file = new File(chromePath);
	    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	    
	    /* Storing the Chrome Profile Path in Chrome_Profile_Path variable. */
	    String Chrome_Profile_Path = "C:\\Users\\marqu\\AppData\\Local\\Google\\Chrome\\User Data";

	    /* Creating an instance of ChromeOptions (i.e objChrome_Profile) */
	    ChromeOptions Chrome_Profile = new ChromeOptions();

	    /* Disabling the chrome browser extensions */
	    Chrome_Profile.addArguments("chrome.switches","--disable-extensions"); 

	    /* Adding Chrome profile by .addArguments to objChrome_Profile  */
	    Chrome_Profile.addArguments("user-data-dir=" + Chrome_Profile_Path);

	    WebDriver driver = new ChromeDriver(Chrome_Profile);
	    //WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    return driver;
	}
}










