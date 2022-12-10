package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	WebDriver driver;
	
	public SignInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="fl_email")
	private WebElement EmailTextField;
	
	@FindBy(id="fl_password")
	private WebElement passwordTextField;
	
	@FindBy(id="fl_login")
	private WebElement loginButton;
	
	
	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	
	public HomePage loginCredentials() {
		loginButton.click();
		return  new HomePage(driver);
	}
}

