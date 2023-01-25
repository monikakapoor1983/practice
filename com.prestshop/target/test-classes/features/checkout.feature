Feature: feature to test  Checkout page
  Scenario: check the functionality of internsified website
     Given USer is on internisified homepage
    When User enter correct email and password
    And user hits Sign in
    Then user should redirect to internisified webpage
    When user click on proceed to checkout
    And user click again on proceed to checkout
    And user clicks on Continue
    And clicks on Pay by check
    And user check on agreed conditions
    And user clicks on Place Order
    Then user is shown order Confirmation