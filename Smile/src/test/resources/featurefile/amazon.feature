Feature: Amazon login page Validation
  @Sc01
  Scenario: search functionality
    Given user navigates to the amazon home page
    When user gives the product name as "iphone" in search box
    And user clicks the search icon
    Then the user checks for the title of search result page

  Scenario: signin validation
    Given user navigates to the amazon home page
    When user gives the product name as "mouse" in search box