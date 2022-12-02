package com.reports;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


/**
 * 
 * @author johnty
 * @Description used to generate the JVM report
 *
 */
public class Reporting extends BaseClass {
	
	/**
	 * @Description used to generate the JVM-cucumber Report
	 * @param jsonfile
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void generateJvmReport(String jsonfile) throws FileNotFoundException, IOException {
		
		File file =new File(System.getProperty("user.dir")+getPropertyFileValue("jvmpath"));
		
		Configuration configuration = new Configuration(file,"Adactin Hotel Automation");
		
		configuration.addClassifications("Browser", "Chrome");
		configuration.addClassifications("Version", "104.0.5112.101");
		configuration.addClassifications("OS", "Windows 11");
		configuration.addClassifications("Sprint", "30");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(jsonfile);
		
		
		ReportBuilder builder = new ReportBuilder(jsonFiles,configuration);
		builder.generateReports();
	
	}

}
