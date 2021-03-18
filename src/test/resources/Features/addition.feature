Feature: Calculator

  @mytag
  Scenario: Add two numbers
    Given i have enterd 50 into the calculator
    And i have also enterd 70 into the calculator
    When i press add
    Then the result should be 120 on the screen
