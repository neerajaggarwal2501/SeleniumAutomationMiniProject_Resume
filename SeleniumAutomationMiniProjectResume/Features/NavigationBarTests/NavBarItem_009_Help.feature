Feature: Validate all options under Navigation Bar -> "Help"

  Background: 
    When user opens url "https://admin-demo.nopcommerce.com/login"
    And user enters Username as "admin@yourstore.com" and password as "admin"
    And click on login button
    Then page title should be "Dashboard / nopCommerce administration"

  @Smoke
  Scenario: Validate that user is able to access all the options under Navigation Bar Item "Help"
    Given user clicks on Navigation bar item "Help"
    Then the count of windows open in the current browser is 1

    When user clicks on sub-menu item "Training"
    Then the count of windows open in the current browser is 2
    And the titles of open windows are
      | Dashboard / nopCommerce administration                 |
      | nopCommerce online course for developers - nopCommerce |
		When the user closes the window with title "nopCommerce online course for developers - nopCommerce"
		Then the count of windows open in the current browser is 1
		And the titles of open windows are
		  | Dashboard / nopCommerce administration                 |

    When user clicks on sub-menu item "Documentation"
    Then the count of windows open in the current browser is 2
    And the titles of open windows are
      | Dashboard / nopCommerce administration                 |
      | nopCommerce Documentation |
		When the user closes the window with title "nopCommerce Documentation"
		Then the count of windows open in the current browser is 1
		And the titles of open windows are
		  | Dashboard / nopCommerce administration                 |
		  
    When user clicks on sub-menu item "Community forums"
    Then the count of windows open in the current browser is 2
    And the titles of open windows are
      | Dashboard / nopCommerce administration                 |
      | Forums - nopCommerce |
		When the user closes the window with title "Forums - nopCommerce"
		Then the count of windows open in the current browser is 1
		And the titles of open windows are
		  | Dashboard / nopCommerce administration                 |		  
		  
    When user clicks on sub-menu item "Premium support services"
    Then the count of windows open in the current browser is 2
    And the titles of open windows are
      | Dashboard / nopCommerce administration                 |
      | Premium Support Services - nopCommerce |
		When the user closes the window with title "Premium Support Services - nopCommerce"
		Then the count of windows open in the current browser is 1
		And the titles of open windows are
		  | Dashboard / nopCommerce administration                 |		

    When user clicks on sub-menu item "Solution partners"
    Then the count of windows open in the current browser is 2
    And the titles of open windows are
      | Dashboard / nopCommerce administration                 |
      | Solution partners - nopCommerce |
		When the user closes the window with title "Solution partners - nopCommerce"
		Then the count of windows open in the current browser is 1
		And the titles of open windows are
		  | Dashboard / nopCommerce administration                 |			  
		  
		When user click on logout link
    Then page title should be "Your store. Login"  