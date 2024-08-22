package com.mycompany.selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.utils.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopUP {

	WebDriver driver;


	
	  @BeforeTest public void initiateBroswer() {
			/*
			 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			 * driver.manage().window().maximize();
			 */
		  driver = Driver.getInstance();
	  
	  }
	 
	
	@Test
	public void authPopDemo() {
		try {
			//https://the-internet.herokuapp.com/basic_auth
			String username ="admin";
			String password = "admin";
			driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		String actualText = driver.findElement(By.xpath("//div[@id='content']/div/p")).getText().trim();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "Congratulations! You must have the proper credentials.");
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception --- "+ e);
		}

	}

	@AfterTest public void tearDwon() {
		driver.close();
	}

}

