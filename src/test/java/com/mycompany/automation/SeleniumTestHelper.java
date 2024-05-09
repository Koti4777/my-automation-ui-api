package com.mycompany.automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.mycompany.utils.Driver;

public class SeleniumTestHelper {
	public static int retryCount = 0;
	static WebDriver driver = Driver.getInstance();
	
	
	
	public static void selectFromDropdown (WebElement element, String value, String mode) {
		int retryCount=0;;
		Select select = new Select(element);
		try {
			switch(mode) {
			case "VisableText":
			select.selectByVisibleText(value);
			break;
			case "Index":
				select.selectByIndex(Integer.parseInt(value));
				break;
				case "Value":
					select.selectByValue(value);
					break;
			}
		}catch(Exception e) {
			
			if (retryCount<3) {
				retryCount++;
				selectFromDropdown(element, value, mode);
				
			}
			throw e;
		}
	}
	
	public static void assertEquals1(Object actual, Object expected, String message) {
		/*
		 * try {
		 * com.cucumber.listener.Reporter.addScreenCaptureFromPath(getScreenshot());
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		if(null != message){
			System.out.println(message + "actual is - "+ actual + "expected is - "+expected);
			Assert.assertNotEquals(actual, expected, message);
			com.cucumber.listener.Reporter.addStepLog("<B style=\"color:green\">"+ "Expected and Actual are : "+actual + "</B>");
		}else{
			Assert.assertNotEquals(actual, expected);
			com.cucumber.listener.Reporter.addStepLog("<B style=\"color:green\">"+ "Expected and Actual are : "+actual + "</B>");
		}
		
		
	}
	
	public static void assertEquals(Object actual, Object expected, String message){
		
		/*
		 * try {
		 * com.cucumber.listener.Reporter.addScreenCaptureFromPath(getScreenshot()); }
		 * catch (IOException e) { e.printStackTrace(); }
		 */
		
		if(null != message){
			System.out.println(message + "actual is - "+ actual + "expected is - "+expected);
			Assert.assertEquals(actual, expected, message);
			com.cucumber.listener.Reporter.addStepLog("<B style=\"color:green\">"+ "Expected and Actual are : "+actual + "</B>");
		}else{
			Assert.assertEquals(actual, expected);
			com.cucumber.listener.Reporter.addStepLog("<B style=\"color:green\">"+ "Expected and Actual are : "+actual + "</B>");
		}
	}
	public static String getScreenshot(String methodName) {
		
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = sc.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/screenshots/" + methodName+"_"+dateName + ".png";
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return destination;
		
	}
}
