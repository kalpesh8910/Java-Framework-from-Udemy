package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AfterLoginHomePage extends BasePage{

	public AfterLoginHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="dropdownMenuButton")
	WebElement threeDot;
	public void ClickThreeDot() {
		
		threeDot.click();
	}
	
	@FindBy(xpath="//*[@id=\"sidebar-brand\"]/div/div[3]/div/div/a[1]")
	WebElement settings;
	public void ClickSettings()
	{
		settings.click();
	}
	
	@FindBy(xpath="//*[@id=\"sidebar-scroll\"]/div/ul/li[7]/a")
	WebElement signout;
	
	public boolean idsignoutExist() {
		
		boolean text = signout.isDisplayed();
		return text;
	
	}
	
	public void clicksignout() {
		
		signout.click();
	}
	
}
