package com.bank.cucumber.steps;

import com.bank.pages.*;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

import java.util.List;

public class BankTestSteps {
    @Given("^I am on XYZBank Homepage$")
    public void iAmOnXYZBankHomepage() {
    }

    @When("^I click On Bank Manager Login Tab$")
    public void iClickOnBankManagerLoginTab() {
        new HomePage().clickOnBankManagerLoginTab();
    }

    @And("^I click On Add Customer Tab$")
    public void iClickOnAddCustomerTab() {
        new BankManagerLoginPage().clickOnAddCustomerTab();
    }

    @And("^I enter FirstName, LastName and PostCode$")
    public void iEnterFirstNameLastNameAndPostCode(DataTable dataTable) {
        List<List<String>> customerDetailsField = dataTable.asLists(String.class);
        String firstName = customerDetailsField.get(0).get(0);
        String lastName = customerDetailsField.get(0).get(1);
        String postCode = customerDetailsField.get(0).get(2);
        new AddCustomerPage().enterFirstName(firstName);
        new AddCustomerPage().enterLastName(lastName);
        new AddCustomerPage().enterPostCode(postCode);
    }

    @And("^I click On Add Customer Button$")
    public void iClickOnAddCustomerButton() {
        new AddCustomerPage().clickOnAddCustomerButton();
    }

    @Then("^popup will display$")
    public void popupWillDisplay() {
    }

    @And("^I verify message: Customer added successfully$")
    public void iVerifyMessageCustomerAddedSuccessfully() {
        Assert.assertEquals(new HomePage().popUpMessage().substring(0, 27), "Customer added successfully");
    }

    @And("^I click on ok button on popup\\.$")
    public void iClickOnOkButtonOnPopup() {
        new HomePage().acceptPopUp();
    }

    @And("^I click On Open Account Tab$")
    public void iClickOnOpenAccountTab() {
        new BankManagerLoginPage().clickOnOpenAccountTab();
    }

    @And("^I search customer$")
    public void iSearchCustomer() {
        new OpenAccountPage().searchCustomer("3");
    }

    @And("^I select currency Pound$")
    public void iSelectCurrencyPound() {
        new OpenAccountPage().selectCurrency("Pound");
    }

    @And("^I click on process button$")
    public void iClickOnProcessButton() {
        new OpenAccountPage().clickOnProgressButton();
    }

    @And("^I verify message: Account created successfully$")
    public void iVerifyMessageAccountCreatedSuccessfully() {
        Assert.assertEquals(new HomePage().popUpMessage().substring(0, 28), "Account created successfully");
    }

    @When("^I click on Customer Login Tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickOnCustomerLoginTab();
    }

    @And("^I search for customer$")
    public void iSearchForCustomer() {
        new OpenAccountPage().searchCustomer("3");
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^I am on customers account page$")
    public void iAmOnCustomersAccountPage() {
    }

    @And("^I verify Logout Tab displayed\\.$")
    public void iVerifyLogoutTabDisplayed() {
        //Assert.assertEquals(new CustomerLoginPage().verifyLogoutTab(), "Logout", "Tab not displayed");
    }

    @And("^I click on Logout$")
    public void iClickOnLogout() {
        new CustomerLoginPage().clickOnLogOutTab();
    }

    @Then("^I am loged out of the customer account$")
    public void iAmLogedOutOfTheCustomerAccount() {
    }

    @And("^I verify Your Name text displayed\\.$")
    public void iVerifyYourNameTextDisplayed() {
        Assert.assertEquals(new CustomerLoginPage().verifyYourNameText(), "Your Name :", "Text not displayed");
    }

    @And("^I click on Deposit Tab$")
    public void iClickOnDepositTab() {
        new CustomersPage().clickOnDepositTab();
    }

    @And("^I Enter amount (\\d+)$")
    public void iEnterAmount(int amount) {
        new CustomersPage().enterAmount("100");
    }

    @And("^I click on Deposit Button$")
    public void iClickOnDepositButton() {
        new CustomersPage().clickOnDepositButton();
    }

    @And("^I verify message: Deposit Successful$")
    public void iVerifyMessageDepositSuccessful() {
        Assert.assertEquals(new CustomersPage().verifyDepositSuccessFullMessage(), "Deposit Successful", "Message not displayed");
    }

    @And("^I click on Withdrawl Tab$")
    public void iClickOnWithdrawlTab() {
        new CustomersPage().clickOnWithdrawlTab();
    }

    @And("^I click on Withdrawl Button$")
    public void iClickOnWithdrawlButton() {
    }

    @And("^I verify message: Transaction Successful$")
    public void iVerifyMessageTransactionSuccessful() {
    }
}
