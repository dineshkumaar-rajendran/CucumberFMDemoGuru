Feature: Login to Demo Guru Site

  Scenario: Validate the user login
    Given User is on the login page
    When User enters the "Username"
    And User enters the "Password"
    And User clicks on the login button
    Then User should be able login Sucessfully
