package com.facebookTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.facebookPages.LoginPage;
import com.facebookTest_base.BaseTest;
import com.facebookTest_utilities.PropertiseReader;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLoginTest() {
		LoginPage lp= new LoginPage(driver);
		PropertiseReader pr= new PropertiseReader();
		lp.userName(pr.readUserName());
		lp.password(pr.readPassword());
		lp.loginButton();
		
	}
	
	@Test
	public void inValidLoginTest() {
		LoginPage lp= new LoginPage(driver);
		lp.userName("hello");
		lp.password("jk");
		lp.loginButton();
		String expectedTitle=driver.getTitle();
		String actualTitle="facebook";
		Assert.assertEquals(expectedTitle, actualTitle);
		
	}
	
	@Test(dependsOnMethods="inValidLoginTest")
	public void invalidUserName() {
		System.out.println("skipped test");
	}
	

}
