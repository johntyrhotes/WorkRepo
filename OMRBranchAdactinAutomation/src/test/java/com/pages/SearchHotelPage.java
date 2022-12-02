package com.pages;

import com.base.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * 
 * @author johnty
 * @description to search the hotel in the adactin webpage
 * @date 06/09/2022
 *
 */
public class SearchHotelPage extends BaseClass {
	public SearchHotelPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnHotels;
	
	@FindBy(id="room_type")
	private WebElement dDnRoomType;
	
	@FindBy(name="room_nos")
	private WebElement dDnNoOfRooms;
	
	@FindBy(id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy(id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy(id="adult_room")
	private WebElement dDnAdultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildrenPerRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSubmit;
	
	@FindBy(xpath="//input[@id='username_show']")
	private WebElement successMsg1;
	
	@FindBy(xpath="//span[@id='checkin_span']")
	private WebElement errorMsg2;
	
	@FindBy(xpath="//span[@id='checkout_span']")
	private WebElement errorMsg3;
	
	@FindBy(xpath="//span[@id='location_span']")
	private WebElement errorMsg4;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnHotels() {
		return dDnHotels;
	}

	public WebElement getdDnRoomType() {
		return dDnRoomType;
	}

	public WebElement getdDnNoOfRooms() {
		return dDnNoOfRooms;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getdDnAdultsPerRoom() {
		return dDnAdultsPerRoom;
	}

	public WebElement getdDnChildrenPerRoom() {
		return dDnChildrenPerRoom;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}
	

	public WebElement getSuccessMsg1() {
		return successMsg1;
	}

	public WebElement getErrorMsg2() {
		return errorMsg2;
	}

	public WebElement getErrorMsg3() {
		return errorMsg3;
	}

	public WebElement getErrorMsg4() {
		return errorMsg4;
	}

	/**
	 * @description search the hotel in adactin hotel webpage using all required information
	 * @param location
	 * @param hotels
	 * @param roomType
	 * @param numberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 * @param childrenPerRoom
	 */
	public void searchHotelWithAllFields(String location,String hotels,String roomType,String numberOfRooms,String checkInDate,String checkOutDate,String adultsPerRoom,String childrenPerRoom) 
	{
		selectOptionByText(getdDnLocation(),location);
		selectOptionByText(getdDnHotels(),hotels);
		selectOptionByText(getdDnRoomType(),roomType);
		selectOptionByText(getdDnNoOfRooms(),numberOfRooms);
		clear(getTxtCheckInDate());
		sendKeys(getTxtCheckInDate(),checkInDate);
		clear(getTxtCheckOutDate());
		sendKeys(getTxtCheckOutDate(),checkOutDate);
		selectOptionByText(getdDnAdultsPerRoom(),adultsPerRoom);
		selectOptionByText(getdDnChildrenPerRoom(),childrenPerRoom);
		click(getBtnSubmit());
		
	}
	
	/**
	 * @description to search the hotel in the adactin webpage using mandatory fields
	 * @param location
	 * @param nuberOfRooms
	 * @param checkInDate
	 * @param checkOutDate
	 * @param adultsPerRoom
	 */
	public void searchHotelWithMandatoryFields(String location,String nuberOfRooms,String checkInDate,String checkOutDate,String adultsPerRoom) 
	{
		selectOptionByText(getdDnLocation(),location);
		clear(getTxtCheckInDate());
		sendKeys(getTxtCheckInDate(),checkInDate);
		clear(getTxtCheckOutDate());
		sendKeys(getTxtCheckOutDate(),checkOutDate);
		selectOptionByText(getdDnAdultsPerRoom(),adultsPerRoom);
		click(getBtnSubmit());
		

	}
	
	/**
	 * @description to search the hotel without giving any fields in the adactin hotel page
	 */
	public void searchHotelWithouyAnyFields() 
	{
		click(getBtnSubmit());

	}

}
