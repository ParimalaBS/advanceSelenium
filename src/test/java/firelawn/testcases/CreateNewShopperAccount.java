package firelawn.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewShopperAccount {

	public static void main(String[] args) throws Throwable  {
		//open the browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//enter test url
		driver.get("https://firelawn.com/");
		//click on login button 
	    driver.findElement(By.id("fl_login_btn")).click();
	    //click on create account button
	    driver.findElement(By.id("fl_create_account")).click();
	    //Enter valid data into first name textfield
	    WebElement firstNameTextField = driver.findElement(By.cssSelector("input[id='fl_firstName_Shopper']"));
	    firstNameTextField.sendKeys("Parimala");
	    //Enter valid data into lastname textfield
	    WebElement lastNameTextField = driver.findElement(By.cssSelector("input[id='fl_lastName_Shopper']"));
	    lastNameTextField.sendKeys("pari");
	    //click on feamale radio button
	    driver.findElement(By.id("fl_female_Shopper")).click();
	    //enter data into phone number text field
	    WebElement phoneNumberTextField = driver.findElement(By.cssSelector("input[id='fl_phoneNumber_Shopper']"));
	    phoneNumberTextField.sendKeys("9620550638");
	    //Enter data into emailtextfield
	   WebElement emailTextField = driver.findElement(By.cssSelector("input[id='fl_email_Shopper']"));
	   emailTextField.sendKeys("parimalapari0829@gmail.com");
	   //Enter data into password textfield
	   WebElement passwordTextField = driver.findElement(By.cssSelector("input[id='fl_password_Shopper']"));
	   passwordTextField.sendKeys("Parimalanayak8@");
	   //Re-enter data into confirm text field
	   WebElement confirmTextField = driver.findElement(By.cssSelector("input[id='fl_confirmPassword_Shopper']"));
	   confirmTextField.sendKeys("Parimalanayak8@");
	   //checkbox
	   driver.findElement(By.id("fl_tc_Shopper")).click();
	   //click on Register button
	   WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register']"));
	   if( registerButton.isEnabled()) {
		 registerButton.click();
	   }else {
		 System.out.println("fail");
		 }
	   Thread.sleep(5000);
	   driver.quit();
	}
}
