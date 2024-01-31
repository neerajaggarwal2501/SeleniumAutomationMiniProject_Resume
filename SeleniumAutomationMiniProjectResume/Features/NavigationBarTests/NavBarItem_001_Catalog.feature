Feature: Validate all options under Navigation Bar -> "Catalog"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Catalog"
    Given user clicks on Navigation bar item "Catalog"
    When user clicks on sub-menu item "Products"
    Then page with header "Products" is displayed
    When user clicks on sub-menu item "Categories"
    Then page with header "Categories" is displayed
    When user clicks on sub-menu item "Manufacturers"
    Then page with header "Manufacturers" is displayed
    When user clicks on sub-menu item "Product reviews"
    Then page with header "Product reviews" is displayed
    When user clicks on sub-menu item "Product tags"
    Then page with header "Product tags" is displayed
    Given user clicks on Navigation bar item "Attributes"
    When user clicks on sub-menu item "Product attributes"
    Then page with header "Product attributes" is displayed
    When user clicks on sub-menu item "Specification attributes"
    Then page with header "Specification attributes" is displayed
    When user clicks on sub-menu item "Checkout attributes"
    Then page with header "Checkout attributes" is displayed
    When user click on logout link
    Then page title should be "Your store. Login"
