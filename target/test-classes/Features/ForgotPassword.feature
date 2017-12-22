@ForgotPassword
Feature: ForgotPassword
  Scenario: As a user I want to to reset my password
    Given I am on the Home
    And  I see a logo banner
    When I click SignIn button
    And I click the fogort password link
    And I Enter email in the "JohnTest123@gmail.com" textbox
#        And I Enter email in the "<email>" textbox
    And I click Retrieve Password button
    Then I should see a message displayed