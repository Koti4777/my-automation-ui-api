package com.mycompany.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mycompany.utils.Driver;

public class Waits {
public static WebDriver driver;

	public static void main(String[] args) {
		driver = Driver.getInstance();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		 WebDriverWait wait = new WebDriverWait(driver, null, null);
		 WebElement elm =wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yourElementId")));
		 elm.click();
		 
		

		
		
	}
}
