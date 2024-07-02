package com.mycompany.automation.pages.operations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mycompany.automation.pages.elements.TextBox;
import com.mycompany.utils.Driver;

public class TextBoxOperations extends CommonOperations {
	WebDriver driver;
	TextBox textBox = new TextBox();
	
	public TextBoxOperations() {
		this.driver= Driver.getInstance();
	}

	public void fillTheForm() throws IOException {
	
	textBox.fullName.sendKeys("Hello");
	textBox.fullName.sendKeys("fullname");
	textBox.email.sendKeys("test@gmail.com");
	textBox.currentAddress.sendKeys("current address\nline 1\nline2");
	textBox.permanentAddress.sendKeys("current addres\nline 1\n line2");
	takeScreenShot();
	
	//textBox.submitButton.click();
	}
	
}
