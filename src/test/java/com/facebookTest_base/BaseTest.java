package com.facebookTest_base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.facebookTest_utilities.PropertiseReader;

public class BaseTest {

	public WebDriver driver;
	//public String browser = "chrome";// instance method and it is a flag

	@BeforeMethod
	public void openApplication() {
		PropertiseReader pr= new PropertiseReader();
		String browser=pr.readBrowser();
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			System.out.println("<<<<< Hello please use chrome or edge or firefox>>>>");
			driver = new ChromeDriver();
		}
		
		driver.get(pr.readUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@AfterMethod
	public void closeApplication() {
		if (driver != null) {
			driver.quit();
		}
	}



}
