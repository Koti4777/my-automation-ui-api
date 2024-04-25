package com.mycompany.automation;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;


import org.testng.annotations.Test;

import com.mycompany.utils.Driver;






/**
 * Unit test for simple App.
 */
public class AppTest 
{
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue()
	{

		Driver.getInstance().get("https://www.demoqa.com");
		assertTrue( true );
	}
}
