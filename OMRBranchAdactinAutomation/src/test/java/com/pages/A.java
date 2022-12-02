package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class A {

	public static void main(String[] args) throws IOException {
		FileInputStream stream=new FileInputStream(System.getProperty("user.dir")+"\\Config\\Config.properties");
		Properties properties=new Properties();
		properties.load(stream);
		Object obj=properties.get("url");
		String s=(String) obj;
		System.out.println(s);
		

	}

}
