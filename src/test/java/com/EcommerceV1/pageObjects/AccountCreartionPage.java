package com.EcommerceV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountCreartionPage {

	public static WebDriver driver;


	public AccountCreartionPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(d,this);

	}
	@FindBy(xpath="//a[contains(text(),'Sign in')]")
	WebElement signupbtn;

	@FindBy(id="email_create")
	WebElement addemail;
	
	@FindBy(id="SubmitCreate")
	WebElement createAccnt;

/**	@FindBy(id="SubmitCreate")
	WebElement createAccnt;

	@FindBy(xpath="//input[@id=\"email\"]")
	WebElement siginEmail;

	@FindBy(xpath="//input[@id=\"passwd\"]")
	WebElement siginPass;

	@FindBy(xpath="//input[@id=\"SubmitLogin\"]")
	WebElement Submituser;**/

	@FindBy(xpath="//input[@id='id_gender1']")
	WebElement genderbtn;

	@FindBy(name="customer_firstname")
	WebElement firstName;

	@FindBy(name="customer_lastname")
	WebElement LastName;

	@FindBy(id="email")
	WebElement validateEmail;

	@FindBy(id="passwd")
	WebElement enterpasswrd;


	@FindBy(xpath="//select[@id=\"days\"]//option[@value=\"31\"]")
	WebElement datedrpdown;


	@FindBy(xpath="//select[@id=\"months\"]//option[@value=\"10\"]")
	WebElement monthdrpdown;

	@FindBy(xpath="//select[@id=\"years\"]//option[@value=\"1997\"]")
	WebElement yeardrpdown;

	@FindBy(xpath="//input[@id=\"newsletter\"]")
	WebElement checkbox;


	@FindBy(id="submitAccount")
	WebElement submit;



	public void ClickSignup() {
		signupbtn.click();
	}



	public void CreateEmail(String Email) {
		addemail.sendKeys(Email);
	}

	/**public void signingEmail(String cre) {
		siginEmail.sendKeys(cre);
	}
	public void signingPass(String cre) {
		siginPass.sendKeys(cre);
	}

	public void submituser() {
		Submituser.click();
	}**/
	public void CreateAccount() {
		createAccnt.click();
	}



	public void GenderRdoBtn() {
		genderbtn.click();
	}


	public void FirstName(String fname) {
		firstName.sendKeys(fname);
	}


	public void LastName(String Lname) {
		LastName.sendKeys(Lname);
	}


	public void validateEmail() {
		String Validate=validateEmail.getAttribute("value");
		System.out.println(Validate);
	}


	public void Pass(String pass) {
		enterpasswrd.sendKeys(pass);
	}


	public void Selectdate() {
		datedrpdown.click();
	}


	public void selectMonth() {
		monthdrpdown.click();
	}


	public void selectYear() {
		yeardrpdown.click();
	}

	public void submitclicking() {
		submit.click();
	}
}

