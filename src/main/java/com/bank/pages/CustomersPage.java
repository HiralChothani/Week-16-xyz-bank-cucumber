package com.bank.pages;

import com.bank.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage extends Utility {

    private static final Logger log = LogManager.getLogger(CustomersPage.class.getName());

    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Deposit']")
    WebElement depositTab;
    @CacheLookup
    @FindBy(xpath="//input[@placeholder='amount']")
    WebElement amountField;
    @CacheLookup
    @FindBy(xpath="//button[@type='submit']")
    WebElement depositButton;
    @CacheLookup
    @FindBy(xpath="//span[@class='error ng-binding']")
    WebElement depositSuccessMessage;
    @CacheLookup
    @FindBy(xpath="//button[normalize-space()='Withdrawl']")
    WebElement withDrawlTab;


    public void clickOnDepositTab(){
        log.info("click on deposit tab" );
        clickOnElement(depositTab);
    }
    public void enterAmount(String amount){
        log.info("enter amount in amount field" );
        sendTextToElement(amountField, amount);
    }
    public void clickOnDepositButton(){
        log.info("click on deposit button" );
        clickOnElement(depositButton);
    }
    public String verifyDepositSuccessFullMessage(){
        log.info("verify deposit successful message" );
        return getTextFromElement(depositSuccessMessage);
    }
    public void clickOnWithdrawlTab(){
        log.info("click on withdrawl tab" );
        clickOnElement(withDrawlTab);
    }

}
