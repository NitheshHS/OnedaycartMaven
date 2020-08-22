package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script written for remove items from cart
 * @author Nitheh H S
 *
 */
public class RemoveCartItemsTest extends Base{
	@Test
	public void removecartItemTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.search("Rice");
		home.clickOnMycart();
		MyCartPage mycart=PageFactory.initElements(driver, MyCartPage.class);
		mycart.removeItem();
	}
}
