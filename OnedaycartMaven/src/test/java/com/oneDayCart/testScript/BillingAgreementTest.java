package com.oneDayCart.testScript;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.PageObject.MyAccountPage;

@Listeners(com.oneDayCart.GenericLib.ListenImp.class)
/**
 * This script written for adding billing agreement
 * @author Nithesh H S
 *
 */
public class BillingAgreementTest extends Base {
	@Test
	public void billingAgreementTest()
	{
		MyAccountPage myacc=PageFactory.initElements(driver, MyAccountPage.class);
		myacc.billingAgreement();
		
	}
}
