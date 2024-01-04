package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage  {

	
	  public AccountRegistrationPage (WebDriver driver)
	  {
	
	   super(driver);
	
	  }
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//WebElement Locaters + identification
	
	@FindBy (name = "firstname")
	WebElement textFristname;
	
	
	@FindBy(name = "lastname") 
	WebElement textLastname;
	
	
	@FindBy (name = "email")
	WebElement textEmail;
	
	
	@FindBy (name = "password")
	WebElement textPassword;
	
	
	@FindBy (xpath= "//a[normalize-space()='login page']")
	WebElement scrolllogin;
	
	
	
	
	@FindBy (name = "agree")
	WebElement checkPolicy;
	
	
	@FindBy (xpath ="//button[normalize-space()='Continue']")
	WebElement butContinue;
	
	
	@FindBy (xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;
	
	
	
	//Action methods
	
	public void setFirstName(String fname)
	{
		
		textFristname.sendKeys(fname);
		
	}
	
	
	
	public void setLastName (String lname )
	{
		
		textLastname.sendKeys(lname);
	}
	
	
	
	
	public void setEmail(String email)
	{
		textEmail.sendKeys(email);
		
	}
	
	
	
	public void setPassword(String pwd)
	{
		textPassword.sendKeys(pwd);
	}
	
	
	public void scrollLoginPage()
	{
		js.executeScript("arguments[0].scrollIntoView();", scrolllogin);
	}
	
	public void setPrivacyPolicy()
	{
		checkPolicy.click();
	}
	
	

	public void clickContinue()
	{
		butContinue.click();
	}
			
	
	
	
	public String getConfirmationMsg()         //Action Message
	{
		try
		{
			
		  return (msgConfirmation.getText());
		}
		
		catch(Exception e)
		{
			return (e.getMessage());
		}
		
		
	}



	
	
	
	
	 
}
