package com.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

/**
 * 
 * @author johnty
 * @description Used to maintain all reusable methods
 * @date 26/08/2022
 *
 */
public class HooksClass extends BaseClass{
	/**
	 * 
	 * @description launching browser before each scenario
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws InterruptedException
	 */
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException, InterruptedException {
		getDriver(getPropertyFileValue("browsertype"));
		enterUrl(getPropertyFileValue("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}
	
	/**
	 * @description take screenshot after each scenario
	 * @param scenario
	 */
	@After
	public void afterScenario(Scenario scenario) {
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		byte[] b=ss.getScreenshotAs(OutputType.BYTES);
		scenario.attach(b,"image/png","Every Scenario");
		driver.close();
	}
	
}
