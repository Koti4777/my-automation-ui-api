package com.mycompany.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.utils.Driver;



public class BrokenURLs {

	WebDriver driver;
	
	  @BeforeTest public void initiateBroswer() {
			
		  driver = Driver.getInstance();
	  
	  }



	 
	 
	
	@Test
	public void brokenUrl() throws InterruptedException, IOException {
	
			
			driver.get("https://demoqa.com/broken");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			for (WebElement link:links) {
			String url = link.getAttribute("href");
				if (url!=null && !url.isEmpty()) {
					URL  urlObj = new URL(url);
					HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
					int responseCode = con.getResponseCode();
					if (responseCode!=200) {
						System.out.println("Broken url - "+url+"--"+responseCode);
					}
					
				}
				
			}	
		
	}

	@AfterTest public void tearDwon() {
		driver.close();
	}

}

