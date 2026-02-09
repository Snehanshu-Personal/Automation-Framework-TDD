package com.reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static ExtentReports extent;

	public static ExtentReports getExtentReport() {
		if (extent == null) {
			String filePath = System.getProperty("user.dir") + "/reports/ExtentReport.html";
			ExtentSparkReporter spark = new ExtentSparkReporter(filePath);
			spark.config().setReportName("Automation Report");
			spark.config().setDocumentTitle("Test Execution Report");
			extent = new ExtentReports();
			extent.attachReporter(spark);
			extent.setSystemInfo("Framework", "Selenium + TestNG");
			extent.setSystemInfo("Author", "Snehanshu");
		}
		return extent;
	}
}
