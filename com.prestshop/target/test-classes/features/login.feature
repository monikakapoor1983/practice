Feature: feature to test  Login page

  Scenario: check the functionality of Internisified website
    Given USer is on internisified homepage
    When User enter correct email and password
    And user hits Sign in
    Then user should redirect to internisified webpage
    Then user enters the keyword in search bar
    Then user hit enter button
    Then User should get the expected result
    Then close the session