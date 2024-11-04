@SignInFF
Feature: DS Portal Application User Login

Background:
    Given user is on the DS Portal login page 
    
@SignInFF_01
Scenario: DS Portal sign in validation
  When user gets the title of the page
	Then page title should be "Login"  
	
 @SignInFF_02
 Scenario: DS Portal sign in validation  
	Then user can see " Register" link   
	
@SignInFF_03
Scenario: Login with username invalid  
   When user enters an invalid username as <username> and Invalid password as <password> and clicks Login
    	 	| username  | jhgjvgt |   
    	 	| password	| nt176   |   	
   Then user should see an error message "Invalid Username and Password"
  
@SignInFF_04  
Scenario: Successful login with valid credentials
   When user enters a valid username as <username> and valid password<password> and clicks Login
     | username  | Scrutinizers |
     | password  | Numpysdet176 |
   Then user should be navigated to the DS Algo Dashboard
    


 