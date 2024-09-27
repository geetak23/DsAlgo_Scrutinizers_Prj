
Feature: DS Indtroduction Home Page without logging into it

Background: 
	Given user is on DS Portal DashBoard without sign in
	
	Scenario: DS Portal DashBoard validation
		Then the page title should be "NumpyNinja"  
	    
	Scenario: DataStructures Dropdown validation
    Given user is on DS Portal DashBoard without sign in
    When user clicks the data structure dropdown arrow
    Then user should see the list of six options in the DS dropdown arrow
    When user selects any DS item from dropdown without sign in
    Then user should see the error message "You are not logged in"
      
  Scenario: GetStarted buttons of DataStructures 
    Given user is on DS Portal DashBoard without sign in
    When user clicks on GET Started button of  any DataStructures items without sign in
    Then user should see the error message "You are not logged in"
       
  Scenario: Register link on DS Portal DashBoard
    Given user is on DS Portal DashBoard without sign in
    When user clicks the Register link on DS Portal DashBoard
    Then user should be redirected to Register page and see the Login link at the bottom of the page
   
  Scenario:  SignIn link on DS Home Page
	  Given user is on DS Portal DashBoard without sign in
	  When user clicks the SignIn link on DS Portal DashBoard
	  Then user should be redirected to SignIn page and User should see the Register link at the bottom of the page
  
  
	    
