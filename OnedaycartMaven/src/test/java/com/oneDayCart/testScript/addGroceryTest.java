package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.Grocery;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
public class addGroceryTest extends Base{
	@Test
	public void addgroceryTest() {
		Grocery gross = PageFactory.initElements(driver, Grocery.class);
		gross.addGrocery(driver, "PONNI RICE (LOOSE)", "1 KG");
	}
}
