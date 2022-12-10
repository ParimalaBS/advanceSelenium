package com.Ecommerce.Lawn.GenericLibrary;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.apache.hc.core5.util.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	private static final int ITestResult = 0;
	public Connection con;
	public static  ExtentHtmlReporter htmlReports;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static WebDriver driver;
	public FileUtilities fu= new FileUtilities();
	
	@BeforeSuite
	public void configDBS() throws SQLException {
		 Reporter.log("connect to database");
	     con = fu.getDatabaseData();
	     htmlReports = new ExtentHtmlReporter(AutoConstants.reportsPath);
	     htmlReports.config().setDocumentTitle("FirelawnReports");
	     htmlReports.config().setTheme(Theme.DARK);
	     reports = new ExtentReports();
	     reports.attachReporter(htmlReports);  
	}
	@BeforeMethod
	public void openAp() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("");
	}
	@AfterMethod
	public void closeApp(ITestResult res) {
		int result = res.getStatus();
		if (result==ITestResult) {
				test.log(Status.FAIL,res.getName()+"Testcase is failed ");
				test.log(Status.FAIL, res.getThrowable()+"TestCase is failed Exception");
			}
		else if(result==ITestResult) {
				test.log(Status.PASS, res.getName()+"Testcase is passed");
			}
		else if(result==ITestResult) {
				test.log(Status.SKIP, res.getName()+"Testcase is skipped");
			}
		String name = res.getName();
		if (result==2) {
			//Screenshot s = new Screenshot();
			
		}
		
		
		
		       driver.quit();
	}
	@AfterSuite
	public void closeDb() throws SQLException {
		reports.flush();
		con.close();
	}
	
	

}
