package com.EcommerceV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class logo_tittlepage {
WebDriver driver;
public logo_tittlepage(WebDriver d) {
	driver=d;
	PageFactory.initElements(driver,this);
}
@FindBy(how=How.CSS,using="img.logo")
WebElement logoCheck;

public WebElement logochecking() {
return	logoCheck;
}



}
