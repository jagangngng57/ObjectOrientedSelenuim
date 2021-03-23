/**
 * 
 */
package com.oops.concepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author U42761
 *
 */
public class LoginPage extends BasePage{
	
	//Page Locators
	private By emaiId = By.xpath("//*[@id=\"usernameInput\"]");
	private By password = By.xpath("//*[@id=\"passwordInput\"]");
	private By loginButton = By.xpath("//*[@id=\"login-form\"]/button");
	private By header ;

	public LoginPage(WebDriver driver) {
		super(driver);		
	}

	public WebElement getEmaiId() {
		return getElement(emaiId);
	}	

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}
	public WebElement getHeader() {
		return getElement(header);
	}


	public String getLoginPageTitle() {
		
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		
		return getPageHeader(header);
	}
	
	/**
	 * This is for doLoginPage and landing to HomePage
	 * @param userName
	 * @param pwd
	 * @return
	 */
	
	public HomePage doLogin(String userName,String pwd) {
		
		if(userName.contains("smu262")) {
			
			
			WebDriverWait wait_coi_banner_wrapper = new WebDriverWait(driver, 30);
            wait_coi_banner_wrapper
                    .until(ExpectedConditions.visibilityOfElementLocated(
                            By.xpath("//*[@class='coi-banner__accept coi-banner__accept--fixed-margin']")))
                    .click();
			getEmaiId().sendKeys(userName);
			getPassword().sendKeys(pwd);
			getLoginButton().click();
		}

		
		return getInstance(HomePage.class);
	}
	
	
	
	//Method Overloading
	
	public void doLogin(String userName) {
		
		if(userName.contains("username")) {
			getEmaiId().sendKeys(userName);
		}
		getLoginButton().click();
	}
	
	
}
