@smoke
Feature: F03_currencies | user could change currencies
  Scenario: user could select EURO currency
    When user call currencies dropdown list
    And user Select EURO currency
    Then EURO currency is selected
