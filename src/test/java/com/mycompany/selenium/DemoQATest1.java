package com.mycompany.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.mycompany.automation.pages.operations.TextBoxOperations;
import com.mycompany.utils.Driver;

public class DemoQATest1 {
	WebDriver driver;
	TextBoxOperations textBoxOperations = new TextBoxOperations();
	
	public DemoQATest1() {
		this.driver= Driver.getInstance();
	}	

@BeforeTest
public void navigateToUrl() {
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	
	
}	
@Test
	public void fillTheForm() throws IOException {
	
	textBoxOperations.fillTheForm();
	
	}
@AfterTest
public void close() {
	driver.close();
}
}
