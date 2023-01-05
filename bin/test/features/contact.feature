Feature: Registration Form
    Want to fill the Registration form with valid data
    With the goal of creating a new user

    Scenario:  Succesfully register a new user
        Given User is on the home page
        When the user clicks on the Join Today button
        And the user fills the registration form with valid data
        Then the user is redirected to a welcome page

