package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script written for move the item from cart to wishlist
 * @author Nithesh H S
 *
 */
public class WishListTest extends Base{
	@Test
	public void moveItemToWishlistTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.search("Rice");
		home.clickOnMycart();
		MyCartPage mycart = PageFactory.initElements(driver, MyCartPage.class);
		mycart.moveToWishList();
	}

}
