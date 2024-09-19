
@DashBoardPage
Feature: DS Portal Home Page Functionality

Background: DS Portal Homepage Navigation As a user of the DS Portal App 
User wants to navigate through the homepage So that
User can access different sections and features of the portal

@DashBoardScenario1
Scenario: User navigates to DS Portal home page
	  Given user is on dsportal home page
	  Then the page title should be "Numpy Ninja"
	  And user should be navigated to "https://dsportalapp.herokuapp.com/home"
	    
@DashBoardScenario2
Scenario: User clicks on Sign In link from home page
	  Given user is on dsportal home page
	  When user clicks on "Sign In" link
	  Then user should be navigated to "https://dsportalapp.herokuapp.com/login"

@DashBoardScenario3
 Scenario: User clicks on Register link from home page
	  Given user is on dsportal home page
	  When user clicks on "Register" link
	  Then user should be navigated to "https://dsportalapp.herokuapp.com/register"
 

@DashBoardScenario4  
 Scenario: Non-signed-in user tries to access Data Structures dropdown
    Given user is Non-signed in on dsportal home page
	  When user selects "<Section>" from the Data Structure dropdown
	  Then user receives "You are not logged in"  message
     
@DashBoardScenario5 
  Scenario Outline: Non-Signed in user clicks on "Get Started" button for different sections
    Given user is Non-signed in on dsportal home page
    When user clicks on "Get Started" button for "<Section>"   
    Then user receives "You are not logged in"  message
  Examples:
    | Section         | 
    | Data Structures | 
    | Arrays          | 
    | Linked List     |
    | Stack           |   
    | Tree            |
    | Graph           |
       

@DashBoardScenario6 
 Scenario Outline: Signed-in user selects "<Section>" from the Data Structure dropdown
  	Given user is signed in on dsportal home page
    When user selects "<Section>" from the Data Structure dropdown
    Then user should be navigated to "<ExpectedURL>"
 Examples:
    | Section         | ExpectedURL                                        |
    | Arrays          | https://dsportalapp.herokuapp.com/arrays/          |
    | Linked List     | https://dsportalapp.herokuapp.com/linked-list/     |
    | Stack           | https://dsportalapp.herokuapp.com/stack/           |
    | Queue           | https://dsportalapp.herokuapp.com/queue/           |
    | Tree            | https://dsportalapp.herokuapp.com/tree/            |
    | Graph           | https://dsportalapp.herokuapp.com/graph/           |


@DashBoardScenario7
Scenario Outline: Signed-in user clicks on "Get Started" button for different sections
  	Given user is signed in on dsportal home page
    When user clicks on "Get Started" button for "<Section>"
    Then user should be navigated to "<ExpectedURL>"
Examples:
    | Section         | ExpectedURL                                       |
    | Data Structures | https://dsportalapp.herokuapp.com/data-structures/ |
    | Arrays          | https://dsportalapp.herokuapp.com/arrays/          |
    | Linked List     | https://dsportalapp.herokuapp.com/linked-list/     |
    | Stack           | https://dsportalapp.herokuapp.com/stack/           |   
    | Tree            | https://dsportalapp.herokuapp.com/tree/            |
    | Graph           | https://dsportalapp.herokuapp.com/graph/           |
    

    
    