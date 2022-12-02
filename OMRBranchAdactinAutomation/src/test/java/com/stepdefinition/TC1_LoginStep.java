package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

/**
 * 
 * @author johnty
 * @description perform different actions in adactin hotel login webpage
 * @date 26/08/2022
 *
 */
public class TC1_LoginStep extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@Given("user is just checking")
	public void user_is_just_checking() {

	}



	/**
	 * @description browse the adactin hotel website
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	@Given("User is on the Adactin Page")
	public void user_is_on_the_adactin_page() throws FileNotFoundException, IOException {
		
	}

	/**
	 * @description login adacting hotel page using credentials
	 * @param username
	 * @param password
	 */
	@When("User Should Perform Login {string},{string}")
	public void user_should_perform_login(String username, String password) {
		pom.getLoginPage().login(username, password);

	}

	
	/**
	 * @description login adacting hotel page using credentials using enter key
	 * @param username
	 * @param password
	 * @throws AWTException
	 */
	@When("User Should Perform Login {string},{string} with Enter Key")
	public void user_should_perform_login_with_enter_key(String username, String password) throws AWTException {
		pom.getLoginPage().loginWithEnter(username, password);
	}

	/**
	 * @description login adacting hotel page using wrong credentials
	 * @param loginPageError
	 */
	@Then("User Should Verify after Login error contains {string}")
	public void user_should_verify_after_login_error_contains(String loginPageError) {
		Assert.assertEquals("Verify After giving Wrong Username or Password", loginPageError,
				pom.getLoginPage().getErrorMsg1().getText().split(" Click")[0]);

	}

}
