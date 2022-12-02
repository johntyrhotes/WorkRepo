package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.reactivex.rxjava3.functions.Action;


/**
 * 
 * @author johnty
 * @description Used to maintain all reusable methods
 * @date 26/08/2022
 *
 */

public class BaseClass {

	public static WebDriver driver;

	
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		
		Properties properties=new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\Config\\Config.properties"));
		String value = (String)properties.get(key);
		return value;

	}
	

	public static void getDriver(String browsertype) {

		switch (browsertype) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;

		}
	}
	
	/**
	 * @description launch the chrome browser
	 */
	public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	/**
	 * @description pause the execution for certain time limit
	 * @param a
	 * @throws InterruptedException
	 */

	public void sleep(long a) throws InterruptedException {
		Thread.sleep(a);

	}
	
	/**
	 * @description launch the particular url in the browser
	 * @param url
	 */
	public static void enterUrl(String url) {
		driver.get(url);
	}
	
	/**
	 * @description maximize the browser window
	 */

	public static void maxiWin() {
		driver.manage().window().maximize();
	}
	
	/**
	 * @description send data to the webpage fields
	 * @param element
	 * @param data
	 */

	public void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public void singleClick() {
		
		Actions action=new Actions(driver);
		action.click();

	}
	
	/**
	 * @description perform enter in the browser webpage
	 * @throws AWTException
	 */

	public static void enter() throws AWTException {
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	/**
	 * @description perform click in the browser webpage
	 * @param element
	 */
	
	public void click(WebElement element) {
		element.click();
	}
	
	/**
	 * @description perform to clear the fields in the browser webpage
	 * @param element
	 */
	
	public void clear(WebElement element) {
		element.clear();
	}
	
	/**
	 * @description accept the pop up messages
	 * switch the control to pop up alert
	 */

	public void elementAlert() {
		driver.switchTo().alert().accept();
	}
	
	/**
	 * @description get the title of current browser webpage
	 * @return
	 */

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	/**
	 * @description find the webpage field using id locator
	 * @param attributeValue
	 * @return
	 */

	public WebElement findElementById(String attributeValue) {
		WebElement element = driver.findElement(By.id(attributeValue));
		return element;
	}
	
	/**
	 * @description find the webpage field using name locator
	 * @param attributeValue
	 * @return
	 */

	public WebElement findElementByName(String attributeValue) {
		WebElement element = driver.findElement(By.name(attributeValue));
		return element;
	}
	
	/**
	 * @description find the webpage field using classname locator
	 * @param attributeValue
	 * @return
	 */

	public WebElement findElementByClassName(String attributeValue) {
		WebElement element = driver.findElement(By.className(attributeValue));
		return element;
	}
	
	/**
	 * @description find the webpage field using xpath locator
	 * @param attributeValue
	 * @return
	 */

	public WebElement findElementByXpath(String attributeValue) {
		WebElement element = driver.findElement(By.xpath(attributeValue));
		return element;
	}
	
	/**
	 * @description get the current webpage url
	 * @return
	 */

	// 11.getCurrentUrl
	public String getCurrentUrl() {
		String txt = driver.getCurrentUrl();
		return txt;
	}
	
	/**
	 * @description quit all the windows opened by selenium
	 */

	// 12.quit all windows
	public static void quit() {
		driver.quit();
	}
	
	/**
	 * @description close the current window
	 */

	// 13.close single window
	public void close() {
		driver.close();
	}
	
	/**
	 * @description get the text from webelement
	 * @param element
	 * @return
	 */

	// 14.getText
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	/**
	 * @description get the value of webelement using value attribute
	 * @param element
	 * @return
	 */

	// 15.getAttribute --> 99%
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}
	
	/**
	 * @description get the value of webelement using any attribute
	 * @param element
	 * @param attributename
	 * @return
	 */

	// 16.getAttribute --> 1%
	public String getAttribute(WebElement element, String attributename) {
		// TODO Auto-generated method stub
		String attribute = element.getAttribute(attributename);
		return attribute;
	}
	
	/**
	 * @description select the dropdown option using text
	 * @param element
	 * @param text
	 */

	// 17.selectOptionByText
	public void selectOptionByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	/**
	 * @description select the dropdown option using webelement attribute
	 * @param element
	 * @param value
	 */

	// 18.selectOptionByAttribute
	public void selectOptionByAttribute(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	/**
	 * @description select the dropdown option using webelement value index
	 * @param element
	 * @param index
	 */

	// 19.selectOptionByIndex
	public void selectOptionByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	/**
	 * @description send data to webpage fields using javascript
	 * @param element
	 * @param text
	 */

	// 20.elementSendKeysJs
	public void elementSendKeysJs(WebElement element, String text) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguements[0].setAttribute('value','" + text + "')", element);
	}
	
}
