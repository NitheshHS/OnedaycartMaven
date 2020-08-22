package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.GroceryPage;
import com.oneDayCart.PageObject.HomePage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This scripts written for adding item to cart based on search history
 * @author user
 *
 */
public class SearchBarTest extends Base {
	@Test
	public void searchProductTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.search("Rice products");
		GroceryPage gross = PageFactory.initElements(driver, GroceryPage.class);
		gross.addAllprodToCart();
	}
}
