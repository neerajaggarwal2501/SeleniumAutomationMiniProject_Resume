Feature: bing.com

  @Smoke
  Scenario: https://www.bing.com/
    Given user opens url "https://www.bing.com/"
    Then the title of page is "Bing"

  @Regression
  Scenario: https://www.bing.com/travel
    Given user opens url "https://www.bing.com/travel"
    Then the title of page is "Microsoft Bing Travel"
    When user clicks on "Flights"
    Then the title of page is "Microsoft Bing Travel - Flights"
    When user clicks on "Stays"
    Then the title of page is "Microsoft Bing Travel - Stays"
    When user clicks on "Car rentals"
    Then the title of page is "Microsoft Bing Travel - Car rentals"
