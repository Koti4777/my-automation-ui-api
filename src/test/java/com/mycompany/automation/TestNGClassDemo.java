package com.mycompany.automation;

import core.java.examples.ExceptionDemo;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.mycompany.utils.FileWriterDemo;

public class TestNGClassDemo {
public TestResult result;
	@Test
	
	public void test1() {
		try {
			ExceptionDemo.exceptionDemo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
@Test
	
	public void test2() throws Exception {
		
			ExceptionDemo.exceptionDemo();
		
	}

@Test

public void test3() throws Exception {
	//System.out.println("method name"+result.getMethod().getMethodName());
		FileWriterDemo.fileWriter("test3", "Helloworld");
	
}


	
}
