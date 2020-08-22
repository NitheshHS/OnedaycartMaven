package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.GroceryPage;
import com.oneDayCart.PageObject.HomePage;
import com.oneDayCart.PageObject.MyCartPage;
import com.oneDayCart.PageObject.MyWishListPage;

@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script written for add product to cart 
 * @author Nithesh H S
 *
 */
public class AddAllCartTest extends Base{
	/**
	 * This method used to add the product cart by using search history
	 */
	@Test
	public void addAllToCartTest() {
		home=PageFactory.initElements(driver, HomePage.class);
		home.search("Atta");
		home.clickOnMycart();
		MyCartPage mycart = PageFactory.initElements(driver, MyCartPage.class);
		mycart.moveToWishList();
		home.clickOnMyWishlist();
		MyWishListPage mywish = PageFactory.initElements(driver, MyWishListPage.class);
		mywish.addAllToCart();
	}
}
