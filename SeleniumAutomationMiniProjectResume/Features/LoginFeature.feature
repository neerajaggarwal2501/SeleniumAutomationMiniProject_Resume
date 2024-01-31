Feature: Login

  @Smoke
  Scenario: Successful login with valid credentials
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    When user click on logout link
    Then page title should be "Your store. Login-1"
