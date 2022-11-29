Feature: "Industrty connect login page"

  Scenario: "Log in to IC portal using valid username and password"
    Given the user access the IC login portal page
    When the user enters a valid username
    And the user enters a valid password
    And the user clicks on the login button
    Then the user is directed to the IC connect home page
