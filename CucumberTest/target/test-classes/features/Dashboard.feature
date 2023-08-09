Feature: feature is to test login functionality of application

  Scenario Outline: valid user is able to login
    Given Browser is open
    And Userr enters  <username> and <password>
    And User click on login buttonn
    Then User navigates to the home pagee

    Examples: 
      | username | password |
      | garora   | Bebo@123 |
