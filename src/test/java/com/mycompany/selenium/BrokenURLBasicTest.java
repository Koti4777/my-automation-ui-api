package com.mycompany.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrokenURLBasicTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver =  new ChromeDriver();
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
		System.out.println(((RemoteWebDriver)driver).getSessionId());
		
		driver.quit();
	}

}
