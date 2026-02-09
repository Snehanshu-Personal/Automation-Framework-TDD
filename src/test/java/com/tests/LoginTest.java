package com.tests;
import java.sql.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.driver.manager.ManageDriver;
import com.pages.LoginPage;
import com.utilities.JavascriptExecutors;
import com.utilities.WebDriverWaits;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginTest extends BaseTest{
    private static final Logger log =
            LogManager.getLogger(LoginTest.class);

	@Test
	public void checkLoginWithValidCredentials() {
		log.info("Test started");
		WebDriver driver = ManageDriver.getDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.inputEmail("qa_testers@qabrains.com").inputPassword("Password123");
		JavascriptExecutors.scrollBy(driver, 0, 800);
		WebDriverWaits.waitForElementToBeViible(loginPage.getSubmitButton(), driver, 3).click();
		String msg = WebDriverWaits.waitForElementToBeViible(loginPage.getToaster(), driver, 3).getText();
		Assert.assertEquals("Login Successful", msg);
		log.info("Test finished");

	}
}
