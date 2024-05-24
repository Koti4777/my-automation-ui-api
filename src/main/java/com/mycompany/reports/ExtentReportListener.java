package com.mycompany.reports;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ExtentReportListener extends ExtentManager implements ITestListener {
//ExtentTest test = new ExtentTest(null, null, null);
	public void onTestStart(ITestResult result) {
	   
		test = reports.createTest(result.getTestName());
	  }

	 
	  public void onTestSuccess(ITestResult result) {
	    if(result.getStatus()==ITestResult.SUCCESS) {
	   test.log(Status.PASS, "Pass Test is "+result.getName());
	    }
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public void onTestFailure(ITestResult result) {
		  if(result.getStatus()==ITestResult.FAILURE) {
			   test.log(Status.FAIL, "Fail Test is "+result.getName());
			    }
	  }

	
	
}
