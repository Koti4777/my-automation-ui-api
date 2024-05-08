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

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

	WebDriver driver = null;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		System.out.println(dateName);
			System.out.println(System.getProperty("user.dir"));
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-fullscreen");
			chromeOptions.addArguments("--headless");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
		
		
			
			String filepath = System.getProperty("user.dir")+"\\screenshots\\1.jpeg";
			// Navigate to the demoqa website
			driver.get("https://www.google.com");
			//driver.quit();
			
			System.out.println(filepath);
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyDirectory(screenshot, new File(filepath));
	}

}

