package com.EcommerceV1.testcases;

import org.testng.annotations.Test;

import com.EcommerceV1.pageObjects.AccountCreartionPage;

public class TC_AccountCreationTest_003 extends BaseClass {

	@Test
	public void AccCreation() throws InterruptedException {

		AccountCreartionPage si=new AccountCreartionPage(driver);
		si.ClickSignup();
		logger.info("signin clicked");
		String Email=RandomEmail()+"@gmail.com";
		logger.info("random email entered");

		si.CreateEmail(Email);
		si.CreateAccount();
		logger.info("create account clicked");
		Thread.sleep(5000);
		si.GenderRdoBtn();
		logger.info("gender btn  clicked");
		si.FirstName("gokul");
		logger.info("first ");
		si.LastName("vasan");
		logger.info("2nd name entered");
		si.validateEmail();
		logger.info("validation done on  email as we entered");
		si.Pass("123@gkvasan");
		logger.info("password entered");
		si.Selectdate();
		logger.info("date clicked");
		si.selectMonth();
		logger.info("month clicked");
		si.selectYear();
		logger.info("year clicked");
		si.submitclicking();
		logger.info("submit clicked");
		logger.info("Account cretion sucessfull");
	}


}

