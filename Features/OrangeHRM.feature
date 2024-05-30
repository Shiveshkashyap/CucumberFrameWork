Feature: OrangeHRM Login

  Scenario: Logo presence on OrangeHRM home Page
    Given I login to chrome Browser
    When  I open orange hrm homepage
    Then  I verify the logo present on that page
    And  I close the Browser