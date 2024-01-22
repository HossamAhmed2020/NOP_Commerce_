Feature:F07_followUs| users could open followUs links
Scenario Outline: 1: user opens facebook link
  When user opens facebook link
  Then the link open in new tap"<link>"
  Examples:
  |link|
  |https://www.facebook.com/nopCommerce|





