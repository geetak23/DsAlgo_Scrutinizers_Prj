@Dasshboard
Feature: DS Indtroduction Home Pageand validation without logging into it

Background: 
	Given user is on DS Portal DashBoard without sign in	
	Then the page title should be "NumpyNinja" for DashBoard 
	
	@Dasshboard_01    
	Scenario: DataStructures Dropdown validation
    Given user is on DS Portal DashBoard without sign in
    When user clicks the data structure dropdown arrow
    Then user should see the list of six options in the DS dropdown arrow
    When user selects any DS item from dropdown without sign in
    Then user should see the error message "You are not logged in"
      
  @Dasshboard_02
  Scenario: GetStarted buttons of DataStructures 
    Given user is on DS Portal DashBoard without sign in
    When user clicks on GET Started button of any DataStructures items without sign in
    Then user should see the error message "You are not logged in"
  @Dasshboard_03
  Scenario: Register link on DS Portal DashBoard
    Given user is on DS Portal DashBoard without sign in
    When user clicks the Register link on DS Portal DashBoard
    Then user should be redirected to Register page and see the Login link at the bottom of the page
   
  @Dasshboard_04
  Scenario:  SignIn link on DS Home Page
	  Given user is on DS Portal DashBoard without sign in
	  When user clicks the SignIn link on DS Portal DashBoard
	  Then user should be redirected to SignIn page and User should see the Register link at the bottom of the page
  
  
	    
