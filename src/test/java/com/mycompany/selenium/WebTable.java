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

public class WebTable {
	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void getTable() {
		driver.get("https://www.w3schools.com/html/html_tables.asp");		
		//driver.get("https://www.google.com");
		List<WebElement> elementsList = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
		System.out.println(elementsList.size());
		List<WebElement> numberOfColums = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));
		System.out.println(numberOfColums.size());
		int count = 0;
		
		for(int i=1;i<elementsList.size();i++) {
			for (int j=1;j<=3;j++) {
				String country = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
				System.out.print(country+" ");
				if (country.equals("UK")|| country.equals("Canada")) {
					count++;
				}
			}
			System.out.println();
		}
		System.out.println("Country count is "+count);
		
		/*
		 * for (WebElement row:elementsList) { for (WebElement col:numberOfColums) {
		 * System.out.print(col.getText()+" ");
		 * 
		 * }
		
			
		} */
	}
	@AfterTest
	public void tearDwon() {
		driver.close();
	}
}



