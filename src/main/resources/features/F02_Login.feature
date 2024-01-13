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
      |Hos123@gmail.com|

    # Negative Scenario
#  Scenario : to login with invalid data
#    When user go to invalid_login page
#    And user fill invalid_email
#    And user fill password