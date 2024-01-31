Feature: Validate all options under Navigation Bar -> "Content Management"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Content Management"
    Given user clicks on Navigation bar item "Content management"
    
    When user clicks on sub-menu item "Topics (pages)"
    Then page with header "Topics (pages)" is displayed

    When user clicks on sub-menu item "Message templates"
    Then page with header "Message templates" is displayed
    
    When user clicks on sub-menu item "News items"
    Then page with header "News items" is displayed

    When user clicks on sub-menu item "News comments"
    Then page with header "News comments" is displayed
    
    When user clicks on sub-menu item "Blog posts"
    Then page with header "Blog posts" is displayed
    
    When user clicks on sub-menu item "Blog comments"
    Then page with header "Blog comments" is displayed
    
    When user clicks on sub-menu item "Polls"
    Then page with header "Polls" is displayed
    
    When user clicks on sub-menu item "Forums"
    Then page with header "Forums" is displayed        
    
    When user click on logout link
    Then page title should be "Your store. Login"