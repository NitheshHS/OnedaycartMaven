package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.GroceryPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script is written for to test grocery items
 * @author Nithesh H S
 *
 */
public class addGroceryTest extends Base{
	@Test
	public void addgroceryTest() {
		GroceryPage gross = PageFactory.initElements(driver, GroceryPage.class);
		gross.addGrocery("PONNI RICE (LOOSE)", "1 KG");
	}
}
