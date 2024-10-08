@SignInFF
Feature: DS Portal Application User Login

  As a registered user
  I want to log in to the DS Portal application
  So that I can access the learning materials for data structures and algorithms.

  Background:
    Given user is on the DS Portal login page 
  @SignInFF_01
  Scenario: DS Portal sign in validation
  When user gets the title of the page
	Then page title should be "Login"  
 
 @SignInFF_02
  Scenario: Login with username invalid  
    When user enters an invalid username as <username> and Invalid password as <password> and clicks Login
    	 	| username  | jhgjvgt |   
    	 	| password	| nt176   |   	
    Then user should see an error message "Invalid Username and Password"
    
 # Scenario Outline: validating Sign In with different input values
  # When user enter <username> and <Password> and clicks Login
   #Then 
    #Examples: 
     # | username                  | Password                  | Login | SheetName  |
      #| Arrays in Python          | Arrays in Python          | Try Here | LogIn |
      #| Arrays Using List         | Arrays Using List         | Try Here | LogIn |
      #| Basic Operations in Lists | Basic Operations in Lists | Try Here | LogIn|
      #| Applications of Array     | Applications of Array     | Try Here | LogIn|
  
  @SignInFF_03  
  Scenario: Successful login with valid credentials
    When user enters a valid username as <username> and valid password<password> and clicks Login
     | username  | Scrutinizers |
     | password  | Numpysdet176 |
    Then user should be navigated to the DS Algo Dashboard at "https://dsportalapp.herokuapp.com/home"
    


 