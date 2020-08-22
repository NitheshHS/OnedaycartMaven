package com.oneDayCart.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import com.oneDayCart.GenericLib.Base;
import com.oneDayCart.GenericLib.Utility;
/**
 * This class contains elements in home page, getters method and business logic
 * @author Nithesh H S
 *
 */
public class HomePage 
{	
	@FindBy(linkText="Register")
	private WebElement registerLink;
	@FindBy(linkText="Log In")
	private WebElement logInlink;
	@FindBy(linkText="Checkout")
	private WebElement checkoutlink;
	@FindBy(xpath="//div[@class='theme-text-color' and @id='tawkchat-status-text-container']")
	private WebElement chatoff;
	@FindBy(xpath="//a[contains(@title,'My Cart')]")
	private WebElement mycartLink;
	@FindBy(xpath="//a[contains(@title,'My Wishlist')]")
	private WebElement mywishlistLink;
	@FindBy(linkText="My Account")
	private WebElement myAccountLink;
	@FindBy(xpath="//input[contains(@placeholder,'Search ')]")
	private WebElement searchBar;
	@FindBy(linkText="GROCERY")
	private WebElement grocerylink;
	@FindBy(linkText="FRUITS & VEG")
	private WebElement fruitsvegLink;
	@FindBy(xpath="//span[.='GROCERY& STAPLES']")
	private WebElement groceryAndSaples;
	public WebElement getGroceryAndSaples() {
		return groceryAndSaples;
	}
	@FindBy(xpath="//a[.=' Intertoons Internet Services Pvt. Ltd. ']")
	private WebElement liNk;
	public WebElement getLiNk() {
		return liNk;
	}
	@FindBy(linkText="FISH & MEAT")
	private WebElement fishmeatLink;
	@FindBy(linkText="FOOD")
	private WebElement foodLink;
	@FindBy(linkText="PERSONAL CARE")
	private WebElement personalcareLink;
	@FindBy(linkText="STATIONERY")
	private WebElement stationaryLink;

	@FindBy(linkText="HOUSEHOLD")
	private WebElement householdLink;
	
	@FindBy(xpath="//a[.='Shoe Brush']")
	private WebElement shoebrushLink;
	
	@FindBy(xpath="//a[.='Shoe Polish']")
	private WebElement shoepolishLink;
	
	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement addtocartBT;
	
	public WebElement getShoebrushLink() {
		return shoebrushLink;
	}
	public WebElement getShoepolishLink() {
		return shoepolishLink;
	}
	public WebElement getAddtocartBT() {
		return addtocartBT;
	}
	@FindBy(linkText="ELECTRONICS & LED")
	private WebElement electronicsLink;
	@FindBy(linkText="SPORTS")
	private WebElement sportsLink;
	@FindBy(xpath="//a[.='RICE & RICE PRODUCTS']")
	private WebElement riceproductLink;
	@FindBy(linkText="FLOURS & ATTA")
	private WebElement floursattaLink;
	@FindBy(linkText="DALS & PULSES")
	private WebElement dalspulsesLink;
	@FindBy(linkText="SPICES & MASALAS")
	private WebElement spicesmasalaLink;
	@FindBy(linkText="SALT, SUGAR & JAGGERY")
	private WebElement saltsugarLink;
	@FindBy(xpath="//span[.='Add to Cart']")
	private WebElement addtoCart;
	public WebElement getAddtoCart() {
		return addtoCart;
	}
	@FindBy(linkText="EDIBLE OILS")
	private WebElement edibleoilLink;
	@FindBy(linkText="VEGETABLES")
	private WebElement vegetableLink;
	@FindBy(linkText="FRUITS")
	private WebElement fruitLink;
	@FindBy(linkText="FROZEN MEAT")
	private WebElement frozenmeatLink;
	@FindBy(linkText="READY TO COOK")
	private WebElement readytocookLink;
	@FindBy(linkText="DAIRY PRODUCTS")
	private WebElement dairyproductLink;
	@FindBy(linkText="Eggs")
	private WebElement eggsLink;
	@FindBy(linkText="READY MADE")
	private WebElement readymadeLink;
	@FindBy(linkText="BABY FOODS")
	private WebElement babyfoodLink;
	@FindBy(linkText="FRYUMS & PAPAD")
	private WebElement  fryumpapadLink;
	@FindBy(linkText="CEREALS & BREKFASTS")
	private WebElement cerealsbreakfastLink;
	@FindBy(linkText="READY TO EAT")
	private WebElement readytoeatLink;
	@FindBy(linkText="SNACKS")
	private WebElement snaksLink;
	@FindBy(linkText="BISCUITS")
	private WebElement biscuitsLink;
	@FindBy(linkText="DRINKS")
	private WebElement drinksLink;
	@FindBy(linkText="SOFT DRINKS")
	private WebElement softdrinksLink;
	@FindBy(linkText="TEA & COFFE")
	private WebElement teacoffeeLink;
	@FindBy(linkText="HEALTH DRINKS")
	private WebElement healthdrinkLink;
	@FindBy(linkText="BEAUTY CARE")
	private WebElement beautycareLink;
	@FindBy(linkText="BODY CARE")
	private WebElement bodycareLink;
	@FindBy(linkText="HAIR CARE")
	private WebElement haircareLink;
	@FindBy(linkText="DELIVERY LOCATIONS")
	private WebElement deliverylocLink;
	@FindBy(id="menu_pincode")
	private WebElement menupinTF;
	@FindBy(id="menu_p_check")
	private WebElement checkButton;
	@FindBy(linkText="Log Out")
	private WebElement logoutLink;
	@FindBy(xpath="//a[@class='scrollup']")
	private WebElement topButton;
	public WebElement getGrocery() {
		return grocery;
	}
	@FindBy(xpath="//a[.='Jaggery']")
	private WebElement jaggery;
	public WebElement getJaggery() {
		return jaggery;
	}
	public WebElement getBlend() {
		return blend;
	}
	@FindBy(xpath="//strong[.='BLENDED OIL']")
	private WebElement blend;
	@FindBy(xpath="//a[.='grocerylink']")
	private WebElement grocery;
	@FindBy(xpath="//button[.='×']")
	private WebElement closeNotification;

	@FindBy(xpath="//span[@class='msgs']")
	private WebElement deliveryMsg;
	@FindBy(xpath="//button[.='×']")
	private WebElement closePushNotificationBT;
	
	@FindBy(xpath="//a[.='View cart']")
	private WebElement shoppingcart;
	
	@FindBy(xpath="//a[@title='Shopping cart']")
	private WebElement shoppingcartInfo;
	
	public WebElement getShoppingcart() {
		return shoppingcart;
	}
	
	public WebElement getShoppingcartInfo() {
		return shoppingcartInfo;
	}
	public WebElement getClosePushNotificationBT() {
		return closePushNotificationBT;
	}
	public WebElement getDeliveryMsg() {
		return deliveryMsg;
	}

	@FindBy(xpath="//a[.='Blended oil']")
	private WebElement blendOil;
	public WebElement getBlendOil() {
		return blendOil;

	}
	public WebElement getChatoff() {
		return chatoff;
	}
	public WebElement getTopButton() {
		return topButton;
	}
	public WebElement getCloseNotification() {
		return closeNotification;
	}
	public WebElement getRegisterLink() {
		return registerLink;
	}
	public WebElement getLogInlink() {
		return logInlink;
	}
	public WebElement getCheckoutlink() {
		return checkoutlink;
	}
	public WebElement getMycartLink() {
		return mycartLink;
	}
	public WebElement getMywishlistLink() {
		return mywishlistLink;
	}
	public WebElement getMyAccountLink() {
		return myAccountLink;
	}
	public WebElement getSearchBar() {
		return searchBar;
	}
	public WebElement getGrocerylink() {
		return grocerylink;
	}
	public WebElement getFruitsvegLink() {
		return fruitsvegLink;
	}
	public WebElement getFishmeatLink() {
		return fishmeatLink;
	}
	public WebElement getFoodLink() {
		return foodLink;
	}
	public WebElement getPersonalcareLink() {
		return personalcareLink;
	}
	public WebElement getStationaryLink() {
		return stationaryLink;
	}
	public WebElement getHouseholdLink() {
		return householdLink;
	}
	public WebElement getElectronicsLink() {
		return electronicsLink;
	}
	public WebElement getSportsLink() {
		return sportsLink;
	}
	public WebElement getRiceproductLink() {
		return riceproductLink;
	}
	public WebElement getFloursattaLink() {
		return floursattaLink;
	}
	public WebElement getDalspulsesLink() {
		return dalspulsesLink;
	}
	public WebElement getSpicesmasalaLink() {
		return spicesmasalaLink;
	}
	public WebElement getSaltsugarLink() {
		return saltsugarLink;
	}
	public WebElement getEdibleoilLink() {
		return edibleoilLink;
	}
	public WebElement getVegetableLink() {
		return vegetableLink;
	}
	public WebElement getFruitLink() {
		return fruitLink;
	}
	public WebElement getFrozenmeatLink() {
		return frozenmeatLink;
	}
	public WebElement getReadytocookLink() {
		return readytocookLink;
	}
	public WebElement getDairyproductLink() {
		return dairyproductLink;
	}
	public WebElement getEggsLink() {
		return eggsLink;
	}
	public WebElement getReadymadeLink() {
		return readymadeLink;
	}
	public WebElement getBabyfoodLink() {
		return babyfoodLink;
	}
	public WebElement getFryumpapadLink() {
		return fryumpapadLink;
	}
	public WebElement getCerealsbreakfastLink() {
		return cerealsbreakfastLink;
	}
	public WebElement getReadytoeatLink() {
		return readytoeatLink;
	}
	public WebElement getSnaksLink() {
		return snaksLink;
	}
	public WebElement getBiscuitsLink() {
		return biscuitsLink;
	}
	public WebElement getDrinksLink() {
		return drinksLink;
	}
	public WebElement getSoftdrinksLink() {
		return softdrinksLink;
	}
	public WebElement getTeacoffeeLink() {
		return teacoffeeLink;
	}
	public WebElement getHealthdrinkLink() {
		return healthdrinkLink;
	}
	public WebElement getBeautycareLink() {
		return beautycareLink;
	}
	public WebElement getBodycareLink() {
		return bodycareLink;
	}
	public WebElement getHaircareLink() {
		return haircareLink;
	}
	public WebElement getDeliverylocLink() {
		return deliverylocLink;
	}
	public WebElement getMenupinTF() {
		return menupinTF;
	}
	public WebElement getCheckButton() {
		return checkButton;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public void clickOnlogin() {
		logInlink.click();
	}
	public void clickOncheckout() {
		checkoutlink.click();
	}
	public void clickOnMycart() {
		mycartLink.click();
	}
	public void clickOnMyWishlist() {
		mywishlistLink.click();
	}
	public void clickOnMyAccount() {
		myAccountLink.click();
	}
	
	@FindBy(xpath="//a[@class='scrollup']")
	private WebElement scroolUp;
	public WebElement getScroolUp() {
		return scroolUp;
	}
	@FindBy(xpath="//span[.='Chat? - Offline']")
	private WebElement chat;
	
	public WebElement getChat() {
		return chat;
	}
	
	public void clickonChat() {
		WebDriverWait wait=new WebDriverWait(Base.staticDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(chat));
		chat.click();
	}
	
	public void clickOnSearchBar(String searchprod) {
		searchBar.sendKeys(searchprod,Keys.ENTER);
	}
	public void grocesoryRiceProd() {
		Actions act=new Actions(Base.staticDriver);
		act.moveToElement(grocerylink).moveToElement(riceproductLink).click().build().perform();
	}
	public void grocesoryFlourAtta() {
		Utility.moveToElement(grocerylink);
		floursattaLink.click();
	}
	public void grocesoryDallPulses() {
		Utility.moveToElement(grocerylink);
		dalspulsesLink.click();
	}
	public void grocesorySpiceMasala() {
		Utility.moveToElement(grocerylink);
		spicesmasalaLink.click();
	}
	public void grocesorySaltSuger() {
		Utility.moveToElement(grocerylink);
		saltsugarLink.click();
	}
	public void grocesoryEdibleOil() {
		Utility.moveToElement(grocerylink);
		edibleoilLink.click();
	}
	public void fruitVegetable() {
		Utility.moveToElement(fruitLink);
		vegetableLink.click();
	}
	public void fruits() {
		Utility.moveToElement(fruitLink);
		fruitLink.click();
	}
	public void fishmeat() {
		Utility.moveToElement(fishmeatLink);
		frozenmeatLink.click();
	}	
	public void foodDairyProduct() {
		Utility.moveToElement(foodLink);
		Utility.moveToElement(readytocookLink);
		dairyproductLink.click();
	}
	public void foodReadyMade() {
		Utility.moveToElement(foodLink);
		Utility.moveToElement(readytocookLink);
		readymadeLink.click();
	}
	public void foodSnacks() {
		Utility.moveToElement(foodLink);
		Utility.moveToElement(readytoeatLink);
		snaksLink.click();
	}
	public void foodBuiscuit() {
		Utility.moveToElement(foodLink);
		Utility.moveToElement(readytoeatLink);
		biscuitsLink.click();
	}
	/**
	 * This method provide business logic to check delivery location
	 * @param pincode
	 */
	public void checkDeliverylocation(String pincode) {
		closePushNotificationBT.click();
		Utility.moveToElement(deliverylocLink);
		menupinTF.sendKeys(pincode);
		Reporter.log("enter pincode", true);
		checkButton.click();
		Reporter.log("click on check button", true);
		Assert.assertTrue(deliveryMsg.isDisplayed());
		Reporter.log(deliveryMsg.getText());
	}
	public void clickOnTop() {
		topButton.click();
	}
	/**
	 * This method provide business logic to logout from application
	 */
	public void clickOnLogout() {
		//Point loc = logoutLink.getLocation();
		logoutLink.click();
		
		//Actions ac=new Actions(Base.staticDriver);
		//ac.moveByOffset(loc.getX(), loc.getY()).click().perform();
		
	}
	/**
	 * This method provide business logic to search the product and add the product to cart based on search history
	 * @param search
	 */
	public void search(String search) {
		Reporter.log("entering the product"+search, true);
		searchBar.sendKeys(search, Keys.ENTER);
		WebDriverWait wait=new WebDriverWait(Base.staticDriver, 10);
		wait.until(ExpectedConditions.visibilityOf(addtocartBT));
		addtocartBT.click();
	}
	/**
	 * This method perform scrolling actions
	 */
	public void scrollTopCart() 
	{
		Utility.scrollBy(liNk.getLocation().getY());
		scroolUp.click();
		Reporter.log("click on scroll up button", true);
		mycartLink.click();
		Reporter.log("click on my cart link", true);
	}
	
	public void moveComp()
	{
		WebDriverWait wait=new WebDriverWait(Base.staticDriver, 5);
		
		Utility.moveToElement(grocerylink);
		Utility.moveToElement(blendOil);
		wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(grocerylink, By.xpath("//a[.='Blended oil']")));
		wait.until(ExpectedConditions.elementToBeClickable(blendOil));
		blendOil.click();
		Reporter.log("click on blend oil", true);
		String blendoil = blend.getText();
		Assert.assertEquals("BLENDED OIL", blendoil);
	}
	
	public void continueShopping()
	{
		Actions act=new Actions(Base.staticDriver);
		act.moveToElement(grocerylink).moveToElement(jaggery).click().build().perform();
		Reporter.log("click on jaggery", true);
		Utility.scrollBy(addtoCart.getLocation().getY());
		addtoCart.click();
		Reporter.log("click on add to cart button", true);
		mycartLink.click();
		Reporter.log("click on my cart", true);
	
	}
	/**
	 * This method used to get information of shopping cart
	 */
	public void shoppingCart() {
		shoppingcartInfo.click();
		Reporter.log("click on shopping cart", true);
		Utility.scrollBy(shoppingcart.getLocation().getY());
		shoppingcart.click();
		Reporter.log("click on view cart", true);
	}
	/**
	 * This method provide Business logic for adding items to cart from household submenu
	 */
	public void householdpurchase() {
		Actions act=new Actions(Base.staticDriver);
		act.moveToElement(householdLink).moveToElement(shoebrushLink).click().build().perform();
		Reporter.log("mouse over to "+householdLink.getText()+" and click on shoebrush", true);
		addtocartBT.click();
		Reporter.log("click on add to cart button", true);
		act.moveToElement(householdLink).moveToElement(shoepolishLink).click().build().perform();
		Reporter.log("mouse over to "+householdLink.getText()+" and click on shoepolish", true);
		addtocartBT.click();
		Reporter.log("click on add to cart button", true);
	}
	
	
	
	
	
	
}
