package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

	
	   WebDriver driver;

	   
	   // Constructor
	   
	   public BasePage (WebDriver driver)        // This driver will comes from actual Test Case
	     {
	    	
	    	this.driver = driver;                // here we will initiate
	    	 
	    	PageFactory.initElements(driver, this);
	    	
	     }
	
	
	   
	   
	   
}
