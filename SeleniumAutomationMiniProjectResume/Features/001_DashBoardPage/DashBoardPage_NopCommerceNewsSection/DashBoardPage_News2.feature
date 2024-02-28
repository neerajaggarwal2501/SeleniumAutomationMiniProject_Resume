Feature: Validate hyperlinks in Dashboard Page->NopCommerce News section->News2

  Background: User has logged in to the application
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Regression
  Scenario: Validate hyperlinks
    When user clicks on the hyperlink Web API plugin
    Then the title of page is "nopCommerce Web API (official plugin) - nopCommerce"
    And the url of page is "https://www.nopcommerce.com/en/web-api?utm_source=demo-admin-panel&utm_medium=dashboard&utm_campaign=web_api"
    When user clicks on back button from the browser
    Then the title of page is "Dashboard / nopCommerce administration"
    And the url of page is "https://admin-demo.nopcommerce.com/admin/"
    
    When user clicks on the hyperlink Get the plugin
    Then the title of page is "nopCommerce Web API (official plugin) - nopCommerce"
    And the url of page is "https://www.nopcommerce.com/en/web-api?utm_source=demo-admin-panel&utm_medium=dashboard&utm_campaign=web_api"
    When user clicks on back button from the browser
    Then the title of page is "Dashboard / nopCommerce administration"
    And the url of page is "https://admin-demo.nopcommerce.com/admin/"
