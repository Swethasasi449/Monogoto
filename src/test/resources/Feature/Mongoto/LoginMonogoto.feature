Feature: Verify options from monogoto Application

  Scenario Outline: Verify invalid login attempt
    Given User launch the monogoto page
    And User click the login button
    When User enters the email ID "<username>"
    And User enters the password "<password>"
    And User declines the cookies
    And User submit the login details
    And User should get the error message
    And User close the browser

    Examples:
      | username           | password |
      | Sweety12@gmail.com | 345678   |
