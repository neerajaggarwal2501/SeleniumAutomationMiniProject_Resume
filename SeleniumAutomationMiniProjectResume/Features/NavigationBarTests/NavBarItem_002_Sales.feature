Feature: Validate all options under Navigation Bar -> "Sales"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Sales"
    Given user clicks on Navigation bar item "Sales"
    
    When user clicks on sub-menu item "Orders"
    Then page with header "Orders" is displayed
    
    When user clicks on sub-menu item "Shipments"
    Then page with header "Shipments" is displayed
    
    When user clicks on sub-menu item "Return requests"
    Then page with header "Return requests" is displayed
    
    When user clicks on sub-menu item "Recurring payments"
    Then page with header "Recurring payments" is displayed
    
    When user clicks on sub-menu item "Gift cards"
    Then page with header "Gift cards" is displayed
    
    When user clicks on sub-menu item "Shopping carts and wishlists"
    Then page with header "Shopping carts and wishlists" is displayed
    
    When user click on logout link
    Then page title should be "Your store. Login"