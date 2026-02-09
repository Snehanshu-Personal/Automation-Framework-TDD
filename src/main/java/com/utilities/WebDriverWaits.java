package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaits {
	
	public static WebElement waitForElementToBeViible(WebElement ele, WebDriver driver, int second) {
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(second));
		WebElement element = wait.until(ExpectedConditions.visibilityOf(ele));
		return element;
	}
	
	public static WebElement waitForElementToBeClickable(WebElement ele, WebDriver driver, int second) {
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofSeconds(second));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(ele));
		return element;
	}

}
