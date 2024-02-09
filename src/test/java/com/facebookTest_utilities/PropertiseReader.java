package com.facebookTest_utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiseReader {
	
	Properties properties;//instance variable
	
	
  // this is constructor
	public PropertiseReader() {
		properties = new Properties();
		String filePath = "src/test/resources/Application.properties";
		FileInputStream fis;

		try {
			fis = new FileInputStream(filePath);
			properties.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String readBrowser() {
		return properties.getProperty("browser");
	}
	public String readUrl() {
		return properties.getProperty("url");
	}
	
	
	public String readUserName() {
		return properties.getProperty("userName");
	}
	public String readPassword() {
		return properties.getProperty("password");
	}
	
	public String readfirstName() {
		return properties.getProperty("firstName");
	}
	
	public String readlastName() {
		return properties.getProperty("lastName");
	}
	
	public String reademail() {
		return properties.getProperty("email");
	}
	
	public String readphone() {
		return properties.getProperty("phone");
	}
	
	public String readmonth() {
		return properties.getProperty("month");
	}
	
	public String readday() {
		return properties.getProperty("day");
	}
	public String readyear() {
		return properties.getProperty("year");
	}
	public String readgender() {
		return properties.getProperty("gender");
	}

	
	public static void main(String[] args) {
		System.out.println("propertise");
		PropertiseReader pr = new PropertiseReader();
		System.out.println(pr.readyear());
	}

}
