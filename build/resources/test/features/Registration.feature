Feature: Registration Form
    Want to fill the Registration form with valid data
    With the goal of creating a new user

    Scenario:  Succesfully register a new user
        Given User is on the home page
        When the user clicks on the Join Today button
        And the user fills the registration form with valid data
        Then the user is redirected to a welcome page

    Scenario Outline: Clicking continue with incomplete form
        Given the user is on the registration form
        When the user fills the form with data:"<name>"  "<last_name>"  "<email>"  "<month>"  "<day>"  "<year>"  "<language>" 
        When the user clicks continue
        Then I should see an error message with the field: <missing>

            Scenarios:
            | name   | last_name | email | month     | day | year   | language  | missing   |
            | ""     | "Doe"     | " "   | "January" | "1" | "1990" | "English" | name      |
            | "John" | ""        | " "   | "January" | "1" | "1990" | "English" | last_name |
            | "John" | "Doe"     | ""    | "January" | "1" | "1990" | "English" | email     |




