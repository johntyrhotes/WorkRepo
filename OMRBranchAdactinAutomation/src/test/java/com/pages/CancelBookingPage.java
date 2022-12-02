package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

/**
 * 
 * @author johnty
 * @description to cancel the booking in Adactin web page 
 * @date 26/08/2022
 *
 */
public class CancelBookingPage extends BookingConfirmationPage {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_id_text")
	private WebElement txtSearchOrderId;

	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;

	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancel;

	@FindBy(xpath = "//td/label[@id='search_result_error']")
	private WebElement lblCancel;

	public WebElement getTxtSearchOrderId() {
		return txtSearchOrderId;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getLblCancel() {
		return lblCancel;
	}

	/**
	 * @description to cancel the order id in Adactin web page
	 * @param orderId
	 * @throws InterruptedException
	 */
	public void cancellingOrderId(String orderId) throws InterruptedException {
		click(getClkBookedItinerary());
		sendKeys(getTxtSearchOrderId(), orderId);
		click(getBtnGo());
		click(getBtnCancel());
		elementAlert();

	}

	/**
	 * @description to cancel the booking in Adactin web page
	 * @throws InterruptedException
	 */
	public void cancellingOrderId1() throws InterruptedException {
		sendKeys(getTxtSearchOrderId(), bookingOrderID());
		click(getBtnGo());
		click(getBtnCancel());
		elementAlert();

	}

}
