@RegisterPage
Feature: Verifying or validating DS Portal Application User Registration

 As a new user
 I want to register for an account on the DS Portal application
 So that I can access resources for learning data structures and algorithms.
  
 Background:
 Given user is on the DS Portal registration page
 
 @RegisterPageScenario1
  Scenario: Registration with all missing required fields
    When user clicks the "Register" button
    Then user can view an error message "Please fill out this field" below Username textbox
    
  @RegisterPageScenario2
  Scenario: Registration with only username and other fields empty
    When user provides username as <username> with remaining fields empty
    | username      | 
    | Scrutinizers2 |
    And user clicks the "Register" button
    Then user can view an error message "Please fill out this field" below Username textbox        
   
  @RegisterPageScenario3
  Scenario: Registration with username, password and password confirmation empty
    When user provides username as <username> and password as <password> with Password confirmation field empty
     | username      | password |
     | Scrutinizers2 | 123@3asd |
    And user clicks the "Register" button
    Then user can view an error message "Please fill out this field" below Password confirmation textbox   	 
    
  @RegistrationScenario4
  Scenario: Registration with non-matching password confirmation
    When user enters a valid username as <username>
    And user enters a valid password as <password>
    And user password  confirmation as <passwordconfirm> # Non-matching password
    | username      | password     |passwordconfirm|
    | Scrutinizers2 | Password123! |Password1234!  |
    And user clicks the "Register" button
    Then user should see an error message "password_mismatch:The two password fields didn’t match."  
    
  @RegistrationScenario5
  Scenario: Registration with password less than given length
    When user enters a valid username as <username>
    And user enters a valid password as <password>
    And user password  confirmation as <passwordconfirm> 
    | username      | password     |passwordconfirm|
    | Scrutinizers2 | asd 				 |asd 					 |
    And user clicks the "Register" button
    Then user should see an error message "password_mismatch:The two password fields didn’t match."#invalid error message for length  
   
    
  @RegistrationScenario6
  Scenario: Verify for existing user, if user already exist shows error message
    When user enters a valid username as <username>
    And user enters a valid password as <password>
    And user password  confirmation as <passwordconfirm> 
    | username      | password     |passwordconfirm|
    | Scrutinizers  | Numpysdet176 |Numpysdet176 	 |
    And user clicks the "Register" button
    Then user should see an error message "user is already exist"#invalid error message for length   
    
    
  @RegistrationScenario7
  Scenario: Register user with all valid details provided
    When user enters a valid username as <username>
    And user enters a valid password as <password>
    And user password  confirmation as <passwordconfirm> 
    | username      | password     |passwordconfirm|
    | Scrutinizers  | Numpysdet176 |Numpysdet176 	 |
    And user clicks the "Register" button
    Then user should be redirected to Homepage with the message "New Account Created. You are logged in as" <username> 
    
    
    