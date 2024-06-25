package com.mycompany.automation.pages.elements;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mycompany.utils.Driver;



/**
 * Webpage in Tools QA demo site for text box elements
 *
 */
public class TextBox
{
	private WebDriver driver;
	
   public TextBox() {
	  this.driver = Driver.getInstance();
		PageFactory.initElements(driver, this);
   }
  
   
   @FindBy(xpath = "//input[@id='userName']")
	public WebElement fullName;
   
   @FindBy(xpath = "//input[@id='userEmail']")
  	public  WebElement email;
   
   @FindBy(xpath = "//textarea[@id='currentAddress']")
 	public  WebElement currentAddress;
   
   @FindBy(xpath = "//textarea[@id='permanentAddress']")
	public  WebElement permanentAddress;
 
   @FindBy(xpath = " //button[@id='submit']")
	public WebElement submitButton;

public void submitForm() {
	
	fullName.sendKeys("Hello");
	fullName.sendKeys("fullname");
	email.sendKeys("test@gmail.com");
	currentAddress.sendKeys("current address\nline 1\nline2");
	permanentAddress.sendKeys("current addres\nline 1\n line2");
	submitButton.click();
}
}
