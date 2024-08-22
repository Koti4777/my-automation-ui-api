package com.mycompany.selenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.utils.Driver;

public class WindowHandles {

	WebDriver driver;


	
	  @BeforeTest public void initiateBroswer() {
			/*
			 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
			 * driver.manage().window().maximize();
			 */
		  driver = Driver.getInstance();
	  
	  }
	 
	
	@Test
	public void windownHandle() {
		try {
			driver.get("https://demoqa.com/browser-windows");
			driver.findElement(By.xpath("//button[@id='windowButton']")).click();
			Set<String> windows = driver.getWindowHandles();
			for (String window:windows) {
				driver.switchTo().window(window);
			}
			String text = driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText();
			
			System.out.println("text printed-----"+text);
			
		
		}catch(Exception e) {
			
		}

	}
	
	

	@AfterTest public void tearDwon() {
		driver.close();
	}

}


