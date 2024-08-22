package com.mycompany.selenium;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.automation.pages.operations.CommonOperations;
import com.mycompany.utils.Driver;

public class JavascriptDemo {

	WebDriver driver;

	  @BeforeTest public void initiateBroswer() {
			
		  driver = Driver.getInstance();
	  
	  }
	@Test
	public void javaScriptDemo() throws InterruptedException, IOException {
	
			driver.get("https://demoqa.com/text-box");
			WebElement txtField = driver.findElement(By.xpath("//input[@id='userName']"));
			WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
			
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='text';", txtField);	
		js.executeScript("arguments[0].click", submit);
		
		
	}
	
	  @AfterTest public void tearDwon() {
		  driver.close();
		  }
	 
}


