package testCases;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.ReadConfig;

public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;

	//Creating constructor
	public BaseClass(){
		try{
			prop = new Properties();
					FileInputStream ip = new FileInputStream("C:/Users/nootan.singh/workspace/FlipkartEcommerceV1/Configuration/config.properties");
		prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
		e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void failed()
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,new File("C:/Users/nootan.singh/workspace/FlipkartEcommerceV1/Screenshots"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	//creating method
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver","C:/Users/nootan.singh/workspace/FlipkartEcommerceV1/Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.findElement(By.xpath("span[contains(text(),'Enter Email/Mobile number')]//parent::label//preceding-sibling::input")).sendKeys("singhnootan13@gmail.com");
		}
		else
			if(browserName.equals("FF")){
				System.setProperty("webdriver.gecko.driver","C:/Users/nootan.singh/workspace/FlipkartEcommerceV1/Drivers/geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		
	        
			
	}
		
}
}
