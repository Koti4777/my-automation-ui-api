package com.mycompany.automation;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.mycompany.utils.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	static WebDriver driver;
	
	public Test() {
		this.driver= Driver.getInstance();
	}

	public static void getScreenshot(String methodName) {
		driver.get("https://google.com");
		String dateName1 = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot sc = (TakesScreenshot) driver;
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/screenshots/" + methodName+"_"+dateName1 + ".png";
		System.out.println("destinationis "+destination);
		File finalDestination = new File(destination);
		try {
			FileUtils.copyFile(source, finalDestination);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		getScreenshot("test");
			
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		System.out.println(dateName);
			System.out.println(System.getProperty("user.dir"));
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-fullscreen");
			chromeOptions.addArguments("--headless");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			
			String destination = System.getProperty("user.dir") + "/screenshots/" +"1.png";
			System.out.println(destination);
			
			String destinatio1 = System.getProperty("user.dir") + "/screenshots/" +"1.jpeg";
			// Navigate to the demoqa website
			driver.get("https://www.google.com");
			//driver.quit();
			
			System.out.println(destinatio1);
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyDirectory(screenshot, new File(destinatio1));
	}

}

