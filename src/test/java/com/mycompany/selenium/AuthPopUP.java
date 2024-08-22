package com.mycompany.selenium;

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
	public void brokenUrlDemo() {
		try {
			
			driver.get("https://demoqa.com/broken");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			String url;
			for (WebElement link:links) {
				url = link.getAttribute("href");
				if (url!=null && !url.isEmpty()) {
					
				try {
					URL urlObj = new URL(url);
					HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
					/* con.setRequestMethod("HEAD"); */
					con.connect();
				if (con.getResponseCode()!=200) {
					System.out.println(url+"---"+con.getResponseCode());
				}
				con.disconnect();
				}catch(Exception e) {
					
				}
					
				}
				
			}
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception --- "+ e);
		}

	}

	@AfterTest public void tearDwon() {
		driver.close();
	}

}

