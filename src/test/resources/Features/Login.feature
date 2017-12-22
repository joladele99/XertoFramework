@Login
Feature: Login
  Scenario Outline: (Login Functionality) as a user I want login successfully
    Given I am on the Home
    And  I see a logo banner
    When I click SignIn button
    And I Enter email in the "<email>" textbox
#    And I enter username in the username field
    And I Enter password in the "<password>" textbox
#    And  I enter password in the password field
    And  I click the login Button
    Then  I souldbe loged in successfully
    And then I will click on the sgin button to log out




  Examples:
  |email                        |password         |
  |JohnTest123@gmail.com        |Test1234         |
  |JohnTest9999@gmail.com       |Test1234         |
 #  |Fakeuser@gmsil.com           |                 |
 #  |                             |Test1234         |
 #  |john@gmail.com               |Monday           |