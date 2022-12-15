package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AfterLoginHomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;
import utilities.DataProviders;

public class TC_003_LoginDDT extends BaseClass{

	@Test(dataProvider="LoginData", dataProviderClass = DataProviders.class) // data provider in another class
	public void test_loginDDT(String email, String pwd, String exp) throws InterruptedException
	{
		logger.info("****starting TC_003_LoginDDT*****");
	
		try
		{
	
		LoginPage lp = new LoginPage(driver);
		
		// Enter user name 
		lp.enterusername(email); // get it from config.propertied file
		Thread.sleep(5000);
		
		// Enter password
		lp.enterpss(pwd); 
		Thread.sleep(5000);
		
		// Click on login button
		lp.Clicklogin();
		Thread.sleep(5000);
		
		AfterLoginHomePage home = new AfterLoginHomePage(driver);
		
		// Click on three dot
		home.ClickThreeDot();
		Thread.sleep(8000);
		
		home.ClickSettings();
		
		// Verify sign out text
		boolean targetpage = home.idsignoutExist();
		
		if(exp.equals("Valid"))
		{
			if(targetpage==true)
			{
				home.clicksignout();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
				
		if(exp.equals("Invalid"))
		{
			if(targetpage==true)
			{
				home.clicksignout();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
		
		}catch(Exception e)
			{
				Assert.fail();
			}
		
		logger.info("****Finished TC_003_LoginDDT*****");
		
	}
	
}
