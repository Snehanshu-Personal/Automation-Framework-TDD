package com.utilities;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;

public class Listeners implements ITestListener {
	
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started "+result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed "+result.getMethod().getMethodName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed "+result.getMethod().getMethodName());
		
	}
}
