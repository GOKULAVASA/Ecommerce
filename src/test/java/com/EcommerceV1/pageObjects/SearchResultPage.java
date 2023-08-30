package com.EcommerceV1.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchResultPage {

	public WebDriver driver;
	
	public SearchResultPage(WebDriver d){

		driver=d;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="search_query_top")
	WebElement searchBox;

	@FindBy(xpath="//img[@title='Blouse']")
	WebElement pickingdress;
	
	@FindBy(xpath="//span[text()='In stock']")
	WebElement instockcheck;
	
	@FindBy(id="quantity_wanted")
	WebElement quantitywanted;

	@FindBy(id="group_1")
	WebElement sizedropdown;

	@FindBy(id="color_11")
	WebElement colourselect;
	
	@FindBy(name="Submit")
	WebElement submitADDtoCart;
	
	@FindBy(xpath="//a[@title='Close']")
	WebElement closingscript;
	
	@FindBy(xpath="//a[@title='View my shopping cart']")
	WebElement cart;
	

	@FindBy(xpath="//tr[@id='product_2_9_0_1110']//a[text()='Blouse']")
	WebElement ProductName;
	
	@FindBy(xpath="//span[@id='total_price']")
	WebElement Totalpricecheck;
	

	@FindBy(id="order")
	WebElement orderPlace;
	
	
	public void seachBox() {
		Actions act=new Actions(driver);
		searchBox.sendKeys("short sleeve",Keys.ENTER);


	}	

	public void Pickingdress() {
		pickingdress.click();
	}

	public boolean instock() {
		return instockcheck.isDisplayed();
	}

	public void quantity() {
		quantitywanted.sendKeys("1");


	}

	public void selectOptionByText(String optionText) {
		Select dropdown = new Select(sizedropdown);
		dropdown.selectByVisibleText(optionText);

	}
	public void colourselection() {
		colourselect.click();
	}
	
	public void AddtoCart() {
		submitADDtoCart.click();
	}
	
	public void CartClick() {
		cart.click();
	}
	
	public String CartDetails() {
		return ProductName.getText();
		
	}
	
	

	public String FinalPriceValidation() {
		return Totalpricecheck.getText();
	}
	public void orderPlaced() {
		orderPlace.click();
	}
}
