package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AfterLoginHomePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC_002_VerifySignout extends BaseClass{

	@Test(groups = {"Sanity","Master"})
	public void test_login() throws InterruptedException
	{
		try {
		logger.info("***Starting TC_002_Login Test***");
				
		LoginPage lp = new LoginPage(driver);
		
		// Enter user name 
		lp.enterusername(rb.getString("email")); // get it from config.propertied file
		Thread.sleep(5000);
		
		// Enter password
		lp.enterpss(rb.getString("password")); 
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
		Assert.assertEquals(targetpage, true);
		Thread.sleep(5000);
		
		}catch(Exception e) {
			Assert.fail();
		}
		/*
		 * home.clicksignout(); logger.info("***TC_002 finished***");
		 */
		
		
	}
}
