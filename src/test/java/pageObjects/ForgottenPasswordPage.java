package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgottenPasswordPage extends BasePage{

	public ForgottenPasswordPage(WebDriver driver)
	{
		
		super(driver);
		
	}

	
	
	//WebElement Locaters+ identification
	
	
	@FindBy (xpath = "//a[normalize-space()='Forgotten Password']")
	WebElement linkForgottenPassword;
	
	
	
	
	@FindBy (xpath = "//h1[normalize-space()='Forgot Your Password?']")
	WebElement msgConfirmation3;
	
	
	
	//Action methods
	
	public void clickForgottenPassword()
	{
		linkForgottenPassword.click();
	}

	
	
	

	public String getConfirmationMsg3()         //Action Message
	{
		try
		{
			
		  return (msgConfirmation3.getText());
		}
		
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
	
	
	}
	
	
	
	
	
	
	
	
	
}
