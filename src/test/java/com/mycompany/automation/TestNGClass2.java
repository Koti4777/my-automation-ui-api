package com.mycompany.automation;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.mycompany.reports.ExtentManager;

public class TestNGClass2 {
	
	 @BeforeClass
	  public void beforeSuite() {
	    ExtentManager.setReport();
	  }

	  @AfterSuite
	  public void endReport() {
	   
	    ExtentManager.endReport();
	  }
	
	@Test
	public void test4() {
		Assert.assertTrue(true);
	}
	
	
}
