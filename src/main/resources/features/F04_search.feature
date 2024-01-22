@smoke
Feature: F04_search | user could using search
Scenario Outline: user could search using product name
  When user could search about product "<product_name>"
  And click search button
  Then items is appeared
  Examples:
    | product_name |
    |apple|
  Scenario Outline: user could search using SKU
    When user could search about product using SKU "<Sku>"
    And click search button
    And user click on product
    Then SKU is appeared
    Examples:
      | Sku |
      |APPLE_CAM|