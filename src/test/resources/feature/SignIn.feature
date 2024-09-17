@LoginPage
Feature: DS Portal Application User Login

  As a registered user
  I want to log in to the DS Portal application
  So that I can access the learning materials for data structures and algorithms.

  Background:
    Given user is on the DS Portal login page

  @LoginScenario1
  Scenario: Successful login with valid credentials
    When user enters a valid username as <username> and valid password<password>
     | username      | password     |
     | Scrutinizers  | Numpysdet176 |
    And user clicks the "Login" button
    Then user should be navigated to the DS Algo Dashboard at "https://dsportalapp.herokuapp.com/home"

  @LoginScenario2
  Scenario: Login with username invalid  or empty
    When user enters an invalid username as <username> and user enters a valid password as <password>
    | username  | password     |   
    | asdfwe	  | Numpysdet176 |
    | 					| Numpysdet176 |
    And user clicks the "Login" button
    Then user should see an error message "Invalid username" #Please fill out this field
    
  @LoginScenario3
  Scenario: Login with password invalid  or empty
    When user enters an valid username as <username> and invalid password as <password>
    | username     | password|   
    | Scrutinizers | sdfas   |
    | Scrutinizers |         |
    And user clicks the "Login" button
    Then user should see an error message "Invalid username"
    
    
  @LoginScenario4
  Scenario: Login with invalid username and invalid password
    When user enters an invalid username as <username> and invalid password as <password>
    | username     | password|   
    | zsdf 				 | sdfas   |
    |  						 |         |
    And user clicks the "Login" button
    Then user should see an error message "Invalid username"

 