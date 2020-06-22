package com.oneDayCart.PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;

public class Grocery {

	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement addcartButtons;
	
	@FindBy(xpath="//select[@class='pdt-select']")
	private WebElement selectQTYdrop;
	
	@FindBy(name="qty")
	private WebElement qtyTF;
	
	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement addtocartButton;
	
	@FindBy(xpath="RICE & RICE PRODUCTS")
	private WebElement riceproductInfo;
	
	@FindBy(xpath="//img[@alt='tick']")
	private WebElement checkmarkMSG;
	
	@FindBy(xpath="//a[contains(@href,'price=600')]")
	private WebElement price600;
	
	public WebElement getSelectQTYdrop() {
		return selectQTYdrop;
	}
	public WebElement getQtyTF() {
		return qtyTF;
	}
	public WebElement getAddtocartButton() {
		return addtocartButton;
	}
	public WebElement getRiceproductInfo() {
		return riceproductInfo;
	}

	public WebElement getCheckmarkMSG() {
		return checkmarkMSG;
	}

	public WebElement getAddcartButtons() {
		return addcartButtons;
	}
	public void addGrocery(WebDriver driver,String search, String kGgrams) {
		HomePage home = PageFactory.initElements(driver, HomePage.class);
		home.search(search);
		Reporter.log("search product", true);
		Utility.selectByVisibletext(selectQTYdrop, kGgrams);
		addtocartButton.click();
		Reporter.log("click on add to cart button", true);

	}
	public void addAllprodToCart() {
		addcartButtons.click();
		Reporter.log("click on add cart button", true);
	}
	
	
}
