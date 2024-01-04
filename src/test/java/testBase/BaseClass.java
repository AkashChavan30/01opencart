package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;  // logging

public class BaseClass {

	
	
	public static  WebDriver driver;    // Make every thing as public , Because we are trying to access everywhere

	
	public static Logger logger;     // for logging
	
	
	
	@BeforeSuite
	public void setup()
	{
		
		logger = LogManager.getLogger(this.getClass());   // logging 
		
		
		ChromeOptions options = new ChromeOptions();
		
		
		options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"});
		
		
		
		
		driver = new ChromeDriver(options);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		
		
		driver.get("https://demo.opencart.com/");
		
		driver.manage().window().maximize();
		
		
		
	}
	
	

	@AfterSuite 
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	
	
	public String randomString()
	{
		
		 String generetedString = RandomStringUtils.randomAlphabetic(5);
		 
		 return(generetedString);
	}
	
	
	
	
	
	
	public String randomNumber()                                       //  For Number , No need to convert string into integer because 
	{                                                                  // sendKeys accepts only string   sendKeys("12345");
		
		String generetedString2 =RandomStringUtils.randomNumeric(5);
		
		return(generetedString2);
		
	}
	
	
	
	public String randomAlphaNumeric()
	{
		String str = RandomStringUtils.randomAlphabetic(4);
		
		String num =RandomStringUtils.randomNumeric(3);
		
		
		return(str+"@"+num);
		
	}
	
	
	
	
	
}
