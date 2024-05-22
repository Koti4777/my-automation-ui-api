package com.mycompany.automation;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mycompany.utils.Driver;

/**
 * Unit test for simple App.
 */
public class AppTest {
WebDriver driver;
ExtentReports report;
public AppTest() {
	this.driver=Driver.getInstance();
}

	@Test
	public void shouldAnswerWithTrue() {

		driver.get("https://www.google.com");
		SeleniumTestHelper.assertEquals("Hello", "Hello", null);
	}

	@AfterTest
	 
	 public void report(ITestResult result) {
		ExtentReports report = new ExtentReports();
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\extentreports\\"+this.getClass()+".html");
		report.attachReporter(htmlReport);
		report.getClass();
		
	}
	@Test
	public void sampleText() {
		/*
		 * ChromeOptions chromeOptions = new ChromeOptions();
		 * WebDriverManager.chromedriver().setup(); WebDriver driver = new
		 * ChromeDriver(chromeOptions); driver.manage().window().maximize();
		 */
		String methodName = new Object(){}.getClass().getEnclosingMethod().getName();
		driver.get("https://demoqa.com/elements");
		SeleniumTestHelper.getScreenshot(methodName);
	
		System.out.println("Method name is "+methodName);
		
	}

	
}