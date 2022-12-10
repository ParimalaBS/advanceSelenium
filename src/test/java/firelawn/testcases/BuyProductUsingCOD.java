package firelawn.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyProductUsingCOD {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://firelawn.com/");
		//click on login button 
	    driver.findElement(By.id("fl_login_btn")).click();
	    //enter data into email textfield 
	    WebElement emailTextField = driver.findElement(By.id("fl_email"));
	    emailTextField.sendKeys("parimalapari0829@gmail.com");
	    //enter data into password textfield
	    WebElement passwordTextField = driver.findElement(By.id("fl_password"));
	    passwordTextField.sendKeys("Parimalanayak8@");
	    //click on login button
	    driver.findElement(By.id("fl_login")).click();
	    //Thread.sleep(5000);
	    //click on women category 
	    WebElement womenOption = driver.findElement(By.xpath("//a[text()='Women']"));
	    Actions actions = new Actions(driver);
        actions.moveToElement(womenOption).perform();
        //click on Tshirt subcategory
        driver.findElement(By.cssSelector("a[href='/sub-category/women-tshirt']")).click();
        WebElement addToCartButton = driver.findElement(By.xpath("//span[text()='FOREVER 21  Casual Regular Sleeves ...']/../..//button[text()='add to cart']"));
        addToCartButton.click();
	}

}
