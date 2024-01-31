Feature: User is able to create a Gift Card successfully

  Scenario: Create a Gift Card
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Given user clicks on Navigation bar item "Sales"
    When user clicks on sub-menu item "Gift cards"
    
    Then page with header "Gift cards" is displayed
    
    When user clicks on sub-menu item "Gift cards"
    Then page with header "Gift cards" is displayed
    
    When user clicks on Add New button to create a new Gift Card
    Then page with header "Add a new gift card" is displayed
    And page title should be "Add a new gift card / nopCommerce administration"
    
    When user fills the form to create a Gift Card using the json file "GiftCardCreation.json"