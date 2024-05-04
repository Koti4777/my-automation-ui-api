package com.mycompany.automation;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.utils.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest {
WebDriver driver;


	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {

		assertTrue(true);
	}

	
	  @BeforeTest public void setupDriver() {
	  
		  
	  
	  }
	 
	@Test
	public void sampleText() {
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(chromeOptions); driver.manage().window().maximize();
		 */
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		driver.findElement(By.id("userName")).sendKeys("usernae");
		
	}

	@Test
	public void alertClass() {
		
	}
}
