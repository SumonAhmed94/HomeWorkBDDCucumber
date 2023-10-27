package com.instagram.loginPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.NAME, using = "username")
	WebElement usernameId;

	public WebElement userNameMethod(String enterYourUserName) {
		usernameId.sendKeys(enterYourUserName);
		return usernameId;

	}

	@FindBy(how = How.NAME, using = "password")
	WebElement passwordLocator;

	public WebElement passWordMethod(String enterYourPassword) {
		passwordLocator.sendKeys(enterYourPassword);
		return passwordLocator;
	}

	@FindBy(how = How.XPATH, using = "//button[@class='_acan _acap _acas _aj1-']")
	 WebElement loginButtonID;

	public void LoginButtonMethod() {
		loginButtonID.click();
	}
}