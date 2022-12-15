package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	// Elements
		@FindBy(xpath = "//*[contains(text(),\" Get Started \")]")
		WebElement GetStarted;

		@FindBy(xpath = "//*[contains(text(),\"Continue\")]")
		WebElement continueBtn;

		@FindBy(name = "name")
		WebElement name;
		
		@FindBy(name = "companyName")
		WebElement companyname;

		@FindBy(name = "password")
		WebElement password;

		@FindBy(name = "confirmPassword")
		WebElement confpassword;

		@FindBy(xpath = "//*[contains(text(),\"Create Account\")]")
		WebElement createAccount;

		@FindBy(xpath = "//*[contains(text(),\"Account created successfully\")]")
		WebElement successmsg;

		@FindBy(xpath = "//*[contains(text(),\"Click here to Login\")]")
		WebElement ClickheretoLogin;

		
		public void ClickGetStarted() {
			GetStarted.click();

		}
		
		public void ContinueBtn() {
			continueBtn.click();
		}
		
		public void setName(String Name) {
			name.sendKeys(Name);

		}

		public void setCompanyName(String CompanyName) {
			companyname.sendKeys(CompanyName);

		}

		public void setpassword(String pwd) {
			password.sendKeys(pwd);

		}

		public void setConfiromationpwd(String conFPASsword) {
			confpassword.sendKeys(conFPASsword);

		}

		public void CreateAccountBtn() {
			createAccount.click();

		}

		public void clickhereTologin() {
			//sol1 
			ClickheretoLogin.click();
			
			//sol2 
			//btnContinue.submit();
			
			//sol3
			//Actions act=new Actions(driver);
			//act.moveToElement(btnContinue).click().perform();
						
			//sol4
			//JavascriptExecutor js=(JavascriptExecutor)driver;
			//js.executeScript("arguments[0].click();", btnContinue);
			
			//Sol 5
			//btnContinue.sendKeys(Keys.RETURN);
			
			//Sol6  
			//WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
			//mywait.until(ExpectedConditions.elementToBeClickable(btnContinue)).click();
			
		}

		public String getConfirmationMsg() {
			try {
				return (successmsg.getText());
			} catch (Exception e) {
				return (e.getMessage());

			}

		}
}
