Feature: Create Discount

  Scenario: Create Discount
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    
    Given user clicks on Navigation bar item "Promotions"
    When user clicks on sub-menu item "Discounts"
    Then page with header "Discounts" is displayed
    
    When user clicks on Add New button to create a new Discount
    Then page with header "Add a new discount" is displayed
    And page title should be "Add a new discount / nopCommerce administration"
    
    When user fills the form to create a new Discount using the json file "DiscountCreation.json"
