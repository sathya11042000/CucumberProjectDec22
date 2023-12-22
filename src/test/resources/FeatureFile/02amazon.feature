@Feature2
Feature: To validate login funcnality of amazon application

  Background: 
    Given Launch the chrome browser

  @Regression @Sanity
  Scenario: To valdate positive username and positive password
    When pass the value in emailfied
    And click the continue button
    And pass the value in passwordfied
    And click singin button
    Then close the chrome browser

  @Smoke
  Scenario: valdate positive username and nagative password
    When To pass the value in emailfied or phno
    And To click the continue btn
    And To pass the value in password field
    And To click sing in button
    Then To close the  browser
