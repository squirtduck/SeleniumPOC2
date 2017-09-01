package Utilities.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utilities.environmentConstants.InputParameters;

public class browserFirefox {
	
	public static WebDriver initializeFireFoxDriver()
	{
		System.setProperty("webdriver.firefox.marionette", InputParameters.getParameter(InputParameters.FF_PATH_KEY));
		//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		   	WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
