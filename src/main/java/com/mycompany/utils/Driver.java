package com.mycompany.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	
	public static WebDriver driver;
private Driver(){}// private constructor 

	public static WebDriver getInstance() {
		if (driver == null || ((RemoteWebDriver)driver).getSessionId() == null ) {

			switch("chrome") {
			case "chrome":
				ChromeOptions chromeOptions = new ChromeOptions();
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(chromeOptions);	
				driver.manage().window().maximize();
				break;
			case "Firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case "Edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				driver.manage().window().maximize();
				break;
			case "Headless":
				System.out.println("came here");
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);	
				break;
				default:
					throw new IllegalArgumentException("Unsupported broswer");
			}
		}
	//	WebDriverDispatcher disp = new WebDriverDispatcher(driver);
		return driver;
	}
}
