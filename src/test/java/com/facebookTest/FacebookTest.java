package com.facebookTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
 WebDriver driver;
	@Test
	public void facebookTestOne() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.quit();
	}
}
