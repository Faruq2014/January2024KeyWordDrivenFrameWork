package com.facebookTests;

import org.testng.annotations.Test;

import com.facebookPages.RegistrationPage;
import com.facebookTest_base.BaseTest;
import com.facebookTest_utilities.PropertiseReader;

public class RegistrationTest extends BaseTest{
	
	@Test
	public void newUserTest() {
		RegistrationPage registrationPage= new RegistrationPage(driver);
		PropertiseReader propertiseReader = new PropertiseReader();
		registrationPage.createNewAccount();
		registrationPage.firstName(propertiseReader.readfirstName());
		registrationPage.lastName(propertiseReader.readfirstName());
		registrationPage.mobleNumber(propertiseReader.readphone());
		registrationPage.newPassword(propertiseReader.readPassword());
		registrationPage.birthMonth(propertiseReader.readmonth());
		registrationPage.birthDay(propertiseReader.readday());
		registrationPage.birthYear(propertiseReader.readyear());
		registrationPage.selectGender(propertiseReader.readgender());
	}
	
	@Test
	public void inValidNewUserTest() {
		RegistrationPage registrationPage= new RegistrationPage(driver);
		PropertiseReader propertiseReader = new PropertiseReader();
		registrationPage.createNewAccount();
		registrationPage.firstName(propertiseReader.readfirstName());
		registrationPage.lastName(propertiseReader.readfirstName());
		registrationPage.mobleNumber(propertiseReader.readphone());
		registrationPage.newPassword(propertiseReader.readPassword());
		registrationPage.birthMonth(propertiseReader.readmonth());
		registrationPage.birthDay(propertiseReader.readday());
		registrationPage.birthYear(propertiseReader.readyear());
		registrationPage.selectGender(propertiseReader.readgender());
	}

}
