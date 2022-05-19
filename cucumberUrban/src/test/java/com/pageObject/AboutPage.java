package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutPage {
public WebDriver ldriver;
	
	public AboutPage(WebDriver driver)
	{
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@href='/about-urban-ladder?src=g_footer']")
	@CacheLookup
	WebElement aboutbtn;
	
	@FindBy(xpath ="//*[@class='subheader question']")
	@CacheLookup
	WebElement aboutpage;
	
	public void clickonaboutbtn() {
		aboutbtn.click();
	}
	public void aboutpage() {
		System.out.println(aboutpage.getText());
	}

}
