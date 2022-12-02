package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

/**
 * 
 * @author johnty
 * @description perform different actions in adactin select hotel webpage
 * @date 26/08/2022
 *
 */
public class TC3_SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @description select a hotel from adactin hotel selecthotel webpage
	 */
	@When("User Should Select a Hotel and Click Continue Button")
	public void user_should_select_a_hotel_and_click_continue_button() {
		pom.getSelectHotelPage().selectHotel();

	}

	/**
	 * @description verify the success message
	 * @param string
	 */
	@Then("User Should Navigate to Book Hotel and Verify the Message {string}")
	public void user_should_navigate_to_book_hotel_and_verify_the_message(String string) {
		Assert.assertEquals("Verify the Success Message After Select a Hotel", string,
				pom.getBookHotelPage().getSuccessMsg3().getText());

	}

	/**
	 * @description select a hotel from adactin hotel without select any hotel in selecthotel webpage
	 */
	@When("User Click Continue Without Select Any Hotel")
	public void user_click_continue_without_select_any_hotel() {

		pom.getSelectHotelPage().withoutSelectHotel();

	}

	/**
	 * @description verify the error message
	 * @param string
	 */
	@Then("User Should Verify After Search with the Error Message of {string}")
	public void user_should_verify_after_search_with_the_error_message_of(String string) {
		Assert.assertEquals("Verify the Error Message after do not select any Hotel", string,
				pom.getSelectHotelPage().getErrorMsg5().getText());
	}

}
