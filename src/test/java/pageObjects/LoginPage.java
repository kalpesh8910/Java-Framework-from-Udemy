package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub		 
	}
	
	@FindBy(id="login-email")
	WebElement username;
	public void enterusername(String email){
		
		username.sendKeys(email);
	}
	
	@FindBy(id="login-password")
	WebElement password;
	public void enterpss(String pwd) {
		
		password.sendKeys(pwd);
	}
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement loginBtn;
	public void Clicklogin() {
		
		loginBtn.click();
	}
}
