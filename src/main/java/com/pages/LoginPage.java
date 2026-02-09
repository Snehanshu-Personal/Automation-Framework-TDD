package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailInput;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement passwordInput;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement subMitButton;
	
	@FindBy(xpath="//span[@id='remove-toaster']/preceding-sibling::span")
	private WebElement toaster;
	
	public WebElement getSubmitButton() {
		return subMitButton;
	}
	
	public LoginPage inputEmail(String email) {
		emailInput.sendKeys(email);
		return this;
	}
	
	public LoginPage inputPassword(String password) {
		passwordInput.sendKeys(password);
		return this;
	}
	
	public LoginPage submitLogin() {
		subMitButton.click();
		return this;
	}
	
	public String getToasterMessage() {
		return toaster.getText();
	}
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}
