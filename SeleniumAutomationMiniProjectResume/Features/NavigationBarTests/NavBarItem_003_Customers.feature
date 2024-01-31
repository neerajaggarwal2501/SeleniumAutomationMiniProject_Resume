Feature: Validate all options under Navigation Bar -> "Customers"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Customers"
    Given user clicks on Navigation bar item "Customers_Level_0"
    
    When user clicks on sub-menu item "Customers_Level_1"
    Then page with header "Customers" is displayed
    
    When user clicks on sub-menu item "Customer roles"
    Then page with header "Customer roles" is displayed

    When user clicks on sub-menu item "Online customers"
    Then page with header "Online customers" is displayed
    
    When user clicks on sub-menu item "Vendors"
    Then page with header "Vendors" is displayed
    
    When user clicks on sub-menu item "Activity log"
    Then page with header "Activity log" is displayed
  
    When user clicks on sub-menu item "Activity Types"
    Then page with header "Activity Types" is displayed

    When user clicks on sub-menu item "GDPR requests (log)"
    Then page with header "GDPR requests (log)" is displayed                
    
    When user click on logout link
    Then page title should be "Your store. Login"