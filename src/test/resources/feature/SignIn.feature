
Feature: DS Portal Application User Login

  As a registered user
  I want to log in to the DS Portal application
  So that I can access the learning materials for data structures and algorithms.

  Background:
    Given user is on the DS Portal login page 
  
  Scenario: DS Portal sign in validation
  When user gets the title of the page
	Then the page title should be "Login"  
 
  Scenario: Login with username invalid  
    When user enters an invalid username as <username> and Invalid password as <password> and clicks Login
    	 	| username  | jhgjvgt |   
    	 	| password	| nt176   |   	
    Then user should see an error message "Invalid Username and Password"
    
  Scenario: Successful login with valid credentials
    When user enters a valid username as <username> and valid password<password> and clicks Login
     | username  | Scrutinizers |
     | password  | Numpysdet176 |
    Then user should be navigated to the DS Algo Dashboard at "https://dsportalapp.herokuapp.com/home"

 