package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankManagerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(BankManagerLoginPage.class.getName());

    public BankManagerLoginPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Add Customer']")
    WebElement addCustomerTab;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Open Account']")
    WebElement openAccountTab;


    public void clickOnAddCustomerTab() {
        log.info("Click on addCustomer tab" );
        clickOnElement(addCustomerTab);
    }

    public void clickOnOpenAccountTab() {
        log.info("click on openAccount Tab" );
        clickOnElement(openAccountTab);
    }

}
