package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSendkeys {

	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void withoutSendKeys() {
		try {
			driver.get("https://demoqa.com/text-box");
			WebElement elm = driver.findElement(By.xpath("//input[@id='userName']"));
				
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('userName').value = 'jsvalue';");
			Thread.sleep(5000);
			
		}catch(Exception e) {
			
		}
		
	}
	@Test
	public void checkBoxSelected() {
		try {
			driver.get("https://demo.automationtesting.in/Register.html");
			WebElement elm = driver.findElement(By.xpath("//input[@id='checkbox1']"));
			elm.click();
			if (elm.isSelected()) {
				System.out.println("element is checked");
			}else {
				System.out.println("element not checked");
			}
			String methodName = Reporter.getCurrentTestResult().getName();
			System.out.println("Method name is ----"+methodName);
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

