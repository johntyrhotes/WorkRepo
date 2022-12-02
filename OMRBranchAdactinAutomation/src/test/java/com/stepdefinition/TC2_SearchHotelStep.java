package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


/**
 * 
 * @author johnty
 * @description perform different actions in adactin search hotel webpage
 * @date 26/08/2022
 *
 */
public class TC2_SearchHotelStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @description search hotels in adactin website using needed inputs
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 * @param string5
	 * @param string6
	 * @param string7
	 * @param string8
	 */
	@When("User Needs to Search Hotel Using {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_needs_to_search_hotel_using_and(String string, String string2, String string3, String string4,
			String string5, String string6, String string7, String string8) {
		pom.getSearchHotelPage().searchHotelWithAllFields(string, string2, string3, string4, string5, string6, string7,
				string8);
	}

	/**
	 * @description verify the success message
	 * @param string
	 */
	@Then("User Should Navigate to Select Hotel and Verify the Success Message {string}")
	public void user_should_navigate_to_select_hotel_and_verify_the_success_message(String string) {
		Assert.assertEquals("Verify After Search Hotel", string, pom.getSelectHotelPage().getSuccessMsg2().getText());
	}

	/**
	 * @description search hotels in adactin website using mandatory fields
	 * @param string
	 * @param string2
	 * @param string3
	 * @param string4
	 * @param string5
	 */
	@When("User Needs to Search Hotel Using Mandatory Fields {string},{string},{string},{string} and {string}")
	public void user_needs_to_search_hotel_using_mandatory_fields_and(String string, String string2, String string3,
			String string4, String string5) {
		pom.getSearchHotelPage().searchHotelWithMandatoryFields(string, string2, string3, string4, string5);
	}

	/**
	 * @description search hotels in adactin website using dates
	 * @param string
	 * @param string2
	 */
	@Then("User Should Verify After Search with the Date Error Message {string} and {string}")
	public void user_should_verify_after_search_with_the_date_error_message_and(String string, String string2) {

		Assert.assertEquals("Verify the Check-In Date", string, pom.getSearchHotelPage().getErrorMsg2().getText());
		Assert.assertEquals("Verify the Check-Out Date", string2, pom.getSearchHotelPage().getErrorMsg3().getText());

	}

	/**
	 * @description search hotels in adactin website without entering any fields
	 */
	@When("User Should Click Search Button Without Entering any Fields")
	public void user_should_click_search_button_without_entering_any_fields() {
		pom.getSearchHotelPage().searchHotelWithouyAnyFields();
	}

	/**
	 * @description verify error message of adactin hotel search webpage
	 * @param string
	 */
	@Then("User Should Verify After Search with the Error Message {string}")
	public void user_should_verify_after_search_with_the_error_message(String string) {
		Assert.assertEquals("Verify the Error Message after not Giving Any Fields", string,
				pom.getSearchHotelPage().getErrorMsg4().getText());

	}

}
