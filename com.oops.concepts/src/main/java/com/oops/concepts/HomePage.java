package com.oops.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
	
	private By header = By.className("private-page__title");

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public String getLoginPageTitle() {
		
		return getPageTitle();
	}
	
	public String getHomePageHeader() {
		
		return getPageHeader(header);
	}
}
