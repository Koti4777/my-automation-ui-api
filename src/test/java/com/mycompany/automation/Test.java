package com.mycompany.automation;


import java.io.File;
import java.io.IOException;

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
		
			
			
			System.out.println(System.getProperty("user.dir"));
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--start-fullscreen");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			
			
			// Navigate to the demoqa website
			driver.get("https://www.google.com");
			//driver.quit();
			String filepath = System.getProperty("user.dir")+"/screenshots";
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyDirectory(screenshot, new File(filepath));
	}

}

