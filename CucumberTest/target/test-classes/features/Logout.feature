@G1
Feature: feature is to test logout functionality of application

  Scenario Outline: valid user is able to logout
    Given Browser is open
    And User enter  <username> and <password>
    And User click on login button
    And User is navigated to the home page
    And User clicks on Profile
    And User clicks on Logout
    Then User is Successfully logged out

    Examples: 
      | username | password |
      | garora   | Bebo@123 |
