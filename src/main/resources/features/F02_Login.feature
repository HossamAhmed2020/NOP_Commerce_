@smoke
Feature:F02 | user can login with valid data

    #Positive Scenario
  Scenario Outline: to login with valid data
    When user go to valid_login page
    And user fill email"<Email>"
    And user fill password
    And user click login
    Then user navigate to home page
    Examples:
      | Email|
      |Hos12345@gmail.com|


    ##Negative Scenario
  Scenario Outline: user could login with invalid email and password
  When user go to login page
  And user login with invalid email "<email>"
  And user fill invalid password
  And user press on login button
  Then user could not login to the system
    Examples:
    |email|
    |ho@1224|
