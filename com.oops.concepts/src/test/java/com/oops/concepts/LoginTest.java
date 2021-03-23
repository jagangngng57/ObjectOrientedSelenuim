package com.oops.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	
	@Test(priority=1)
	public void verifyLoginPageTitle() {
		
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		
		System.out.println(title);
		
		Assert.assertEquals(title, "Login - Maersk Identity and Access Management Portal");
	}
	/*
	@Test(priority=2)
	public void verifyLoginPageHeader() {
		
		String header = page.getInstance(LoginPage.class).getLoginPageHeader();
		System.out.println(header);
		Assert.assertEquals(header, "Don't have an account?");
	}*/
	
	@Test(priority=2)
	public void doLoginTest() {
		
		HomePage homePage =page.getInstance(LoginPage.class).doLogin("smu262", "Maersk#2");
		
		String headerHome = homePage.getHomePageHeader();
		
		System.out.println(homePage.toString());
		
		//Assert.assertEquals(headerHome, "Getting started with HubSpot");
	}
}
