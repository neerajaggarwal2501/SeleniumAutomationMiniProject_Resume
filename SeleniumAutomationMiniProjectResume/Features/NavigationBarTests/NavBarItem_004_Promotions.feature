Feature: Validate all options under Navigation Bar -> "Promotions"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Promotions"
    Given user clicks on Navigation bar item "Promotions"
    
    When user clicks on sub-menu item "Discounts"
    Then page with header "Discounts" is displayed
    
    When user clicks on sub-menu item "Affiliates"
    Then page with header "Affiliates" is displayed
    
    When user clicks on sub-menu item "Newsletter subscribers"
    Then page with header "Newsletter subscribers" is displayed
    
    When user clicks on sub-menu item "Campaigns"
    Then page with header "Campaigns" is displayed
    
    When user click on logout link
    Then page title should be "Your store. Login"