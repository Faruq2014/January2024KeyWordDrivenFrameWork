package com.facebookTests;

import org.testng.annotations.Test;

import com.facebookPages.LoginPage;
import com.facebookTest_base.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void validLoginTest() {
		LoginPage lp= new LoginPage(driver);
		lp.userName("hello");
		lp.password("jklkjlkj");
		lp.loginButton();
		
	}
	
	@Test
	public void inValidLoginTest() {
		LoginPage lp= new LoginPage(driver);
		lp.userName("hello");
		lp.password("jk");
		lp.loginButton();
		
	}
	

}
