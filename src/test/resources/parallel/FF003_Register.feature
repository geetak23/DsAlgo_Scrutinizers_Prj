@RegisterFF
Feature: Verifying or validating DS Portal Application User Registration

 As a new user
 I want to register for an account on the DS Portal application
 So that I can access resources for learning data structures and algorithms.
  
 Background:
 Given user is on the DS Portal registration page
 
 @RegisterFF_01
 Scenario:validate register page title
 Then register page title is "Registration"
 
 @RegisterFF_02
 Scenario: Registration with all missing required fields
   When user clicks the Register button without any input fields
   Then user can view an error message on Register Page "Please fill out this field" below Username textbox
    
  @RegisterFF_03
 Scenario: Registration with only username and other fields empty
  When user provides username as <username> with remaining fields empty and user clicks the Register button
  	|username       |Scenario1 |
    |password  			|   					| 
    |passwordconfirm|		 					|  
  Then user can view an error message on Register Page "Please fill out this field" below password textbox        
   
  @RegisterFF_04
  Scenario: Registration with username, pwd and pwd confirmation empty
   When user provides name as <username> and pwd as <password> and Password confirmation field empty and clicks the Register button
    |username       | Scenario2 |
    |password  			| 123@3asd | 
    |passwordconfirm|					 |  
   Then user can view an error message on Register Page "Please fill out this field" below Password confirmation textbox   	 
    
  @RegisterFF_05
  Scenario: Registration with non-matching pwd confirmation
   When user enters a username as <username> pwd as <password>  and pwd  confirmation as <passwordconfirm> and clicks the Register button
    |username  			|Scenario3  |
    |password  			|Numpy |
    |passwordconfirm|Numpy123 | 
   Then user can view an error message on Register Page "password_mismatch:The two password fields didn’t match."  
    
  @RegisterFF_06
  Scenario: Registration with password less than given length
   When user enters a username as <username> pwd as <password>  and pwd  confirmation as <passwordconfirm> and clicks the Register button
    |username  			|Scenario4  |
    |password  			|Numpy |
    |passwordconfirm|Numpy | 
   Then user can view an error message on Register Page "password_mismatch:The two password fields didn’t match."   
  
  @RegisterFF_07
  Scenario: Verify for existing user, if user already exist shows error message user is already exist
   When user enters a username as <username> pwd as <password>  and pwd  confirmation as <passwordconfirm> and clicks the Register button
    |username  			|Scenario5  |
    |password  			|Numpysdet176! |
    |passwordconfirm|Numpysdet176!	 |    
   Then user can view an error message on Register Page "password_mismatch:The two password fields didn’t match."
    
    @RegisterFF_08
  Scenario: Register user with all valid details provided
    When user enters a valid username as <username> pwd as <password> and  pwd confirmation as <passwordconfirm> and clicks the Register button
    |username  |Scenario6 |
    |password  |@NumpyNinjaSDET101! |
    |passwordconfirm  |@NumpyNinjaSDET101! |
    Then user should be redirected to Homepage with the message "New Account Created. You are logged in as" <username>  
    
    
    