package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishlistPage {
	
	@FindBy(xpath = "//button[text()='remove from wishlist?']")
	private WebElement removeWishlistButton;
	
	public void removeSaree() {
		removeWishlistButton.click();
	}

}
