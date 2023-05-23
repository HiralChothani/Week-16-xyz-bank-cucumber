package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Bank Manager Login']")
    WebElement bankManagerLoginTab;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Customer Login']")
    WebElement customerLoginTab;



    public void clickOnBankManagerLoginTab() {
        log.info("Click on Bank Manager Login tab" );
        clickOnElement(bankManagerLoginTab);
    }

    public void clickOnCustomerLoginTab() {
        log.info("click on customer login tab" );
        clickOnElement(customerLoginTab);
    }

    public String popUpMessage() {
        log.info("switch to pop up message" );
        return switchToAlert();
        //switchToAlert().substring(0, 27);
    }

    public void acceptPopUp() {
        log.info("click on ok button in pop up message" );
        acceptAlert();
    }
}
