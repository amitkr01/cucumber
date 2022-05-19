package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver driver)
	{
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@class='header-icon-link user-profile-icon']")
	@CacheLookup
	WebElement loginicon;
	
	@FindBy(xpath = "//*[@class='login-link authentiation_popup']")
	@CacheLookup
	WebElement loginbtn;
	
	
	@FindBy(xpath = "//*[@class='email required input_authentication']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath = "//*[@class='required input_authentication']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//*[@class='button primary']")
	@CacheLookup
	WebElement btnLogin;
	
	public void clickLoginicon() {
		loginicon.click();
	}
	
	public void clickLoginbtn() {
		loginbtn.click();
	}

	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
}
