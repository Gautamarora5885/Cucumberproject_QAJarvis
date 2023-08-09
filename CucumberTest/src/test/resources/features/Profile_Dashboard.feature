@P1
Feature: feature is to test PROFILE functionality of application

  Scenario Outline: valid user is able to change TIMEZONE in profile section
    Given Browser is open chrome
    And Usser enter  <username> and <password>
    And Usser click on login button
    And Usser is navigated to the home page
    And Usser clicks on Profile
    And Usser clicks on View_Profile
    Then Usser clicks on Timezone

    Examples: 
      | username | password |
      | garora   | Bebo@123 |
