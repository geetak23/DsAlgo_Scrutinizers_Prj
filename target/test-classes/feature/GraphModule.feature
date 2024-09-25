#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@GraphModule

Feature: Graph Functionality with login

  Background: 
  Given User has already Logged in DSAlgo portal
    
    Scenario: Check User able to Directed to Graph page from Dropdown
    Given User is logged in DSAlgo Portal
    When click on the dropdown and select Graph
    Then The user should be directed to "Graph" Page
    
    Scenario: Check User able to Directed to Graph page from Get Started button
    Given User is logged in DSAlgo Portal
    When click on Get Started button under Graph
    Then The user should be directed to "Graph" Page
    
    Scenario: Check User able to directed to Graph "Topic" page
    Given User is in "Graph" page
    When User clicks on Graph "Topic" button
    Then User should be directed to Graph "Topic" page With "Try Here"
    
    Scenario: Validate "Try Here" button
    Given User is in Graph "Topic" page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run
    
    Scenario: Validate "Text Editor" with valid code
    Given User is in "Text Editor" page with run
    When User writes valid code in "Text Editor" and clicks on run button
    Then User should able to see output in the console
    
    Scenario: Validate "Text Editor" with invalid code
    Given User is in "Text Editor" page with run
    When User writes invalid code in "Text Editor" and clicks on run button
    Then User should able to see an error message in alert window
    
    Scenario: Validate Ok button in alert Window
    Given User in a page with alert Window
    When User clicks on Ok button
    
    Scenario: Check User able to directed to Graph Representations "Topic" page
    Given User is in "Graph" page
    When User clicks on Graph Representations "Topic" button
    Then User should be directed to Graph Representations "Topic" page With "Try Here"
    
    Scenario: Validate "Try Here" button
    Given User is in Graph Representations "Topic" page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run
    
    Scenario: Validate "Text Editor" with valid code
    Given User is in "Text Editor" page with run
    When User writes valid code in "Text Editor" and clicks on run button
    Then User should able to see output in the console
    
    Scenario: Validate "Text Editor" with invalid code
    Given User is in "Text Editor" page with run
    When User writes invalid code in "Text Editor" and clicks on run button
    Then User should able to see an error message in alert window
    
    Scenario: Validate Ok button in alert Window
    Given User in a page with alert Window
    When User clicks on Ok button
    Then User should be on Same page
  
    #Given User has already Logged in
      #| username      | password     |
      #| Scrutinizers  | Numpysdet176 |
    #Given The user is on the "DSPortal" Home Page
    #When User clicks on Get Started button index 6
    #Then User should be on "Graph" page
#
  #@RegressionTest
  #Scenario Outline: Try Editor validation for Graph with testcodes
    #Given User is on the "Graph" Home Page of URL "https://dsportalapp.herokuapp.com/graph/"
    #When User click on '<Topic>'
    #Then User should navigate to page that contains title '<Title>'
    #When User clicks Try Here button of "<Topic>"
    #And The user is on the "TextEditor" Home Page
    #When The user write code in Editor from sheetname '<SheetName>' and rownumber 0
    #And Click the run button
    #Then The user should able to see output in the console "hello"
    #And The user is on the "TextEditor" Home Page
    #When The user write code in Editor from sheetname '<SheetName>' and rownumber 1
    #And Click the run button
    #Then The user should able to see an error message in alert window
    #When The user clicks on ok button in alert window
    #Then The user is on the "TextEditor"  Page
    #When User click back button 
    #Then The user should navigate to URL "https://dsportalapp.herokuapp.com/graph/graph-representations/"
    #
    #Examples: 
      #| Topic                 | Title                 | Try Here | SheetName  |
      #| Graph                 | Graph                 | Try Here | pythonCode |
      #| Graph Representations | Graph Representations | Try Here | pythonCode |
