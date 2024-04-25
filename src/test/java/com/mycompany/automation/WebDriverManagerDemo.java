package com.mycompany.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static void main(String[] args) {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().driverVersion("85.0.4183.38").setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		// Navigate to the demoqa website
		driver.get("https://www.demoqa.com");
		
		driver.quit();

	}

}