package com.mycompany.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsInteraction {

	WebDriver driver;


	@BeforeTest
	public void initiateBroswer() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void iFrameInteraction() {
		driver.get("https://demoqa.com/frames");
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//System.out.println("frame 1 txt is --"+driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		//above one will fail boz we are trying to interact before switching to frame
		//updated in master
		
		driver.switchTo().frame(frame);
		System.out.println("frame 1 txt is --"+driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
	}
	@Test
	public void actionClassDemo() {
		driver.get("https://demoqa.com/frames");
		Actions actions = new Actions(driver);
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		//System.out.println("frame 1 txt is --"+driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
		//above one will fail boz we are trying to interact before switching to frame
		//updated in master
		
		driver.switchTo().frame(frame);
		System.out.println("frame 1 txt is --"+driver.findElement(By.xpath("//h1[@id='sampleHeading']")).getText());
	}
	@AfterTest
	public void tearDwon() {
		driver.close();
	}
}
