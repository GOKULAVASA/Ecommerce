package com.EcommerceV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public static WebDriver driver;


	public HomePage(WebDriver d) {
		driver=d;
		PageFactory.initElements(d,this);

	}

	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signupbtn; 

	@FindBy(xpath="//input[@id='email']")
	WebElement siginEmail;

	@FindBy(xpath="//input[@id='passwd']")
	WebElement siginPass;

	@FindBy(xpath="//button[@id='SubmitLogin']")

	WebElement Submituser;

	public void signupbtn() {
		signupbtn.click();
	}
	public void signingEmail(String username) {
		siginEmail.sendKeys(username);
	}
	public void signingPass(String password) {
		siginPass.sendKeys(password);
	}

	public void submituser() {
		Submituser.click();
	}



	
}

