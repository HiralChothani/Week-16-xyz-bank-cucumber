Feature: Bank Test
  As a User I want to login into xyz bank and perform some actions.

  @sanity
  Scenario: Verify bank manager should add customer successfully.
    Given  I am on XYZBank Homepage
    When   I click On Bank Manager Login Tab
    And    I click On Add Customer Tab
    And    I enter FirstName, LastName and PostCode
    |    Rohan  |   Rastogi  |  YV65 7TH  |
    And    I click On Add Customer Button
    Then   popup will display
    And    I verify message: Customer added successfully
    And    I click on ok button on popup.

    @smoke
    Scenario: Bank Manager should open account successfully.
      When I click On Bank Manager Login Tab
      And  I click On Open Account Tab
      And  I search customer
      And  I select currency Pound
      And  I click on process button
      Then popup will display
      And  I verify message: Account created successfully
      And  I click on ok button on popup.

      @regression
      Scenario: Customer should login and logout successfully.
        When I click on Customer Login Tab
        And  I search for customer
        And  I click on Login Button
        Then I am on customers account page
        And  I verify Logout Tab displayed.
        And  I click on Logout
        Then I am loged out of the customer account
        And  I verify Your Name text displayed.

        @regression
        Scenario: Customer should deposit money successfully.
          When I click on Customer Login Tab
          And  I search customer
          And  I click on Login Button
          Then I am on customers account page
          And  I click on Deposit Tab
          And  I Enter amount 100
          And  I click on Deposit Button
          And  I verify message: Deposit Successful

          @regression
          Scenario: Customer should withdraw money successfully
            When I click on Customer Login Tab
            And  I search customer
            And  I click on Login Button
            Then I am on customers account page
            And  I click on Withdrawl Tab
            And  I Enter amount 50
            And  I click on Withdrawl Button
            And  I verify message: Transaction Successful
