package com.mycompany.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlTest {

	WebDriver driver;


	/*
	 * @BeforeTest public void initiateBroswer() {
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * driver.manage().window().maximize();
	 * 
	 * }
	 */
	@Test
	public void findAllLinks() throws IOException {
	
			String url = "https://www.google.com";
			URL  urlObj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
			int responseCode = con.getResponseCode();
			
			if (responseCode==200) {
				System.out.println("url is working");
			}else {
				System.out.println("url is not working");
			}
			
		

	}

	/*
	 * @AfterTest public void tearDwon() { driver.close(); }
	 */

}

