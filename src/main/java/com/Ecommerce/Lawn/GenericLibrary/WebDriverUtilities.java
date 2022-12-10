package com.Ecommerce.Lawn.GenericLibrary;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 public class WebDriverUtilities {
 public void dropdown(WebElement ele,String text) {
	 Select select=new Select( ele);
	 select.selectByVisibleText(text);
	}
 public void mouseHover(WebDriver driver,WebElement ele) {
	Actions actions = new  Actions(driver);
	actions.moveToElement(ele).perform();
 }
 public void dragAndDrop(WebDriver driver,WebElement src,WebElement dest) {
	 Actions actions = new  Actions(driver);
	 actions.dragAndDrop(src, dest).perform();
 }
 public void rightClick(WebDriver driver,WebElement ele) {
	 Actions actions = new  Actions(driver);
	 actions.contextClick(ele).perform();
 }
 public void doubleClick(WebDriver driver,WebElement ele) {
	 Actions actions = new  Actions(driver);
	 actions.doubleClick(ele).perform();
	 
 }
 public void swicthFrames(WebDriver driver) {
	 driver.switchTo().frame(0);
 }
 public void swicthbBackFrames(WebDriver driver) {
	 driver.switchTo().defaultContent();
	 }
 public void alertPopupWithAccept(WebDriver driver) {
	 driver.switchTo().alert().accept();
 }
 public void alertPopupWithdismiss(WebDriver driver) {
	 driver.switchTo().alert().dismiss();
 }
 public void switchTabs(WebDriver driver) {
	 Set<String> child= driver.getWindowHandles();
	for(String b:child) {
		driver.switchTo().window(b);
	}
 }
	 public void scrollBar(WebDriver driver,int x,int y) {
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("windows.scrollBy("+ x +", "+ y +")");
	 }
	 public void jsClick(WebDriver driver) {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
	}
	 
 }









