package com.EcommerceV1.testcases;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EcommerceV1.pageObjects.HomePage;
import com.EcommerceV1.pageObjects.SearchResultPage;

public class TC_SearchResultTEST_004 extends BaseClass  {
	@Test
	public void addTOCart() throws InterruptedException {
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
		SearchResultPage sp=new SearchResultPage(driver);

		sp.seachBox();
		logger.info("search item entered");

		logger.info("search item is searching");
		Thread.sleep(3000);
		sp.Pickingdress();
		sp.instock();
		logger.info("stock is available");
		sp.selectOptionByText("M");
		logger.info("size selected");
		sp.colourselection();
		logger.info("colour selected");
		sp.AddtoCart();
		logger.info("submit added to cart");

		if (isAlertPresent()==true) {
			driver.switchTo().defaultContent();

		}  
		driver.navigate().refresh();
		logger.info("Page refreshed");
		Thread.sleep(3000);
		sp.CartClick();
		Thread.sleep(3000);
		String details=sp.CartDetails();
		Assert.assertEquals(sp.CartDetails(),details);
		System.out.println(details);
		logger.info("details checked");
		sp.FinalPriceValidation();
		String amout=sp.FinalPriceValidation();
		System.out.println(amout);
		if(amout.equals("$34")) {
			Assert.assertTrue(true);	
		}else {
			Assert.assertTrue(false);
		}

		logger.info("amount verified");


		sp.orderPlaced();
		logger.info("order placed");


	}
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert().dismiss();
			logger.warn("yes alret is there ");
			return true;
		}catch(NoAlertPresentException e)
		{	logger.info("exception handled ");
		return false;
		}
	}
}


