package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="buynow_fl")
	private WebElement BuyNowbutton;
	
	@FindBy(xpath="//button[.='Remove from cart']")
	private WebElement RemoveCartButton;
	
	@FindBy(xpath = "//button[.='Continue Shopping']")
	private WebElement continueShoppingButton;
	
	public WebElement getBuyNowbutton() {
		return BuyNowbutton;
	}

	public WebElement getRemoveCartButton() {
		return RemoveCartButton;
	}
	
	public AddressPage buyProduct() {
		BuyNowbutton.click();
		return new  AddressPage(driver);
	}
	
	public HomePage JeansShopping() {
		continueShoppingButton.click();
		return new HomePage(driver);
	}
	
	
	

}
