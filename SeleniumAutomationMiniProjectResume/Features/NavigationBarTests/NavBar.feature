Feature: Navigation Bar Tests

  @Pass
  Scenario: Validate that user is able to see all expected options in Navigation bar
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Then validate that the navigation bar has following items
      | Dashboard          |
      | Catalog            |
      | Sales              |
      | Customers          |
      | Promotions         |
      | Content management |
      | Configuration      |
      | System             |
      | Reports            |
      | Help               |
    When user click on logout link
    Then page title should be "Your store. Login"
