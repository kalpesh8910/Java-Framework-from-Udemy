package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//*[contains(text(),\"Register now!\")]")
	WebElement Registernow;
	// Action Methods
	public void clickRegisterNow() {
		Registernow.click();
	}

	@FindBy(id = "login-email")
	WebElement email_input;
	public void enteremail(String email) {
		email_input.sendKeys(email);
	}
	
	@FindBy(id="login-password")
	WebElement pwd;
	public void enterpassword(String pwwd)
	{
		pwd.sendKeys(pwwd);
		
	}
	
	
	
}
