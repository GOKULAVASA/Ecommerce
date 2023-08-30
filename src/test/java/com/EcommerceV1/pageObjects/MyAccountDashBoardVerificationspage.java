package com.EcommerceV1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//we will verify the elements present in the my account 
public class MyAccountDashBoardVerificationspage {
WebDriver driver;
public MyAccountDashBoardVerificationspage(WebDriver d) {
	driver=d;
	PageFactory.initElements(d, this);
}
@FindBy(xpath="//span[contains(text(),'Add my first address')]")
WebElement AddaddressTAB;

@FindBy(xpath="//span[contains(text(),'Order history and details')]")
WebElement OrderHistoryTAB;

@FindBy(xpath="//span[contains(text(),'Add my first address')]")
WebElement creditclipTAB;

@FindBy(xpath="//span[contains(text(),'My addresses')]")
WebElement MyAddressTAB;

@FindBy(xpath="//span[contains(text(),'My personal information')]")
WebElement PersonalinfoTAB;


public boolean AddAddressTABElementcheck() {

	 try {
	        return AddaddressTAB.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	

public boolean OrderHistoryTABElementcheck() {

	 try {
	        return OrderHistoryTAB.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	



public boolean creditclipTABElementcheck() {
	
	 try {
	        return creditclipTAB.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	


public boolean MyAddressTABElementcheck() {
    try {
        return MyAddressTAB.isDisplayed();
    } catch (Exception e) {
        return false;
    }
}

public boolean PersonalinfoTABElementcheck() {

	 try {
	        return PersonalinfoTAB.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
}

