package com.tests;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.driver.manager.ManageDriver;
import com.utilities.PropertyLoader;

public class BaseTest {

	@BeforeMethod
	public void setUp() {
		ManageDriver.initiateDriver();
	}

	@AfterMethod
	public void tearDown() {
		ManageDriver.quitDriver();
	}

}
