Feature: Google.com

  @Smoke
  Scenario: https://www.google.com/
    Given user opens url "https://www.google.com/"
    Then the title of page is "Google"

  @Regression
  Scenario: https://www.google.com/imghp
    Given user opens url "https://www.google.com/imghp"
    Then the title of page is "Google Images"
