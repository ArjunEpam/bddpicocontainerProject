Feature: Registration Capability

  Scenario: User can register with valid details
    Given User is on the registration page
    When User enters valid registration details
    And User submits the registration form
    Then User should see a confirmation message

  Scenario: User cannot register with invalid details
    Given User is on the registration page
    When User enters invalid registration details
    And User submits the registration form
    Then User should see an error message
