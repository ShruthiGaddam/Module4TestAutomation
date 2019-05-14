package com.io.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

// it will provide the access to the url of html page
public class PropertiesEx {
	static Properties prop = new Properties();
	public static void readProperties() {
		
		try {
			InputStream is = new FileInputStream(
					"C:\\Users\\SHRUTHI\\Desktop\\capGProjects\\ModuleTestAutomationAndSelenium\\src\\main\\java\\config.properties");
			prop.load(is);
			System.out.println(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
