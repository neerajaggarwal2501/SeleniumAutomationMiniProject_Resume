Feature: Validate all options under Navigation Bar -> "System"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "System"
    Given user clicks on Navigation bar item "System"
    
    When user clicks on sub-menu item "System information"
    Then page with header "System information" is displayed

    When user clicks on sub-menu item "Log"
    Then page with header "Log" is displayed

    When user clicks on sub-menu item "Warnings"
    Then page with header "Warnings" is displayed

    When user clicks on sub-menu item "Maintenance"
    Then page with header "Maintenance" is displayed

    When user clicks on sub-menu item "Message queue"
    Then page with header "Message queue" is displayed

    When user clicks on sub-menu item "Schedule tasks"
    Then page with header "Schedule tasks" is displayed

    When user clicks on sub-menu item "Search engine friendly page names"
    Then page with header "Search engine friendly page names" is displayed

    When user clicks on sub-menu item "Templates"
    Then page with header "Templates" is displayed
    
    When user click on logout link
    Then page title should be "Your store. Login"