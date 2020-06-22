package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;

@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class ShoppingCartTest extends Base {
	@Test
	public void shoppingcartTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.shoppingCart();
	}

}
