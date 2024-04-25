package com.mycompany.utils;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {

	public static WebDriver driver;
	

	public static WebDriver getInstance() {
		if (driver == null || ((RemoteWebDriver) driver).getSessionId() == null ) {

			switch("chrome") {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				
				break;
			case "firefox":
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.get("http://www.kabum.com");
				break;
			case "ie":
				driver = new ChromeDriver();
				break;
			default:
				driver = new ChromeDriver();
			}
		}

		return driver;
	}
}
