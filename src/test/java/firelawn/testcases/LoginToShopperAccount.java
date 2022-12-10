package firelawn.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginToShopperAccount {

	public static void main(String[] args) {
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
	    driver.quit();
}

}
