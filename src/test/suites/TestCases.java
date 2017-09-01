package test.suites;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;




import org.openqa.selenium.WebDriver;

import test.individual.*;
import Utilities.browsers.*;
import Utilities.environmentConstants.InputParameters;
import Utilities.reporter.JUnitHTMLReporter;



public class TestCases extends JUnitHTMLReporter{
	
	WebDriver ffBrowser;
	WebDriver edgeBrowser;
	WebDriver chromeBrowser;

	@Before
	public void setupBrowsers()
	{
//		chromeBrowser = browserChrome.initializeChromeDriver();
//		edgeBrowser = browserEdge.initializeEdgeDriver();
//		
		ffBrowser = browserFirefox.initializeFireFoxDriver();
		
	}

	
	@Test
	public void Demo001ValidateSalesforceHomepage()
	{
		Demo001ValidateSalesforceHomepage test = new Demo001ValidateSalesforceHomepage();
		
		if(InputParameters.getTest(InputParameters.TEST_DEMO001_KEY).equals("T"))
		{
			test.Demo001_run(ffBrowser);
		}
			
				
	}
	
	@Test
	public void Demo002ValidateSalesforceLogin()
	{
		Demo002ValidateSalesforceLogin test = new Demo002ValidateSalesforceLogin();
		
		if(InputParameters.getTest(InputParameters.TEST_DEMO002_KEY).equals("T"))
		{
			test.Demo002_run(chromeBrowser);
		}
			
				
	}
	
	@Test
	public void Demo003FillOutNewSalesLead()
	{
		Demo003FillOutNewSalesLead test = new Demo003FillOutNewSalesLead();
		
		if(InputParameters.getTest(InputParameters.TEST_DEMO003_KEY).equals("T"))
		{
			test.Demo003_run(ffBrowser);
		}
					
	}
	
	@Test
	public void Demo004ActualHomepageTitleDoesNotMatchExpected()
	{
		Demo004ActualHomepageTitleDoesNotMatchExpected test = new Demo004ActualHomepageTitleDoesNotMatchExpected();
		
		if(InputParameters.getTest(InputParameters.TEST_DEMO004_KEY).equals("T"))
		{
			test.Demo004_run(ffBrowser);
		}
					
	}
	
	
	
	@After
	public void clean_up()
	{
		
		ffBrowser.close();
//		chromeBrowser.close();
//		edgeBrowser.close();
	}
	

}
