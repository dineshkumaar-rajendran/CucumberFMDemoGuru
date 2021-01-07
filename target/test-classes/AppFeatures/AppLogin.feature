Feature: Login to Demo Guru Site

<<<<<<< HEAD
  Scenario Outline: Validate the user login
    Given User is on the login page
    When User enters the username as "<Username>"
    And User enters the password as "<Password>"
    And User clicks on the login button
    Then User should be able login Sucessfully
    
    Examples:
    |Username|Password|
    |mngr301916|bEdaryq|
=======
  Scenario: Validate the user login
    Given User is on the login page
    When User enters the "Username"
    And User enters the "Password"
    And User clicks on the login button
    Then User should be able login Sucessfully
>>>>>>> 44b2f3ce5aa48c2410b86e8e19c2106b1ce01e41
