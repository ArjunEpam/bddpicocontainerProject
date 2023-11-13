Feature: Sign-In/Sign-Out Capability

  Scenario: User can sign in with valid credentials
    Given User is on the login page
    When User enters valid credentials and clicks sign in
    Then User should be successfully logged in

  Scenario: User cannot sign in with invalid credentials
    Given User is on the login page
    When User enters invalid credentials and clicks sign in
    Then User should see an authentication failure message

  Scenario: User can sign out
    Given User is logged in
    When User clicks on the sign-out button
    Then User should be successfully logged out


