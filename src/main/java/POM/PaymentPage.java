package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	WebDriver driver;
	public PaymentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='Add Card']")
	private WebElement addCardbutton;
	
	@FindBy(xpath = "input[placeholder='John Wick']")
	private WebElement cardName;
	
	@FindBy(xpath = "//label[text()='Card Number']")
	private WebElement cardNumber;
	
	@FindBy(xpath = "//label[text()='PIN']")
	private WebElement CardPinTextField;
	
	@FindBy(xpath = "//label[text()='Expiry Month']")
	private WebElement Expirymnth;

	@FindBy(xpath = "//label[text()='Expiry Year']")
	private WebElement Expiryear;
	
	@FindBy(xpath = "//label[text()='CVV']")
	private WebElement Cvv;
	
	@FindBy(xpath = "//span[text()='Debit']/..//input[@name='radio-buttons-group']")
	private WebElement debitRadioBtn;
	
	@FindBy(xpath = "//button[text()='Add']")
	private WebElement addButton;
	
	@FindBy(xpath = "//p[text()='DEBIT']")
	private WebElement debitCardEndingRadioButton;
	
	@FindBy(xpath = "//label[text()='PIN']")
	private WebElement Pin;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitButton;
	public WebElement getAddCardbutton() {
		return addCardbutton;
	}

	public WebElement getCardName() {
		return cardName;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getCardPinTextFieldd() {
		return CardPinTextField;
	}

	public WebElement getExpirymnth() {
		return Expirymnth;
	}

	public WebElement getExpiryear() {
		return Expiryear;
	}

	public WebElement getCvv() {
		return Cvv;
	}

	public WebElement getDebitRadioBtn() {
		return debitRadioBtn;
	}

	public WebElement getAddButton() {
		return addButton;
	}

	public WebElement getDebitCardEndingRadioButton() {
		return debitCardEndingRadioButton;
	}

	public WebElement getPin() {
		return Pin;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}
	public void CardDetails(String name,String CNumber,String CPin,String mnth,String year,String Cvvnum) {
		addCardbutton.click();
		cardName.sendKeys(name);
		cardNumber.sendKeys(CNumber);
		CardPinTextField.sendKeys(CPin);
		Expirymnth.sendKeys(mnth);
		Expiryear.sendKeys(year);
		Cvv.sendKeys(Cvvnum);
	}
	public void addCardDetails(String cardPin) {
		debitRadioBtn.click();
		addButton.click();
		debitCardEndingRadioButton.click();
		Pin.sendKeys(cardPin);
		submitButton.submit();
		//return new PlaceOrderPage(driver);
	
		
		
		
		
	}

	
}
