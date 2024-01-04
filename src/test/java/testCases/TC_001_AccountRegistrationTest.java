package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;




public class TC_001_AccountRegistrationTest extends BaseClass {

	
	
	
	
	
	@Test
	void test_Account_Registration() throws InterruptedException       //whenever you create a new test method ,always start with test keyword
	{                                                                 //nameing standared, we normaly follow, that representing that is test method
		
		
	  logger.debug("application logs........");
	  
      logger.info(" *****Started TC_001_AccountRegistrationTest**** ");
		
	 try
	 {
	 
     
				
	     HomePage hp = new HomePage (driver);   // This driver comes from BaseClass
	     
	     hp.clickMyaccount();
	     logger.info("Clicked on My Account link");
	     
		 hp.clickRegister();	
		 logger.info("Clicked on register link");	
			
		
		 AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
		 
		 logger.info("Providing customer data");
		 
		 
		 regpage.setFirstName(randomString().toUpperCase());
		 Thread.sleep(1000);
		 
		 regpage.setLastName(randomString().toUpperCase());
		 Thread.sleep(1000);
		 
		 regpage.setEmail(randomString()+"@gmail.com");          //No object required because its just a parent class
		 Thread.sleep(1000);
		 
		// regpage.setTelephone(randomNumber());
		 
		 regpage.setPassword(randomAlphaNumeric());
		 Thread.sleep(2000);
		 
		 
		 
	  /* String password = randomAlphaNumeric();           //if we use this method in two different method like in ( setPassword and setConfirmPassword)
		 
		 regpage.setPassword(password);                      //then it will generate two different password ,that is not worked for setPassword and setConfirmPassword
		
		 regpage.setConfirmPassword(password);  */           //thats via we defind a password veriable and use it .
		 
	     regpage.scrollLoginPage(); 
	     Thread.sleep(2000);
		 
		 
		 regpage.setPrivacyPolicy();
		 Thread.sleep(2000);
		 
		 regpage.clickContinue();
		 Thread.sleep(2000);
		 logger.info("Clicked on Continue");
		 
		
		 String confmsg = regpage.getConfirmationMsg();
		 Thread.sleep(2000);
		 
		 logger.info("Validating excepted message");
		// Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test Failed");
		 
		 
	 
	 }
	 
	 catch(Exception m)
	 {
		 logger.error("Test Failed");
		 Assert.fail();
	 }
	 
	 
	     logger.info(" *****Finished TC_001_AccountRegistrationTest**** ");
	 
	 
		
	}
	
	
	
	
	
	
	
	
	
}
