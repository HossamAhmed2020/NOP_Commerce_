@smoke
Feature:F07_followUs| users could open followUs links
  ##Scenario1
 Scenario Outline: user opens facebook link
  When user opens facebook link
  Then the link of facebook will open in new tap"<link1>"
  Examples:
  |link1|
  |https://www.facebook.com/nopCommerce|

    ##Scenario2
  Scenario Outline: 1: user opens twitter link
    When user opens twitter link
    Then the link of twitter will open in new tap"<link2>"
    Examples:
      |link2|
      |https://twitter.com/nopCommerce|

      ##Scenario3
  Scenario Outline: user opens rss link
    When user opens rss link
    Then the link of rss will open in new tap"<link3>"
    Examples:
      |link3|
      |https://demo.nopcommerce.com/new-online-store-is-open|

      ##Scenario4
  Scenario Outline: user opens youtube link
    When user opens youtube link
    Then the link of youtube will open in new tap"<link4>"
    Examples:
      |link4|
      |https://www.youtube.com/user/nopCommerce|





