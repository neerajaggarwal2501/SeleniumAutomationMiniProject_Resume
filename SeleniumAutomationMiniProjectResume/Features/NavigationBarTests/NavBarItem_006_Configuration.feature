Feature: Validate all options under Navigation Bar -> "Configuration"

  @Smoke1
  Scenario Outline: User is able to access all options under "Configuration"->"Settings"
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Given user clicks on Navigation bar item "Configuration"
    When user clicks on sub-menu item "Settings"
    When user clicks on sub-menu item "<sub-menu item>"
    Then page with header "<Page Header>" is displayed
    When user click on logout link
    Then page title should be "Your store. Login"

    Examples: 
      | sub-menu item           | Page Header             |
      | General settings        | General settings        |
      | Customer settings       | Customer settings       |
      | Order settings          | Order settings          |
      | Shipping settings       | Shipping settings       |
      | Tax settings            | Tax settings            |
      | Catalog settings        | Catalog settings        |
      | Shopping cart settings  | Shopping cart settings  |
      | Reward points           | Reward points           |
      | GDPR settings           | GDPR settings           |
      | Vendor settings         | Vendor settings         |
      | Blog settings           | Blog settings           |
      | News settings           | News settings           |
      | Forum settings          | Forum settings          |
      | Media settings          | Media settings          |
      | All settings (advanced) | All settings (advanced) |

  @Smoke1
  Scenario Outline: User is able to access all options under "Configuration"->"Shipping"
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Given user clicks on Navigation bar item "Configuration"
    When user clicks on sub-menu item "Shipping"
    When user clicks on sub-menu item "<sub-menu item>"
    Then page with header "<Page Header>" is displayed
    When user click on logout link
    Then page title should be "Your store. Login"

    Examples: 
      | sub-menu item      | Page Header                                   |
      | Shipping providers | Shipping rate computation methods (providers) |
      | Warehouses         | Warehouses                                    |
      | Pickup points      | Pickup point providers                        |
      | Dates and ranges   | Dates and ranges                              |
      | Measures           | Measures                                      |

  @Smoke1
  Scenario Outline: User is able to access all options under "Configuration"->"POS"
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Given user clicks on Navigation bar item "Configuration"
    When user clicks on sub-menu item "POS"
    When user clicks on sub-menu item "<sub-menu item>"
    Then page with header "<Page Header>" is displayed
    When user click on logout link
    Then page title should be "Your store. Login"

    Examples: 
      | sub-menu item | Page Header               |
      | PayPal Zettle | Configure - PayPal Zettle |

  @Smoke1
  Scenario Outline: User is able to access all options under "Configuration"->"Authentication"
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Given user clicks on Navigation bar item "Configuration"
    When user clicks on sub-menu item "Authentication"
    When user clicks on sub-menu item "<sub-menu item>"
    Then page with header "<Page Header>" is displayed
    When user click on logout link
    Then page title should be "Your store. Login"

    Examples: 
      | sub-menu item               | Page Header                 |
      | External authentication     | External authentication     |
      | Multi-factor authentication | Multi-factor authentication |

  @Smoke
  Scenario Outline: User is able to access options under "Configuration"
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"
    Given user clicks on Navigation bar item "Configuration"
    When user clicks on sub-menu item "<sub-menu item>"
    Then page with header "<Page Header>" is displayed
    When user click on logout link
    Then page title should be "Your store. Login"

    Examples: 
      | sub-menu item          | Page Header                  |
      | Email accounts         | Email accounts               |
      | Stores                 | Stores                       |
      | Countries              | Countries                    |
      | Languages              | Languages                    |
      | Currencies             | Currencies                   |
      | Payment methods        | Payment methods              |
      | Payment restrictions   | Payment restrictions         |
      | Tax providers          | Tax providers                |
      | Tax categories         | Tax categories               |
      | Access control list    | Access control list          |
      | Widgets                | Widgets                      |
      | Web API                | Configure - Web API Frontend |
      | Local plugins          | Local plugins                |
      | All plugins and themes | All plugins and themes       |
