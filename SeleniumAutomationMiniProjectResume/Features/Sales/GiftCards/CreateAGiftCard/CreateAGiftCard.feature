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
    
    When from  Gift card type dropdown user selects "Virtual"
    And enters the Initial value as "1"
    And enters the copuon code as "Test"
    And clicks on Generate Code Button
    And enters recipient Name as "User002"
    And enters the recipient email as "DummyMail001"
    And enters the senders Name as "User001"
    And enters the senders email as "DummyMail001"
    And enters the message as "Test Message..."