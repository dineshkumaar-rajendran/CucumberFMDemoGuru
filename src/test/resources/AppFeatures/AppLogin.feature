Feature: Login to Demo Guru Site

  Scenario Outline: Validate the user login
    Given User is on the login page
    When User enters the username as "<Username>"
    And User enters the password as "<Password>"
    And User clicks on the login button
    Then User should be able login Sucessfully
    
    Examples:
    |Username|Password|
    |mngr301916|bEdaryq|
