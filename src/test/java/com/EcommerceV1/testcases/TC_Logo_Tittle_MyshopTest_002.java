package com.EcommerceV1.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EcommerceV1.pageObjects.HomePage;
import com.EcommerceV1.pageObjects.logo_tittlepage;

public class TC_Logo_Tittle_MyshopTest_002 extends BaseClass{
	@Test
	public void Logo_TitleCheck() throws IOException {
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


		logger.info("logo check start");
		logo_tittlepage logo=new logo_tittlepage(driver);
		WebElement logoElement=logo.logochecking();
		String altText=logoElement.getAttribute("alt");
		if(altText.equals("My Shop")){
			Assert.assertTrue(true);
		}else {
		System.out.println(altText);
		Assert.assertTrue(false);
		CaptureScreenShot(driver,"Logo_TitleCheck");
		logger.info("Screenshot should take");
		}
		 // Verify the logo's dimensions
        int logoWidth = Integer.parseInt(logoElement.getAttribute("width"));
        int logoHeight = Integer.parseInt(logoElement.getAttribute("height"));
        System.out.println(logoWidth);
        System.out.println(logoHeight);
      
        try {
            Assert.assertEquals(logoWidth, 293, "Logo width does not match.");
            Assert.assertEquals(logoHeight, 83, "Logo height does not match.");
            
            logger.info("Logo test is done");
        } catch (AssertionError e) {
            String testName = "Logo_TitleCheck";  // Use the appropriate test name
            CaptureScreenShot(driver,"Logo_TitleCheck");
            logger.info("its in the dimension error");
            logger.info("Screenshot should take");
            throw e;
        }
		}
		
	}
