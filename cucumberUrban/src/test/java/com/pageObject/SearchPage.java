package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
public WebDriver ldriver;
	
	public SearchPage(WebDriver driver)
	{
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "search")
	@CacheLookup
	WebElement searchelement;
	
	@FindBy(id= "search_button")
	@CacheLookup
	WebElement searchbtn;
	
	public void setelement(String ele) {
		searchelement.sendKeys(ele);
	}
	public void searchbtn() {
		searchbtn.click();
	}

}
