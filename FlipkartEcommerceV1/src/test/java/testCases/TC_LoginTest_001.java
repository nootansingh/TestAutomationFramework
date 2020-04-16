package testCases;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageObjects.AddItemToCart;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PlaceOrder;

public class TC_LoginTest_001 extends BaseClass{
	LoginPage loginPage;
	HomePage homePage;
	AddItemToCart additemtocart;
	PlaceOrder placeorder;
	
//creating constructor
	public TC_LoginTest_001(){
		super();
	}
 
 @BeforeMethod
	public void setUp(){
		initialization();
	loginPage= new LoginPage();
	homePage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
 
 @Test(priority=1)
 
 public void loginPageTitleTest(){
	 String title = loginPage.validateLoginPageTitle(); 	 	
 }
 
 @Test(priority=2)
 public void verifySearchItemTest(){
	 homePage.selectSearchItem();
 }
 
 @Test(priority=3)
 public void verifySearchButtonTest(){
	 homePage.selectSearchItem();
 
 }
 @Test(priority=4)
 public void verifyAddToBasketButtonTest(){
	 additemtocart.viewBasket();
 
 }
 @Test(priority=5)
 public void verifyPlaceOrderButtonTest(){
	 placeorder.verifyPlaceOrderButton();
 
 }
 
 
 @AfterMethod
 
 public void tearDown(){
	 driver.quit();
	 
 }
 
 @Test
 public void takeScreenshotTest(){
	 Assert.assertEquals(false,true);
 
 }
 
}