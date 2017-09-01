package Utilities.browsers;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utilities.environmentConstants.InputParameters;

public class browserEdge {
	
	public static WebDriver initializeEdgeDriver()
	{

		String edgePath = System.getProperty("user.dir") + InputParameters.getParameter(InputParameters.IE_PATH_KEY);
	    File file = new File(edgePath);
	    System.setProperty("webdriver.edge.driver", file.getAbsolutePath());
	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    return driver;
	    
	}

}
