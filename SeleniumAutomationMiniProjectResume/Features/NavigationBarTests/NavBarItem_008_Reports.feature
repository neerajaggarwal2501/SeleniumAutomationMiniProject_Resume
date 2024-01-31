Feature: Validate all options under Navigation Bar -> "Reports"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Reports"
    Given user clicks on Navigation bar item "Reports"
    
    When user clicks on sub-menu item "Sales summary"
    Then page with header "Sales summary" is displayed

    When user clicks on sub-menu item "Low stock"
    Then page with header "Low stock" is displayed
        
    When user clicks on sub-menu item "Bestsellers"
    Then page with header "Bestsellers" is displayed
        
    When user clicks on sub-menu item "Products never purchased"
    Then page with header "Products never purchased" is displayed
        
    When user clicks on sub-menu item "Country sales"
    Then page with header "Country sales" is displayed
        
    When user clicks on sub-menu item "Customer reports"
            
    When user clicks on sub-menu item "Registered customers"
    Then page with header "Registered customers" is displayed
        
    When user clicks on sub-menu item "Customers by order total"
    Then page with header "Customers by order total" is displayed
        
    When user clicks on sub-menu item "Customers by number of orders"
    Then page with header "Customers by number of orders" is displayed

    When user click on logout link
    Then page title should be "Your store. Login"