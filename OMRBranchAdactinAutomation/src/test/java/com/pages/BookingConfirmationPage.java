package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author johnt
 * @description to confirm the booking in Adactin web page 
 * @date 26/08/2022
 *
 */
public class BookingConfirmationPage extends BaseClass {

	public BookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='order_no']")
	private WebElement txtOrderNo;

	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement clkBookedItinerary;
	
	@FindBy(xpath="//tr/td[@class='login_title']")
	private WebElement successMsg4;

	public WebElement getTxtOrderNo() {
		return txtOrderNo;
	}

	public WebElement getClkBookedItinerary() {
		return clkBookedItinerary;
	}
	
	public WebElement getSuccessMsg4() {
		return successMsg4;
	}

	/**
	 * @description getting the order id from the webpage
	 * @return String
	 */
	public String bookingOrderID() {

		String attribute = getAttribute(getTxtOrderNo());
		click(getClkBookedItinerary());
		return attribute;

	}

}
