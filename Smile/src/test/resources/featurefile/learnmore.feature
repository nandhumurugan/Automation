@Lrnmore
Feature: Learnmore login validation
  Scenario: validating the learnmore siginin webpage
    Given navigating to the learnmore website loginpage
    When user enters the user name "learnmore"and password "abc"
    And clicks on the login button
    Then user checks for the error message "Invalid Credentials.Please Check Once"

    @acc01
      Scenario: amazon Account list validation while click and hold
      #beforestep
        #Given user navigates to the amazon home page
      #Afterstep
      #beforestep
        When user moves to the account and list node and holds on
      #Afterstep
        Then the user can see the list of details available under accounts and lists
      #Afterstep

      @category
      Scenario: checking for the static dropdown values
        #Given user navigates to the amazon home page
        When user clicks the dropdown the list of static values are displayed
        Then user extracts the dropdown values

        @draganddrop
        Scenario: checking for drag and drop
          #Given user navigates to the jquery webpage
          When user performs drag and drop option
          #after
  @wiki
  Scenario: Table handling
    Given user extracts row and column value