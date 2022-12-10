package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(id="fl_login_btn")
	private WebElement loginOption;

	public WebElement getLoginOption() {
		return loginOption;
	}
	public SignInPage Login() {
		loginOption.click();
		return new  SignInPage(driver);
	}
	
	

}
