package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

/**
 * 
 * @author johnty
 * @description perform different actions in adactin book hotel webpage
 * @date 26/08/2022
 *
 */
public class TC4_BookHotelStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @description book a hotel in adacting website using valid inputs
	 * @param string
	 * @param string2
	 * @param string3
	 * @param dataTable
	 * @throws InterruptedException
	 */
	@When("User Needs to Book a Hotel Using {string},{string},{string} and Credit Card Details")
	public void user_needs_to_book_a_hotel_using_and_credit_card_details(String string, String string2, String string3,
			io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		pom.getBookHotelPage().bookHotel(string, string2, string3, dataTable);
		Thread.sleep(6000);
	}

	/**
	 * @description verify the success message
	 * @param string
	 */
	@Then("User Should Verify the Success Message of {string} After Book Hotel")
	public void user_should_verify_the_success_message_of_after_book_hotel(String string) {

		Assert.assertEquals("Verify the Success Message", string,
				pom.getBookingConfirmationPage().getSuccessMsg4().getText());

	}

	/**
	 * @description book a hotel in adacting website without entering any fields
	 */
	@When("User Click Book Now Without Enter any Fields")
	public void user_click_book_now_without_enter_any_fields() {
		pom.getBookHotelPage().bookHotelWithoutAnyFields();
	}

	/**
	 * @description verify the error messages
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 * @param string5
	 * @param string6
	 * @param string7
	 */
	@Then("User Should Verify the Error Message of {string},{string},{string},{string},{string},{string} and {string} After Click Book Now")
	public void user_should_verify_the_error_message_of_and_after_click_book_now(String string, String string2,
			String string3, String string4, String string5, String string6, String string7) {
		Assert.assertEquals("Verify the Error Message", string, pom.getBookHotelPage().getErrorMsg6().getText());
		Assert.assertEquals("Verify the Error Message", string2, pom.getBookHotelPage().getErrorMsg7().getText());
		Assert.assertEquals("Verify the Error Message", string3, pom.getBookHotelPage().getErrorMsg8().getText());
		Assert.assertEquals("Verify the Error Message", string4, pom.getBookHotelPage().getErrorMsg9().getText());
		Assert.assertEquals("Verify the Error Message", string5, pom.getBookHotelPage().getErrorMsg10().getText());
		Assert.assertEquals("Verify the Error Message", string6, pom.getBookHotelPage().getErrorMsg11().getText());
		Assert.assertEquals("Verify the Error Message", string7, pom.getBookHotelPage().getErrorMsg12().getText());

	}

}
