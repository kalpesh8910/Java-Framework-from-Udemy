package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass {

	@Test(groups = {"Regression","Master"})
	void test_account_Registration()
	{
		logger.debug("application logs....");
		logger.info("*** Starting TC_001_AccountRegistrationTest ***");
		
		try {
		HomePage hp = new HomePage(driver);
		
		hp.clickRegisterNow();
		Thread.sleep(5000);
		logger.info("Clicked on register now button.");
		
		/*
		 * hp.enteremail("john@yopmail.com"); // random email Thread.sleep(5000);
		 * 
		 * driver.navigate().back(); Thread.sleep(3000);
		 * 
		 * driver.navigate().forward(); Thread.sleep(3000);
		 */
		
		AccountRegistrationPage ragpage = new AccountRegistrationPage(driver);
		
		hp.enteremail("john@yopmail.com"); // random email
		Thread.sleep(5000);
		logger.info("Enter email address");
		
		ragpage.ClickGetStarted();
		Thread.sleep(5000);
		logger.info("Clicked on get started");
			
		ragpage.ContinueBtn();
		Thread.sleep(5000);
		logger.info("Clicked on continue button");
		
		ragpage.setName("johnathan");
		Thread.sleep(35000);
		
		ragpage.setCompanyName("graphic");
		Thread.sleep(5000);
		logger.info("Enter company name");
		
		String password = randomAlphaNumeric();
				
		ragpage.setpassword(password);
		Thread.sleep(5000);
		logger.info("Enter password");
		
		ragpage.setConfiromationpwd(password);
		Thread.sleep(5000);
		logger.info("Enter conformation password");
		
		ragpage.ContinueBtn();
		Thread.sleep(5000);
		logger.info("Clicked on continue button");
		
		
		ragpage.CreateAccountBtn();
		Thread.sleep(5000);
		logger.info("Clicked on create account button");
				
		String confmsg = ragpage.getConfirmationMsg();
		
		Assert.assertEquals(confmsg, "Account created successfully", "Not getting expected message.");
		Thread.sleep(5000);
		logger.info("Verifed the Account created successfully message");
		
		ragpage.clickhereTologin();
		Thread.sleep(5000);	
		logger.info("Clicked on click here to login button");
		
		}catch(Exception e)
		
		{
			logger.error("test failed");
			Assert.fail();
		}
		
		logger.info("*** Finished TC_001_AccountRegistrationTest ***");
		
	}
}
