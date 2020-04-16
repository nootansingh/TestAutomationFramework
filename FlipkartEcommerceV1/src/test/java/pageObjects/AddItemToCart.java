package pageObjects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.CacheLookup;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import testCases.BaseClass;

	public class AddItemToCart extends BaseClass{ 
		

		@FindBy(xpath="//table//td[contains(@class,'_1Nyybr Yun65Y OGBF1g _30XEf0')]/img[@class='sizer']")
		@CacheLookup
		WebElement productimage;
		
		@FindBy(xpath=".//[contains(@class,’_2AkmmA _2Npkh4 _2MWPVK _2K_ZRu’)]")
		@CacheLookup
		WebElement addtobasketbutton;
		
		@FindBy(xpath="//a[cotains(text(),'viewcart']")
		@CacheLookup
		WebElement carticonclick;
		
		
		//Initialzing the page objects:
		public AddItemToCart(){
			PageFactory.initElements(driver,this);
		}
		public 	String verifyHomePageTitle(){
			return driver.getTitle();
		}
		public void verifyProductImage()
		{
			
			productimage.isDisplayed();
		}
		
		public void verifyAddToBasket()
		{
			addtobasketbutton.isEnabled();
			addtobasketbutton.isSelected();
			
		}
		
		public void viewBasket()
		{
			carticonclick.click();
			
		}
		}
