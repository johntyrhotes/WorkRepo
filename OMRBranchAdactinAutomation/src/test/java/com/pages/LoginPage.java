package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;
/**
 * 
 * @author johnty
 * @description to login the adactin hotel web page
 * @date 26/08/2022
 *
 */
public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "username"), @FindBy(xpath = "//input[@name='username']") })
	private WebElement txtUsername;

	@FindAll({ @FindBy(id = "password"), @FindBy(name = "username") })
	private WebElement txtPassword;

	@FindBy(id = "login")
	private WebElement btnLogin;
	
	@FindBy(xpath="//div/b")
	private WebElement errorMsg1;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getErrorMsg1() {
		return errorMsg1;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	/**
	 * @description to login the adactin page using credentials
	 * @param userName
	 * @param password
	 */
	public void login(String userName, String password) {
		sendKeys(getTxtUsername(), userName);
		sendKeys(getTxtPassword(), password);
		click(getBtnLogin());

	}

	/**
	 * @description try to login adactin page using wrong credentials
	 * @param userName
	 * @param password
	 * @throws AWTException
	 */
	public void loginWithEnter(String userName, String password) throws AWTException {
		sendKeys(getTxtUsername(), userName);
		sendKeys(getTxtPassword(), password);
		enter();

	}

}











