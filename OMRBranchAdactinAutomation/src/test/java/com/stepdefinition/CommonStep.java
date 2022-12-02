package com.stepdefinition;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

/**
 * 
 * @author johnty
 * @Description execute all the common steps across pages
 * @Date 06/09/22
 *
 */
public class CommonStep extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager();
	
	/**
	 * @Description verify the success message of expected and actual value using assertion
	 * @param welcomMsg
	 */
	@Then("User Should Verify after Login {string}")
	public void user_should_verify_after_login(String welcomMsg) {
		
		Assert.assertEquals("Verify After Login Welcome Success Message", welcomMsg,getAttribute(pom.getSearchHotelPage().getSuccessMsg1()));
	      
	}

}
