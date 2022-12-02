package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

/**
 * 
 * @author johnt
 * @description perform different actions in adactin hotel cancel booking webpage
 * @date 26/08/2022
 *
 */
public class TC5_CancelBookingStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @description cancel the booked order id in adactin hotel webpage
	 * @throws InterruptedException
	 */
	@Then("User Should Navigate to Booked Itinerary to Cancel the Order ID")
	public void user_should_navigate_to_booked_itinerary_to_cancel_the_order_id() throws InterruptedException {
		pom.getCancelBookingPage().cancellingOrderId1();

	}

	/**
	 * @description verify the cancelled order
	 * @param string
	 */
	@Then("User Should Verify After Cancel the Order ID {string}")
	public void user_should_verify_after_cancel_the_order_id(String string) {
		Assert.assertEquals("Verify the Cancel Order", string, pom.getCancelBookingPage().getLblCancel().getText());
	}

	/**
	 * @description cancel the existing order id in adactin hotel webpage
	 * @param string
	 * @throws InterruptedException
	 */
	@Then("User Should Navigate to Booked Itinerary to Cancel the Existing {string}")
	public void user_should_navigate_to_booked_itinerary_to_cancel_the_existing(String string)
			throws InterruptedException {
		pom.getCancelBookingPage().cancellingOrderId(string);
	}

}
