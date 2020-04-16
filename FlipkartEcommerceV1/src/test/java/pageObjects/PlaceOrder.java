package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class PlaceOrder extends BaseClass{ 
		

		@FindBy(xpath="//span[text()='Place Order']")
		@CacheLookup
		WebElement placeorder;

		
		//Initialzing the page objects:
		public PlaceOrder(){
			PageFactory.initElements(driver,this);
		}
		public 	String verifyHomePageTitle(){
			return driver.getTitle();
		}
		public void verifyPlaceOrderButton(){
			placeorder.click();	
		}
}
