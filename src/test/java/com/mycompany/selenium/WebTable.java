package com.mycompany.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
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
//	@Test
//	public void getTable() {
//		driver.get("https://www.w3schools.com/html/html_tables.asp");	
//		//driver.get("https://www.confirmtkt.com/train-schedule/20809-SBP-NED-S-F");
//		//driver.get("https://www.google.com");
//		List<WebElement> elementsList = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
//		System.out.println(elementsList.size());
//		List<WebElement> numberOfColums = driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr/th"));
//		System.out.println(numberOfColums.size());
//		int count = 0;
//		
//		for(int i=1;i<elementsList.size();i++) {
//			for (int j=1;j<=3;j++) {
//				String country = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
//				System.out.print(country+" ");
//				if (country.equals("UK")|| country.equals("Canada")|| country.equals("Italy")) {
//					count++;
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("Country count is "+count);
//		
//		/*
//		 * for (WebElement row:elementsList) { for (WebElement col:numberOfColums) {
//		 * System.out.print(col.getText()+" ");
//		 * 
//		 * }
//		
//			
//		} */
//	}
	@Test
	public void getTrainTimeTable() {
		driver.get("https://www.confirmtkt.com/train-schedule/20809-SBP-NED-S-F");	
		
		List<WebElement> columns = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		
		 System.out.println(columns.size());
		 System.out.println(rows.size());
		 for(WebElement col:columns) {
			System.out.print(col.getText()+" ");
		 }
		 System.out.println();
			for(int i=1;i<rows.size();i++) { 
				
				for (int j=1;j<=columns.size();j++) {
					
					System.out.print(driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+j+"]")).getText()+" ");
				}
				System.out.println();
			}
				
				
			
		 /*
		
		 * for(int i=1;i<elementsList.size();i++) { for (int j=1;j<=3;j++) { 
		 * String	 * country =
		 * driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+
		 * j+"]")).getText(); System.out.print(country+" "); if (country.equals("UK")||
		 * country.equals("Canada")|| country.equals("Italy")) { count++; } }
		 * System.out.println(); } System.out.println("Country count is "+count);
		 */
		
		
	}
	@AfterTest
	public void tearDwon() {
		driver.close();
	}
}



