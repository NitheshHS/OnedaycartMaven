package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.MyAccountPage;
@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script written for adding address 
 * @author Nithesh H S
 *
 */
public class AddressBookTest extends Base{
	@DataProvider
	public Object[][] readdata(){
		return fi.readAlldataFromExcel("address");
	}
	@Test(dataProvider="readdata")
	public void addressBookTest(String mobileNo,String landPhoneNo,String street1,String street2,String city,
			String postcode,String landmark)
	{
		MyAccountPage add = PageFactory.initElements(driver, MyAccountPage.class);
		add.AddressBook(mobileNo, landPhoneNo, street1, street2, city, postcode, landmark);
	}
}
