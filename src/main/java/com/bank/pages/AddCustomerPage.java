package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage extends Utility {
    private static final Logger log = LogManager.getLogger(AddCustomerPage.class.getName());

    public AddCustomerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//input[@placeholder='First Name']")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Last Name']")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='Post Code']")
    WebElement postCodeField;
    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement addCustomerButton;



    public void enterFirstName(String firstName) {
        log.info("enter first name : " + firstName );
        sendTextToElement(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
        log.info("enter last name : " + lastName );
        sendTextToElement(lastNameField, lastName);
    }

    public void enterPostCode(String postcode) {
        log.info("enter postcode : " + postcode );
        sendTextToElement(postCodeField, postcode);
    }

    public void clickOnAddCustomerButton() {
        log.info("Click on addCustomer Button" );
        clickOnElement(addCustomerButton);
    }

}
