package com.EcommerceV1.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.EcommerceV1.pageObjects.HomePage;
import com.EcommerceV1.pageObjects.MyAccountDashBoardVerificationspage;

public class TC_signupTest_001 extends BaseClass {
	@Test
	public void SignUp() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		HomePage hp=new HomePage(driver);
		logger.info("home page reached ");
		hp.signupbtn();
		logger.info("sign in button clicked ");
		hp.signingEmail(username);	
		logger.info("useremail entered");
		hp.signingPass(password);
		logger.info("password is entered");
		hp.submituser();
		logger.info("submit bthn is clicked");
		
		
		MyAccountDashBoardVerificationspage my=new MyAccountDashBoardVerificationspage(driver);
		my.AddAddressTABElementcheck();
		logger.info("since true AddaddressTAB elememnt is working fine");
		my.OrderHistoryTABElementcheck();
		logger.info("since true OrderHistoryTAB elememnt is working fine");
		my.creditclipTABElementcheck();
		logger.info("since true creditclipTAB elememnt is working fine");
		my.MyAddressTABElementcheck();
		logger.info("since true MyAddressTAB elememnt is working fine");
		my.PersonalinfoTABElementcheck();
		logger.info("since true PersonalinfoTAB elememnt is working fine");
		
	}
}
