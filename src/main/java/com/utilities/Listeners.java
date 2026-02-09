package com.utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.reporting.ExtentManager;

import org.testng.ITestContext;

public class Listeners implements ITestListener {
	private static ExtentReports extent = ExtentManager.getExtentReport();
	private static ExtentTest extentTest;

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Started " + result.getMethod().getMethodName());
		extentTest = extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Passed " + result.getMethod().getMethodName());
		extentTest.pass(result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed " + result.getMethod().getMethodName());
		extentTest.fail(result.getMethod().getMethodName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		extentTest.skip("Test skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
