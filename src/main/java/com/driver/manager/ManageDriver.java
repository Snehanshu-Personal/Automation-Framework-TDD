package com.driver.manager;

import java.util.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utilities.PropertyLoader;

public class ManageDriver {

	private static WebDriver driver;
	private static String browser = PropertyLoader.getBrowser();
	private static String baseURL = PropertyLoader.loadProperty().getProperty("baseUrl");

	public static void initiateDriver() {
		if (Objects.isNull(driver)) {
			switch (browser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "fireFox":
				driver = new FirefoxDriver();
				break;
			default:
				throw new RuntimeException("Invalid browser: " + browser);
			}

			driver.get(baseURL);
			driver.manage().window().maximize();
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void quitDriver() {
		if (Objects.nonNull(driver)) {
			driver.quit();
			driver = null;
		}
	}

}
