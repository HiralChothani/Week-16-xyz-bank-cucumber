package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger(OpenAccountPage.class.getName());

    public OpenAccountPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//select[@id='userSelect']")
    WebElement customerNameField;
    @CacheLookup
    @FindBy(xpath="//select[@id='currency']")
    WebElement currencyField;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Process']")
    WebElement progressButton;



    public void searchCustomer(String value) {
        log.info("search customer from drop down" );
        selectByValueFromDropDown(customerNameField, value);
    }

    public void selectCurrency(String value) {
        log.info("select currency" );
        selectByValueFromDropDown(currencyField, value);
    }

    public void clickOnProgressButton() {
        log.info("click on progress button" );
        clickOnElement(progressButton);
    }


}
