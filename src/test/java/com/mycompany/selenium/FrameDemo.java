package com.mycompany.selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.utils.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameDemo {

	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		/*
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().window().maximize();
		 */
Driver.getInstance();
	}
	@Test
	public void frameDemo() {
		try {
			driver.get("https://demoqa.com/frames");
			driver.switchTo().frame(0);
			
			
		}catch(Exception e) {
			
		}
		
	}
	
	  @AfterTest public void tearDwon() {
		  driver.close();
		  }
	 
}

