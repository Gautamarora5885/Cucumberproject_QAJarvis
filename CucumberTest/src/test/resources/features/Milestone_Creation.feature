@G1
Feature: feature is to test Milestone Creation functionality of the application

  Scenario Outline: Valid user is able to Create New Milestone
    Given Chrome browser is open
    And User enters  <username> and <password>
    And User click on the login button
    And User navigates to the home page
    And User Click on Milestones action
    And User clicks on Create New Milestone
    And User enters Title
    And User clicks on Create
    Then User is successfully able to create new milestone

    Examples: 
      | username | password |
      | garora   | Bebo@123 |
