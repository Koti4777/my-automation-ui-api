package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementDemo {

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
			driver.get("https://demoqa.com/text-box");
			WebElement elm = driver.findElement(By.xpath("//input[@id='userName']"));
			System.out.println(elm.getAttribute("value"));

			elm.sendKeys("Hello");

			Thread.sleep(5000);
			driver.navigate().refresh();
			elm.sendKeys("Newstring");
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception --- "+ e);
		}

	}
	@AfterTest
	public void tearDwon() {
		driver.close();
	}
}
