@ignore
Feature:Register
  Scenario:As a user I want to register successfully
    Given I am on the Home
    And  I see a logo banner
 #  Given That I am on the Homepage
 # And I see the website logo
    When I click on the SignIn button
    And I fill in the create an account email address field
    When I click create an account button
    And I fill in the first name text box
    And I fill in the last name text box
    And I fill in the password text box
    And I select my date of birth from all the date of birth drop down list
    And I fill in the address text box
    And I fill in the City text box
    And I select state from the state drop down list
    And I fill in the zip/postal code text box
    And I select country from the country drop down list
    And I enter Additional information in the Additional information text box
    And I enter home phone in the home phone text box
    And I fill in the mobile phone text box
    And I fill the address alias for future reference text box
    And I click Register button
    Then I should Register successfully