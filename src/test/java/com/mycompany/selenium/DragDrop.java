package com.mycompany.selenium;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.utils.Driver;



public class DragDrop {

	WebDriver driver;

	@BeforeTest public void initiateBroswer() {

		driver = Driver.getInstance();

	}


	@Test
	public void dragDrop() throws InterruptedException, IOException {


		driver.get("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='draggable']"));
		System.out.println("Before Action");

		Actions action = new Actions(driver);
		System.out.println("Before Action");
	//	action.moveToElement(drag).clickAndHold().moveToElement(drop);	
		action.dragAndDrop(drag, drop).perform();
		System.out.println("dropped");
		action.doubleClick().perform();//Double click using action item.
		action.doubleClick(drop);//double click on the eliement
		action.sendKeys(Keys.F5);
	
		Thread.sleep(5000);
		System.out.println("After Sleep");
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		long currentTime = System.currentTimeMillis();
		String fileName = format.format(currentTime);
		String destinationPath = System.getProperty("user.dir")+"//outputs//"+fileName+".png";
		File destination = new File(destinationPath);
		FileUtils.copyFile(screenshotFile,destination);
	}

	@AfterTest public void tearDwon() {
		driver.close();
	}

}

