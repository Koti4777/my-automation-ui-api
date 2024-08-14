package com.mycompany.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
//
	@Test
	public void xpathVerification() {
		driver.get("https://demo.automationtesting.in/Register.html");	
		
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='col-md-4 col-xs-4 col-sm-4']/input"));
		
		for (WebElement elm:elements) {
			System.out.println(elm.getAccessibleName());
		}
		
	}
	@AfterTest
	public void tearDwon() {
		driver.close();
	}
}



