@smoke
Feature:F06_homeSliders| user select item
  ##first scenario
Scenario:user find first slider
  When user select first slider item
  Then check current first url
  ##second scenario
Scenario:user find second slider
    When user select  second slider item
    Then check current second url
