Feature: Verify options from monogoto Application

  Scenario Outline: Verify options count and details
    Given User launch the monogoto page
    Then User verify the option "<option>" and "<count>"
    And User close the browser

    Examples:
      | option    | count |
      | Solutions | 5     |
      | Network   | 5     |
      | Verticals | 10    |
      | Labs      | 10    |
      | Company   | 4     |
      | Pricing   | 4     |
      | Resources | 4     |
