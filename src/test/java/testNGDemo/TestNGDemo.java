package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.mycompany.reports.ExtentManager;
import com.mycompany.reports.ExtentReportListener;

public class TestNGDemo{
	ExtentTest test;
	ExtentReports report;



	@BeforeSuite
	public void beforeSuite() {
		ExtentManager.setExtent();
		System.out.println("SetExtent exeucted");
	}

	@AfterSuite
	public void afterSuite() {
		// service.shutdown();
		ExtentManager.endReport();
		System.out.println("End report exeucted");
	}
	@Test
	public void test1Class1() {

		
	}

	@Test
	public void test2Class1() {

		System.out.println("Test 2 in class 1");
	}

	@Test
	public void test3Class1() { 

		Assert.assertEquals("Completed", "Accepted", "Verification of the status");
	}

	@BeforeClass
	public void beforeClassTestClassOne() {
		System.out.println("Before class Demo class 1");
	}

	@AfterClass
	public void afterClassTestClassOne() {
		System.out.println("After class Demo Class 1");
	}



	@BeforeMethod
	public void beforeMethodClassone(){
		System.out.println("Before method Demo Class 1");
	}

	@AfterMethod
	public void afterMethodClassOne() {
		System.out.println("After Method Demo Class 1");
	}
	@BeforeTest
	public void beforeTestClassone(){
		System.out.println("Before test Demo Class 1");
	}
	@AfterTest
	public void afterTestClassone(){
		System.out.println("After test Demo Class 1");
	}

}
