@GraphModule @Sharanya1
Feature: Graph Functionality with login

  Background: 
    Given  User has already Logged in

  Scenario: Check User able to Directed to Graph page from Dropdown
  
    When click on the dropdown and select Graph
    Then The user should be directed to Graph Page

  Scenario: Check User able to Directed to Graph page from Get Started button
  
    When click on Get Started button under Graph
    Then The user should be directed to Graph Page

  Scenario: Check User able to directed to Graph Topic page
    Given User is in Graph page
    When User clicks on Graph Topic button
    Then User should be directed to Graph Topic page With "Try Here"

 Scenario: Validate "Try Here" button
    Given User is in Graph Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run
    
Scenario Outline: Try Editor validation for Graph Topic with testcodes
  #Scenario: Validate "Text Editor" with valid code
    Given User is in "Text Editor" page with run through Graph page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
Examples:
 |SheetName |
 |pythonCode |
 Scenario Outline: Validate "Text Editor" with invalid code
    Given User is in "Text Editor" page with run through Graph page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
     When User clicks on Ok button
    Then User should be on Same page
    
 Examples:
 |SheetName |
 |pythonCode |
 
 

  Scenario: Check User able to directed to Graph Representations Topic page
    Given User is in Graph page
   When User clicks on Graph Representations Topic button
    Then User should be directed to Graph Representations Topic page With "Try Here"

  Scenario: Validate "Try Here" button Graph Representations Topic
    Given User is in Graph Representations Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run
    
Scenario Outline: Try Editor validation for Graph Representation Topic with testcodes
      Given User is in "Text Editor" page with run through Graph Representation page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
  Examples:
 |SheetName |
 |pythonCode |
 Scenario Outline: Validate "Text Editor" with invalid code
     Given User is in "Text Editor" page with run through Graph Representation page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
   Then User should be on Same page
 Examples:
 |SheetName |
 |pythonCode |
 
 
  