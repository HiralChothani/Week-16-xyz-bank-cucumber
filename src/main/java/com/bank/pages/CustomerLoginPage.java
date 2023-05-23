package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CustomerLoginPage.class.getName());

    public CustomerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//label[normalize-space()='Your Name :']")
    WebElement yourNameText;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Logout']")
    WebElement logOutTab;
    public String verifyLogoutTab(){
        log.info("verify logout text" );
        return getTextFromElement(logOutTab);
    }
    public void clickOnLogOutTab(){
        log.info("click on logout tab" );
        clickOnElement(logOutTab);
    }

    public void clickOnLoginButton() {
        log.info("click on login button" );
        clickOnElement(loginButton);
    }
    public String verifyYourNameText(){
        log.info("verify your name text" );
        return getTextFromElement(yourNameText);
    }


}
