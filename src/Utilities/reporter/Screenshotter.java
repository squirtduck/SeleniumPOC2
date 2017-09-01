package Utilities.reporter;


import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import Utilities.environmentConstants.InputParameters;


public class Screenshotter {
	
	private String filepath;
	private int iterator;
	private String screenShotFileExtension;
	
	public Screenshotter(WebDriver driver, String testName )
	{
		filepath = Screenshotter.filePathConstructor(driver, testName);
		iterator = 0;
		screenShotFileExtension = ".png";
	}
	
	public void takeTestScreenshot(WebDriver driver, String stepDescription)
	{
		iterator++;
	
		//Screenshotter.takeSnapShot(driver, filepath + testCaseName + "-" + iterator + screenShotFileExtension);
		
		String filename = Screenshotter.fileNameConstructor ( iterator, stepDescription, screenShotFileExtension);
		Screenshotter.takeSnapShot(driver, filepath, filename);
	}


    /**

     * This function will take screenshot

     * @param webdriver

     * @param fileWithPath

     * @throws Exception

     */

	public static void takeSnapShot(WebDriver webdriver, String path, String name)
    //public static void takeSnapShot(WebDriver webdriver,String fileWithPath)
    {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                //File DestFile=new File(fileWithPath);
                String filepath = path+name;
                File DestFile = new File(filepath);
                DestFile.getParentFile().mkdirs();
                try {
					DestFile.createNewFile();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

                //Copy file at destination

                try {
					FileUtils.copyFile(SrcFile, DestFile);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

    }
    
    public static String filePathConstructor(WebDriver driver, String testName)
    {
    	DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy, HHmmss");
    	Date date = new Date();
    	
    	Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        String browserName = cap.getBrowserName().toLowerCase();
    		
    	//String output = Parameters.getParameter(Parameters.SCREENSHOT_DIRECTORY_PATH_KEY) + browserName + "," + dateFormat.format(date);
        String testdateDirectoryName = testName + ", browser("+ browserName+")-" + dateFormat.format(date) + "\\";
       
        
    	String output = System.getProperty("user.dir") + InputParameters.getParameter(InputParameters.SCREENSHOT_DIRECTORY_PATH_KEY) + testdateDirectoryName;
    	
    	return output;
    	
    	
    }
    
    
    public static String fileNameConstructor(int stepNumber, String descriptionOfStep, String fileExtension)
    {
    	
        String step = "Step "+stepNumber+"-";
        
    	return step+descriptionOfStep+fileExtension;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    @Test
//    public void testGuru99TakeScreenShot() throws Exception{
//
//		WebDriver driver ;
//    	System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//    	driver = new FirefoxDriver();
//
//        //goto url
//
//        driver.get("http://demo.guru99.com/V4/");
//        this.takeSnapShot(driver, "C:\\Users\\marqu\\workspace\\POCSeleniumFramework\\screenshots\\test.png") ;   
//
//    }
 
    
}
