package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class HomePage extends BaseClass {
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	@CacheLookup
	WebElement searchItem;
	
	@FindBy(xpath="//span[text()='Wow Skin Science Activated Charcoal Face Mask']")
	@CacheLookup
	WebElement faceProduct;
	
	@FindBy(xpath="//div[@class='col-1-12']/button[@class='vh79eN']")
	@CacheLookup
	WebElement searchButton;
	
	//Initialzing the page objects:
	public HomePage(){
		PageFactory.initElements(driver,this);
	}
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	public void verifyEnterItem(){
		faceProduct.sendKeys("Wow Skin Science Activated Charcoal Face Mask");
		
	}
	public void selectSearchItem(){
		searchItem.isSelected();
	}

	
	}

