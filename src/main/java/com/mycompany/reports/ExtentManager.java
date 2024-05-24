package com.mycompany.reports;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.testng.IClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager implements ITestListener {

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	public static void setReport() {
		ITestResult result = null;
		String date = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date());
		String path = System.getProperty("user.dir")+"\\extentreports\\testreport-"+date+".html";
		htmlReporter = new ExtentHtmlReporter(path);
		reports = new ExtentReports();
		reports.attachReporter(htmlReporter);
		
	}
	
	public static void endReport() {
		reports.flush();
	}

	
}