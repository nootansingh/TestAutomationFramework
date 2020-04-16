package pageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testCases.BaseClass;

public class LoginPage extends BaseClass{
	
	@FindBy(xpath="span[contains(text(),'Enter Email/Mobile number')]//parent::label//preceding-sibling::input")
	@CacheLookup
	WebElement username;
	
	@FindBy(xpath="[@type='submit']")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit' and @class='_2AkmmA _1LctnI _7UHT_c']")
	@CacheLookup
	WebElement btnLogin;
	
	//Creating constructor - initializing the page objects
		public LoginPage() 
		{
			
			PageFactory.initElements(driver,this);
		}
	
	//Actions
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}

	public HomePage login (String un ,String pwd){
		username.sendKeys(un);
        password.sendKeys(pwd);
        btnLogin.click();
        return new HomePage();
	}

}

