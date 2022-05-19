package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
public WebDriver ldriver;
	
	public CartPage(WebDriver driver)
	{
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id= "cart-badge")
	@CacheLookup
	WebElement cartbtn;
	
	@FindBy(xpath ="//*[@class='empty_cart']")
	@CacheLookup
	WebElement cartpage;
	
	public void cartbtn() {
		cartbtn.click();
	}
	public void cartpage() {
		System.out.println(cartpage.getText());
	}

}
