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

public class SelectMenuDemo {

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
	public void staleDemo() {
		try {
			driver.get("https://demoqa.com/select-menu");
			WebElement colorDropdown = driver.findElement(By.id("oldSelectMenu"));
			Select select = new Select(colorDropdown);
			select.selectByValue("2");
			select.selectByIndex(0);
			select.selectByVisibleText("Green");
			
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception --- "+ e);
		}
		
	}
	
	  @AfterTest public void tearDwon() {
		  driver.close();
		  }
	 
}

