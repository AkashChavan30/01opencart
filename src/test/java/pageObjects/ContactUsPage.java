package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage  extends BasePage
 {

	
	public ContactUsPage(WebDriver driver)
	{	
		super(driver);
	}
	
	
	//WebElement Locaters + identification
	

	@FindBy (xpath ="//a[normalize-space()='Contact Us']")
	WebElement linkContactUs;
	
	
	@FindBy (id ="input-name")
	WebElement txtYourName;
	
	
	@FindBy (id ="input-email")
	WebElement txtEmailAddress;
	
	
	@FindBy (id ="input-enquiry")
	WebElement txtEnquiry;
	
	
	@FindBy (xpath ="//button[normalize-space()='Submit']")
	WebElement butSubmit;
	
	
	
	
	@FindBy (xpath="//h1[normalize-space()='Contact Us']")
	WebElement msgConfirmation;
	
	
	
	
	
	//Action Methods
	
	
	public void clickContactUs()
	{
		linkContactUs.click();
	}
	
	
	
	
	public void setYourName(String Yname)
	{
		txtYourName.sendKeys(Yname);
	}
	
	
	
	
	public void setEmailAddress(String emailaddress)
	{	
		txtEmailAddress.sendKeys(emailaddress);
	}
	
	
	
	public void setEnquiryTxt(String enquirytxt)
	{
		txtEnquiry.sendKeys(enquirytxt);
	}
	
	
	
	public void clickSubmit()
	{
		butSubmit.click();
	}
	
	
	
	public String getConfirmationMsg2()
	{
		try
		{
			return(msgConfirmation.getText());
		}
		
		catch(Exception b)
		{
			return(b.getMessage());
		}
	}
	
	
	
	
	
	
	
	
 }
