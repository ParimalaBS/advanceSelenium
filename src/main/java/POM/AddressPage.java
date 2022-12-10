package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {
	WebDriver driver;
	
	public AddressPage(WebDriver driver) {
    PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "a[href='/addressform']")
	private WebElement addNewAddressLink;
	
	@FindBy(css = "[name='address']")
	private WebElement addressRadioButton;
	
	@FindBy(xpath = "//button[text()='Proceed']")
	private WebElement proceedButton;
	   
	@FindBy(xpath="//input[@placeholder='John Doe']")
	private WebElement nameTextField;
	
	@FindBy(xpath="/input[@placeholder='eg-142/87, ABC Apartment']")
	private WebElement houseInfoTextfield;
	
	@FindBy(xpath="//input[@placeholder='eg-4th streetInfo']")
	private WebElement streetTextfield;
	

	@FindBy(xpath="//input[@placeholder='eg-near This and That']")
	private WebElement landmarkTextfield;
	
	@FindBy(xpath="(//select[@id='demo-simple-select-placeholder-label'])[1]")
	private WebElement countryDrpDown;
	
	@FindBy(xpath="(//select[@id='demo-simple-select-placeholder-label'])[2]")
	private WebElement StateDrpDown;
	
	@FindBy(xpath="(//select[@id='demo-simple-select-placeholder-label'])[1]")
	private WebElement cityDrpDown;
	
	@FindBy(id="outlined-adornment-pincode")
	private WebElement pincodeTextfield;
	
	@FindBy(xpath="//input[@placeholder='9876543210']")
	private WebElement phoneTextField;
	
	@FindBy(xpath = "//button[text()='Add Address']")
	private WebElement addAddressButton;	
     
	public WebElement getAddNewAddressLink() {
		return addNewAddressLink;
	}

	public WebElement getAddressRadioButton() {
		return addressRadioButton;
	}

	public WebElement getNameTextField() {
		return nameTextField;
	}

	public WebElement getHouseInfoTextfield() {
		return houseInfoTextfield;
	}

	public WebElement getStreetTextfield() {
		return streetTextfield;
	}

	public WebElement getLandmarkTextfield() {
		return landmarkTextfield;
	}

	public WebElement getCountryDrpDown() {
		return countryDrpDown;
	}

	public WebElement getStateDrpDown() {
		return StateDrpDown;
	}

	public WebElement getCityDrpDown() {
		return cityDrpDown;
	}

	public WebElement getPincodeTextfield() {
		return pincodeTextfield;
	}

	public WebElement getPhoneTextField() {
		return phoneTextField;
	}

	public WebElement getAddAddressButton() {
		return addAddressButton;
	}
	public void DeliveryAddress(String name,String house,String street,String landmark) {
		addNewAddressLink.click();
		nameTextField.sendKeys(name);
		houseInfoTextfield.sendKeys(house);
		streetTextfield.sendKeys(street);
		landmarkTextfield.sendKeys(landmark);
	}
	
	public PaymentPage details(String pin,String pnumber) {
		pincodeTextfield.sendKeys(pin);
		phoneTextField.sendKeys(pnumber);
		addAddressButton.click();
		addressRadioButton.click();
		proceedButton.click();
		return new PaymentPage(driver);
	}
		
}

