$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("banktest.feature");
formatter.feature({
  "line": 1,
  "name": "Bank Test",
  "description": "As a User I want to login into xyz bank and perform some actions.",
  "id": "bank-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7312501100,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Customer should login and logout successfully.",
  "description": "",
  "id": "bank-test;customer-should-login-and-logout-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "I click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "I search for customer",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "I am on customers account page",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "I verify Logout Tab displayed.",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I click on Logout",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "I am loged out of the customer account",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "I verify Your Name text displayed.",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 1163135400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iSearchForCustomer()"
});
formatter.result({
  "duration": 559548800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 513013400,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iAmOnCustomersAccountPage()"
});
formatter.result({
  "duration": 29800,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iVerifyLogoutTabDisplayed()"
});
formatter.result({
  "duration": 46000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLogout()"
});
formatter.result({
  "duration": 274990100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iAmLogedOutOfTheCustomerAccount()"
});
formatter.result({
  "duration": 27300,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iVerifyYourNameTextDisplayed()"
});
formatter.result({
  "duration": 87810700,
  "status": "passed"
});
formatter.after({
  "duration": 168800,
  "status": "passed"
});
formatter.before({
  "duration": 6135922400,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Customer should deposit money successfully.",
  "description": "",
  "id": "bank-test;customer-should-deposit-money-successfully.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "I click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "I search customer",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "I am on customers account page",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "I click on Deposit Tab",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "I Enter amount 100",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "I click on Deposit Button",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "I verify message: Deposit Successful",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 439700100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iSearchCustomer()"
});
formatter.result({
  "duration": 403269200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 270867100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iAmOnCustomersAccountPage()"
});
formatter.result({
  "duration": 22900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnDepositTab()"
});
formatter.result({
  "duration": 159946900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 15
    }
  ],
  "location": "BankTestSteps.iEnterAmount(int)"
});
formatter.result({
  "duration": 325700200,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnDepositButton()"
});
formatter.result({
  "duration": 104552100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iVerifyMessageDepositSuccessful()"
});
formatter.result({
  "duration": 89636800,
  "status": "passed"
});
formatter.after({
  "duration": 36300,
  "status": "passed"
});
formatter.before({
  "duration": 4685819700,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Customer should withdraw money successfully",
  "description": "",
  "id": "bank-test;customer-should-withdraw-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 49,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 51,
  "name": "I click on Customer Login Tab",
  "keyword": "When "
});
formatter.step({
  "line": 52,
  "name": "I search customer",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I am on customers account page",
  "keyword": "Then "
});
formatter.step({
  "line": 55,
  "name": "I click on Withdrawl Tab",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I Enter amount 50",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I click on Withdrawl Button",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I verify message: Transaction Successful",
  "keyword": "And "
});
formatter.match({
  "location": "BankTestSteps.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 567261700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iSearchCustomer()"
});
formatter.result({
  "duration": 660788900,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "duration": 129896700,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iAmOnCustomersAccountPage()"
});
formatter.result({
  "duration": 19600,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnWithdrawlTab()"
});
formatter.result({
  "duration": 317847900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 15
    }
  ],
  "location": "BankTestSteps.iEnterAmount(int)"
});
formatter.result({
  "duration": 575190000,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iClickOnWithdrawlButton()"
});
formatter.result({
  "duration": 29100,
  "status": "passed"
});
formatter.match({
  "location": "BankTestSteps.iVerifyMessageTransactionSuccessful()"
});
formatter.result({
  "duration": 29000,
  "status": "passed"
});
formatter.after({
  "duration": 37000,
  "status": "passed"
});
});