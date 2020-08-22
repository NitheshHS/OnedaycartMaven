package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
/**
 * This class provide Business logic for login into application
 * @author Nithesh H S
 *
 */
public class LoginPage {
	@FindBy(id="email")
	private WebElement emailTF;
	@FindBy(id="pass")
	private WebElement passwordTF;
	@FindBy(xpath="//span[.='Login']")
	private WebElement loginButton;
	public WebElement getEmailTF() {
		return emailTF;
	}
	public WebElement getPasswordTF() {
		return passwordTF;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	/**
	 * This method used to login into the application
	 * @param email
	 * @param password
	 */
	public void login(String email, String password) {
		emailTF.sendKeys(email);
		passwordTF.sendKeys(password);
		loginButton.click();
	}
}
