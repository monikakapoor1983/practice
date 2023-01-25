Feature: feature to test  search page

  Scenario: check the functionality of Internisified website
    Given USer is on internisified homepage
    Then user enters the keyword in search bar
    Then user hit enter button
    Then User should get the expected result
    Then close the session