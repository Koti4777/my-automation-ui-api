package com.mycompany.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			// Navigate to the demoqa website
			driver.get("https://www.demoqa.com");
			
			//driver.quit();
	}

}
