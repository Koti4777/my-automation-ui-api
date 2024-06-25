package com.mycompany.reports;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager implements ITestListener {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"//extentreports//"+new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date())+".html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	
	}
	
	public static void endReport() {
		extent.flush();
	}

}