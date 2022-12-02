package com.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass;
import com.reports.Reporting;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

/**
 * 
 * @author johnty
 * @Description used to execute the all programs
 * @Date 06/09/22
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = "com.stepdefinition", stepNotifications = true,
plugin= {"pretty","json:C:\\Users\\johnt\\eclipse-workspace\\OMRBranchAdactinAutomation\\target\\output.json"},
monochrome=true,dryRun=false,publish=true,snippets=SnippetType.CAMELCASE,tags="@Login1")
public class TestRunnerClass extends BaseClass {
	
	/**
	 * @throws IOException 
	 * 
	 * @throws FileNotFoundException 
	 * @Description used to generate the JVM report after every class
	 */
	@AfterClass
	public static void afterClass() throws FileNotFoundException, IOException {
		Reporting.generateJvmReport(System.getProperty("user.dir")+getPropertyFileValue("jsonpath"));
		

	}

}
