@InvalidLogin
Feature: InvalidLogin
  Scenario Outline: (InvalidLogin Functionality) as a user I want to see error message when I log in Unsuccessfully
    Given I am on the Home
    And  I see a logo banner
    When I click SignIn button
    And I Enter email in the "<email>" textbox
    And I Enter password in the "<password>" textbox
    And  I click the login Button
    Then  I should see an error "<ErrorMessage>" message details


    Examples:
      |email                        |password         |ErrorMessage                |
      |JohnTest123@gmail.com        |                 |Password is required.       |
      |                             |Test1234         |An email address required.  |
      |Fakeuser@gmsil.com           |Monday           |Authentication failed.      |
      |JohnTest123@gmail.com        |xxxxxxxxx        |Authentication failed.      |
      |                             |                 |An email address required.  |

#      |john@gmail.com               |Monday           |                           |