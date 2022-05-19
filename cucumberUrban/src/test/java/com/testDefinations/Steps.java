package com.testDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageObject.AboutPage;
import com.pageObject.CartPage;
import com.pageObject.LoginPage;
import com.pageObject.SearchPage;
import com.pageObject.WishlistPage;

import cucumber.api.java.en.*;

public class Steps {
	public WebDriver driver;
	public LoginPage  lp;
	public CartPage cp;
	public WishlistPage wp;
	public AboutPage ap;
	public SearchPage sp;
	
	
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mindsdet153\\eclipse-workspace\\cucumberUrban\\driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
		  lp = new LoginPage(driver);
		  cp = new CartPage(driver);
		  wp = new WishlistPage(driver);
		  ap = new AboutPage(driver);
		  sp = new SearchPage(driver);
	}

	@When("^User open URL \"([^\"]*)\"$")
	public void user_open_URL(String url) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.get(url);
	}

	@When("^go to the login button$")
	public void go_to_the_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  lp.clickLoginicon();
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    lp.clickLoginbtn();
	}

	@When("^user enter email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enter_email_as_and_password_as(String uname, String pwd) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  lp.setUserName(uname);
	  lp.setPassword(pwd);
	}

	@When("^Click on Login$")
	public void click_on_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   lp.clickLogin();
	}

	@When("^close the browser$")
	public void close_the_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();
	}

	@When("^Click on the cart button$")
	public void click_on_the_cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		cp.cartbtn();
		
	}

	@Then("^print the cart page message$")
	public void print_the_cart_page_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   cp.cartpage();
	}

	
	@When("^Click on wishlist button$")
	public void click_on_wishlist_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   wp.clickonwishlistpagebtn();
	}

	@Then("^print the wishlist page message$")
	public void print_the_wishlist_page_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 wp.wishllistpage();
	}

	
	@When("^verify the page$")
	public void verify_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ap.clickonaboutbtn();
	}

	@Then("^Page contain About us heading$")
	public void page_contain_About_us_heading() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ap.aboutpage();
	}

	@When("^Enter element as \"([^\"]*)\"$")
	public void enter_element_as(String ele) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    sp.setelement(ele);
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   sp.searchbtn();
	}



}
