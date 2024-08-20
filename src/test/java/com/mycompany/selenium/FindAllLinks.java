package com.mycompany.selenium;

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

public class FindAllLinks {

	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void staleDemo() {
		try {
			driver.get("https://demoqa.com/");
			List<WebElement> links = driver.findElements(By.tagName("a"));
			String url;
			for (WebElement link:links) {
				url = link.getAttribute("href");
				if(url!=null && !url.isEmpty()) {
					System.out.println(url);					
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

