package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.MyAccountPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class NewsletterSubscriptionTest extends Base{
	@Test
	public void newsletterSubscriptionTest()
	{
		MyAccountPage add = PageFactory.initElements(driver, MyAccountPage.class);
		add.newsLetter();
	}
	
}
