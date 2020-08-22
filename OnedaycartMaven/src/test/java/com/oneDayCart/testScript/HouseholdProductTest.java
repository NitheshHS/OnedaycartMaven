package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;

@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script written for household item and adding into cart page
 * @author Nithesh H S
 *
 */
public class HouseholdProductTest extends Base {
	@Test
	public void householdproductTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.householdpurchase();
	}

}
