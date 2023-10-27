package com.instargam.stepDefinations;

import com.instagram.loginPages.LoginPage;

import instagram.base.BaseStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioOutline extends BaseStep{
LoginPage lp;
	@Given("I enter {string} and {string} to open app")
	public void iEnterAndToOpenApp(String browser, String url) {
		openApp(browser, url);
		
	}
	@When("I enter {string} and {string} valid to acces the app")
	public void iEnterAndValidToAccesTheApp(String username, String password) {
		lp=new LoginPage(driver);
		lp.userNameMethod(username);
		lp.passWordMethod(password);
		
	}
	@When("I click loginbutton")
	public void iClickLoginbutton() {
		lp.LoginButtonMethod();
		
	}
	@Then("I can be logged in")
	public void iCanBeLoggedIn() {
		closeApp();
		
	}




}
