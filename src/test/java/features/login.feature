@ignore
Feature: Login Functionality for Manufacton Website
  
  As a user of the Manufacton website
  I want to be able to log in with my account
  So that I can access my account-related features and manage my orders

  Background: 
    Given I am on the manufacton login page

  Scenario: Successful login with valid credentials
    Given I have entered a valid username and password
    When I click on the login button
    Then I should be logged in successfully

  Scenario Outline: Unsuccessful login with invalid or empty credentials
    Given I have entered invalid "<username>" and "<password>"
    When I click on the login button
    Then I should see an error message indicating "<error_message>"

    Examples: 
      | username          | password        | error_message                                  |
      | invalid@email.com | invalidPassword | Cannot log in with this user name and password |
      | abcccc            | validPassword   | Email Address is Not Valid                     |
      | valid@email.com   |                 | Cannot log in with this user name and password |
      |                   | validPassword   | Email Address is Not Valid                     |
