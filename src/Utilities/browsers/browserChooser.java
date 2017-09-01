package Utilities.browsers;

import org.openqa.selenium.WebDriver;


public class browserChooser {
	public static WebDriver initializeDriverFromInput(String browserType)
	{
		WebDriver driver ;
		switch(browserType)
		{
		case "chrome": driver = browserChrome.initializeChromeDriver();
			break;
		case "firefox": driver = browserFirefox.initializeFireFoxDriver();
			break;
		case "edge": driver = browserEdge.initializeEdgeDriver();
			break;
		case "ie": driver = null;
			break;
		case "droid": driver = null;
			break;
		default: driver = null;
			break;
		}
		return driver;
	}

}
