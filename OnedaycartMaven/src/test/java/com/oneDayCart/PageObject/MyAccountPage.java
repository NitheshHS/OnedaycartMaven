package com.oneDayCart.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Utility;

public class MyAccountPage {
	@FindBy(xpath="//a[.='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(xpath="//a[.='Address Book']")
	private WebElement addressBookLink;
	
	@FindBy(id="telephone")
	private WebElement mobileNoTF;
	
	@FindBy(id="land_phone")
	private WebElement landPhoneTF;
	
	@FindBy(id="street_1")
	private WebElement streetTF1;
	
	@FindBy(id="street_2")
	private WebElement streetTF2;
	
	@FindBy(id="city")
	private WebElement cityTF;
	
	@FindBy(name="postcode")
	private WebElement postcodeTF;
	
	@FindBy(id="land_mark")
	private WebElement landmarkTF;
	
	@FindBy(id="region_id")
	private WebElement stateDropdown;
	
	@FindBy(id="country")
	private WebElement countryDropdown;
	
	@FindBy(xpath="//span[.='Save Address']")
	private WebElement saveaddressBT;

	@FindBy(xpath="//h3[.='Newsletters']/following-sibling::a[.='Edit']")
	private WebElement newsletterLink;
	
	@FindBy(id="subscription")
	private WebElement subscriptionCheckBox;
	
	@FindBy(xpath="//span[.='Save']")
	private WebElement saveBT;
	
	@FindBy(xpath="//a[.='Billing Agreements']")
	private WebElement billingagreeLink;
	
	@FindBy(xpath="//h1[.='Billing Agreements']")
	private WebElement billinginfo;
	
	public WebElement getMyAccountLink() {
		return myAccountLink;
	}

	public WebElement getAddressBookLink() {
		return addressBookLink;
	}

	public WebElement getMobileNoTF() {
		return mobileNoTF;
	}

	public WebElement getLandPhoneTF() {
		return landPhoneTF;
	}

	public WebElement getStreetTF1() {
		return streetTF1;
	}

	public WebElement getStreetTF2() {
		return streetTF2;
	}

	public WebElement getCityTF() {
		return cityTF;
	}

	public WebElement getPostcodeTF() {
		return postcodeTF;
	}

	public WebElement getLandmarkTF() {
		return landmarkTF;
	}

	public WebElement getStateDropdown() {
		return stateDropdown;
	}

	public WebElement getCountryDropdown() {
		return countryDropdown;
	}

	public WebElement getSaveaddressBT() {
		return saveaddressBT;
	}
	
	public WebElement getNewsletterLink() {
		return newsletterLink;
	}

	public WebElement getSubscriptionCheckBox() {
		return subscriptionCheckBox;
	}

	public WebElement getSaveBT() {
		return saveBT;
	}
	
	
	public WebElement getBillingagreeLink() {
		return billingagreeLink;
	}

	public WebElement getBillinginfo() {
		return billinginfo;
	}

	public void AddressBook(String mobileNo,String landPhoneNo,String street1,String street2,String city,
			String postcode,String landmark) {
		myAccountLink.click();
		Reporter.log("click on my account", true);
		Utility.scrollBy(addressBookLink.getLocation().getY());
		addressBookLink.click();
		Reporter.log("click on address book", true);
		mobileNoTF.sendKeys(mobileNo);
		Reporter.log("enter mobile number", true);
		landPhoneTF.sendKeys(landPhoneNo);
		Reporter.log("enter land phone number", true);
		streetTF1.sendKeys(street1);
		Reporter.log("enter street1 address", true);
		streetTF2.sendKeys(street2);
		Reporter.log("enter street2 address", true);
		Utility.scrollBy(cityTF.getLocation().getY());
		cityTF.sendKeys(city);
		Reporter.log("enter city", true);
		postcodeTF.sendKeys(postcode);
		Reporter.log("enter postal code", true);
		landmarkTF.sendKeys(landmark);
		Reporter.log("enter land mark", true);
		Utility.selectByVisibletext(stateDropdown, "Kerala");
		Reporter.log("select state", true);
		Utility.selectByVisibletext(countryDropdown, "India");
		Reporter.log("select country", true);
		Utility.scrollBy(saveaddressBT.getLocation().getY());
		saveaddressBT.click();
		Reporter.log("click on save address button", true);
	}
	
	public void newsLetter() {
		myAccountLink.click();
		Reporter.log("click on my account", true);
		Utility.scrollBy(newsletterLink.getLocation().getY());
		newsletterLink.click();
		Reporter.log("click on newsletter subscription", true);
		subscriptionCheckBox.click();
		Reporter.log("click on checkbox", true);
		saveBT.click();
		Reporter.log("click on save button", true);
	}
	
	public void billingAgreement() {
		myAccountLink.click();
		Reporter.log("click on my account", true);
		Utility.scrollBy(billingagreeLink.getLocation().getY());
		billingagreeLink.click();
		Reporter.log("click on billing agreement", true);
		Assert.assertEquals("BILLING AGREEMENTS", billinginfo.getText());
	}
}
