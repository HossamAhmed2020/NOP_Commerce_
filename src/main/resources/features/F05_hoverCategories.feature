@smoke
Feature: F05_hoverCategories | user hover on list
  Scenario: user could hover on item
    When user could hover on list
    And user select item
    Then select item from list
