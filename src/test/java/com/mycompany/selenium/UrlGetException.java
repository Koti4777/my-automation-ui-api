package com.mycompany.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UrlGetException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = null;
		
		try {
			System.out.println("came to try");
			 WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.quit();
		} 
		
	}

}
