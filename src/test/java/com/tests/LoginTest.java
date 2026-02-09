package com.tests;
import java.sql.DriverManager;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.driver.manager.ManageDriver;
import com.pages.LoginPage;
import com.utilities.JavascriptExecutors;
import com.utilities.WebDriverWaits;

public class LoginTest extends BaseTest{

	@Test
	public void checkLoginWithValidCredentials() {
		WebDriver driver = ManageDriver.getDriver();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.inputEmail("qa_testers@qabrains.com").inputPassword("Password123");
		JavascriptExecutors.scrollBy(driver, 0, 800);
		WebDriverWaits.waitForElementToBeViible(loginPage.getSubmitButton(), driver, 3).click();
		String msg = WebDriverWaits.waitForElementToBeViible(loginPage.getToaster(), driver, 3).getText();
		Assert.assertEquals("Login Successful", msg);

	}
}
