package com.mycompany.automation;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mycompany.reports.ExtentManager;

public class TestNGClass1 {

	 @BeforeClass
	  public void beforeSuite() {
	    ExtentManager.setReport();
	  }

	  @AfterSuite
	  public void endReport() {
	   
	    ExtentManager.endReport();
	  }
	@Test
	public void test1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(true);
	}
	@Test
	public void test3() {
		Assert.assertTrue(true);
	}
}
