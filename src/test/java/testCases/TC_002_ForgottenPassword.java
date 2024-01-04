package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgottenPasswordPage;
import testBase.BaseClass;

public class TC_002_ForgottenPassword extends BaseClass {

	
	@Test
	void test_Forgotten_Password() throws InterruptedException
	{
		
		  logger.debug("application logs........");
		  
	      logger.info(" *****Started TC_002_AccountRegistrationTest**** ");
			
		 try
		 {	 Thread.sleep(2000);
				
		    
		
			 ForgottenPasswordPage fp = new ForgottenPasswordPage(driver);
		
		
		     fp.clickForgottenPassword();
		    logger.info("Clicked on register link");    
		      
		
		     Thread.sleep(5000);
		
		
			 String confmsg = fp.getConfirmationMsg3();
			 Thread.sleep(2000);
			 
			 logger.info("Validating excepted message");
			 Assert.assertEquals(confmsg, "Forgot Your Password?","Test Failed");
			       
				
	      }
	
	
			 
			 catch(Exception m)
			 {
				 logger.error("Test Failed");
				 Assert.fail();
			 }
			 
			 
			     logger.info(" *****Finished TC_002_AccountRegistrationTest**** ");
			 
	}
	
	
}
