Feature: feature to test  Menu page
Scenario: check the functionality of Internisified website
    Given USer is on internisified homepage
    When User enter correct email and password
    And user hits Sign in
    Then user should redirect to internisified webpage
    When user hovers on Clothes tab
    And user click on Men option
    Then user should redirected on men page
    And user selects the small size checkbox
    And user click on the product picture
    Then user add specific product to the cart 
    And user clicks on proceed to checkout
    And user signoffs
    Then user redirected to Signin page
    