package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo1 {

	@BeforeClass
	public void beforeClassTest() {
		System.out.println("Before class Demo Class 2");
	}

	@AfterClass
	public void afterClassTest() {
		System.out.println("After class Demo class 2");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After test Demo Class 2");
	}

	
	@Test
	public void testcaseOneClass1() {
		System.out.println("Test cases 1 in class 2");
	}
	
	@Test
	public void testcaseTwoClass2() {
		System.out.println("Test cases 2 in class 2");
	}
	
	@BeforeTest
	public void beforeTestClass2() {
		System.out.println("Before test  in class 2");
	}
	@BeforeSuite
	public void beforeSuiteClass2() {
		System.out.println("Before suite class 2");
	}
	@AfterSuite
	public void afterSuiteClass2() {
		System.out.println("After suite class 2");
	}
}
