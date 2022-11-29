Feature: IC create new time and material page

  Scenario: Creating a new time and material record

    Given the user access the create new time and material page
    When the user selects the typecode from the dropdown list box
    And the user enters a valid code
    And the user enter a description
    And the user enters a valid price per unit
    And the user clicks on the save button
    Then the record is saved and the user is directed to the main time and material page