package com.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
public WebDriver ldriver;
	
	public WishlistPage(WebDriver driver)
	{
		ldriver =driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//*[@title='Wishlist']")
	@CacheLookup
	WebElement wishlistpagebtn;
	
	@FindBy(id = "new-customer")
	@CacheLookup
	WebElement wishlistpage;
	
	public void clickonwishlistpagebtn() {
		wishlistpagebtn.click();
	}
	public void wishllistpage() {
		System.out.println(wishlistpage.getText());
	}

}
