package com.Ecommerce.Lawn.GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {
	public  void getPhoto(WebDriver driver,String name) throws IOException {
		Date date = new Date();
		String currentDate = date.toString().replaceAll(":", "-");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(AutoConstants.photoPath+ currentDate+name+".png");
		FileUtils.copyFile(src, dest);
		
	}

}
