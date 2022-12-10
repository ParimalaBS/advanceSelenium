package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectronicsProductPage {
	WebDriver driver;
	
	public WebElement getWhislistIcon() {
		return WhislistIcon;
	}


	public ElectronicsProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='APPLE iPhone 14 Pro']")
	private WebElement iphoneProductName;
	
	@FindBy(xpath = "//button[text()='add to cart']")
	private WebElement jeansAddtoCartButton;
	
	
	@FindBy(xpath="//span[text()='APPLE iPhone 14 Pro']/../..//button[text()='add to cart']")
	private WebElement  addTocartButton;
	
	
	@FindBy(xpath="//a[@class='navbar_cartIcon__Lqbph active']")
	private WebElement cartOption;
	
	@FindBy(xpath = "//span[text()='rust orange tussar saree']/../..//*[@data-testid='FavoriteIcon']")
	private WebElement WhislistIcon;
	
    public WebElement getProductName() {
		return iphoneProductName;
	}


	public WebElement getJeansAddtoCartButton() {
		return jeansAddtoCartButton;
	}


	public WebElement getAddTocartButton() {
		return addTocartButton;
	}
	
	public WebElement getcartOption() {
		return cartOption;
    }	
	 public CartPage AddToCartProduct() {
		 addTocartButton.click();
		 cartOption.click();
		 return new CartPage(driver);
	 }
	 public CartPage AddToCartJesans() {
		 jeansAddtoCartButton.click();
		 cartOption.click();
		 return new CartPage(driver);
	 }
	
	
	
	
	
	

}
