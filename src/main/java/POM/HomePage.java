package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Ecommerce.Lawn.GenericLibrary.WebDriverUtilities;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="search")
	private WebElement SearchTextField;

	@FindBy(id="search_prod")
	private WebElement SearchIcon;
	
	@FindBy(linkText =" Kids")
	private WebElement KidsOption;
	
	@FindBy(css = "a[href='/sub-category/girls-jeans']")
	private WebElement girlsJeans;
	
	@FindBy(css = "select[class='navbar_selectBlock__x8JzW']")
	private WebElement selectblockDropdwn;
	
	@FindBy(css = "button[aria-label='Account settings']")
	private WebElement AccountSettingsButton;
	
	@FindBy(xpath = "//li[text()='Wish List']")
	private WebElement WishlistButton;

	public WebElement getKidsOption() {
		return KidsOption;
	}

	public WebElement getGirlsJeans() {
		return girlsJeans;
	}

	public WebElement getSearchTextField() {
		return SearchTextField;
	}

	public WebElement getSearchIcon() {
		return SearchIcon;
	
	}
	public ElectronicsProductPage SearchElement(String productName) {
		SearchTextField.sendKeys(productName);
		SearchIcon.click();
		return new ElectronicsProductPage(driver);
	}
		public void KidsSection() {

		
	}
	
	
}
