Feature: Validate hyperlinks in Dashboard Page->NopCommerce News section->News3

  Background: User has logged in to the application
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Regression
  Scenario: Validate hyperlinks
    When user clicks on the hyperlink Recommended hosting for your store
    Then the title of page is "Premium nopCommerce Hosting on Everleap ASP.NET Hosting Platform"
    And the url of page is "https://www.everleap.com/cloud-hosting/web-app/nopcommerce/hosting/?utm_source=NOPC&utm_medium=TXT&utm_content=PREMCP&utm_campaign=MIG30DYS"
    When user clicks on back button from the browser
    When user clicks on back button from the browser
    Then the url of page is "https://admin-demo.nopcommerce.com/admin/"
    And the title of page is "Dashboard / nopCommerce administration"
    
    When user clicks on the hyperlink Recommended hosting for your store
    Then the title of page is "Premium nopCommerce Hosting on Everleap ASP.NET Hosting Platform"
    And the url of page is "https://www.everleap.com/cloud-hosting/web-app/nopcommerce/hosting/?utm_source=NOPC&utm_medium=TXT&utm_content=PREMCP&utm_campaign=MIG30DYS"
    When user clicks on back button from the browser
    When user clicks on back button from the browser
    Then the url of page is "https://admin-demo.nopcommerce.com/admin/"
    And the title of page is "Dashboard / nopCommerce administration"
