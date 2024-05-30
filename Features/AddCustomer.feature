Feature: AddCustomer
  Scenario:Add a new customer
    Given User launch Chrome browser
    When User open url "https://admin-demo.nopcommerce.com/login"
    And User Enter Email as "admin@yourstore.com" and password as "admin"
    And Click on Login
    Then User can view Dashboard
    When User click on customer Menu
    And click on customer Menu item
    And click on add new button
    Then user can view add a new customer page
    When user enter customer info
    And click on save button
    Then User can view confirmation message "The new customer has added successfully."
    And close Browser