
@GraphModule
Feature: Graph Functionality with login

  Background: 
    Given User has already Logged in DSAlgo portal

  Scenario: Check User able to Directed to Graph page from Dropdown
    Given User is logged in DSAlgo Portal
    When click on the dropdown and select Graph
    Then The user should be directed to Graph Page

  Scenario: Check User able to Directed to Graph page from Get Started button
    Given User is logged in DSAlgo Portal
    When click on Get Started button under Graph
    Then The user should be directed to Graph Page

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
   