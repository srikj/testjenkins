package com.cisco.test.jenkinsTest;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class SampleTest 
{
	@AfterMethod
	public void afterMethod(ITestResult result) {
	  System.out.println("method name: " + result.getTestClass().getName()+":"+result.getMethod().getMethodName()+"result = "+(result.isSuccess()?"Pass":"Fail"));
	}
	
	@Test
	public void passingTest() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void passingTest1() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void passingTest2() {
		Assert.assertTrue(true);
	}
	
	@Test
	public void failingTest() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void failingTest1() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void failingTest2() {
		Assert.assertTrue(false);
	}
    
}
