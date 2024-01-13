@smoke
Feature: F01_Register | user could register with new accounts

  #Positive Scenario


  Scenario Outline: user could register with valid data successfully

    When user go to register page
    And user choose gender
    And user entre first name"<round1>"
    And user entre last name"<round2>"
    And user select the date of birth
    And user entre Email
    And user entre company name
    And user check Newsletter
    And user entre password and confirm
    And user click on the register button
    Then The account is created successfully
    Examples:
      |round1|round2|
      |hossam|ahmed|


