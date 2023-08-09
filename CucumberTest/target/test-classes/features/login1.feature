Feature: To test login functionality

Scenario: Check login is successful with valid credentials

	Given user is on login page
	And user enter username and password
	And click on login button
	Then user is navigate to the homepage