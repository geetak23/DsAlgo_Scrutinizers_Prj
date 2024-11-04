@Stack
Feature: Stack Functionality with login

  Background: 
    Given User has already Logged in
@Stack01
  Scenario: Check User able to Directed to Satck page from Dropdown
    When click on the dropdown and select Stack
    Then The user should be directed to Stack Page
@Stack02
  Scenario: Check User able to Directed to Stack page from Get Started button
    When click on Get Started button under Stack
    Then The user should be directed to Stack Page
@Stack03
  Scenario Outline: Validate Stack topics
    Given User is in Stack page
    When User clicks on Stack topic <StackTopic> button.
    Then User should be directed to "Title" With Try Here
    When User clicks on Try Here button
    Then User should be directed to Text Editor page with run

    Examples: 
      | StackTopic          | Title               |
      | Operations in Stack | Operations in Stack |
      | Implementation      | Implementation      |
      | Applications        | Applications        |

  @Stack04 
  Scenario Outline: Scenario Outline: Try Editor validation for "StackTopic" with valid testcodes
    Given User is in Stack Text Editor page with run through <StackTopic>
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | StackTopic          | SheetName  |
      | Operations in Stack | pythonCode |
      | Implementation      | pythonCode |
      | Applications        | pythonCode |

  @Stack05
  Scenario Outline: Try Editor validation for "StackTopic" with invalid testcodes
    Given User is in Stack Text Editor page with run through <StackTopic>
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | StackTopic          | SheetName  |
      | Operations in Stack | pythonCode |
      | Implementation      | pythonCode |
      | Applications        | pythonCode |
     @Stack06 
Scenario Outline: Try Editor validation for "StackTopic" with no code.
    Given User is in Stack Text Editor page with run through <StackTopic>
   When User clicks on run button without entering code
    Then User should be on Same page

    Examples: 
      | StackTopic          | 
      | Operations in Stack | 
      | Implementation      | 
      | Applications        | 
      @Stack07 
      Scenario: Check User able to Directed to Graph page from Dropdown in Stack Page
Given User is in Stack page
  When click on the dropdown and select Graph
  Then The user should be directed to Graph Page
  
      @Stack08 
      Scenario: Check User able to Directed to Tree page from Dropdown in Stack Page
Given User is in Stack page
  When click on the dropdown and select Tree
  Then The user should be directed to Tree Page
      @Stack09 
       Scenario: Check User able to Directed to Queue page from Dropdown in Stack Page
    Given User is in Stack page
    When click on the dropdown and select Queue
    Then The user should be directed to Queue Page
      @Stack10
       Scenario: Check User able to Directed to Array page from Dropdown in Stack Page
     Given User is in Stack page
    When click on the dropdown and select Array
    Then The user should be directed to Array Page
      @Stack11
      Scenario: Check User able to Directed to Satck page from Dropdown in Stack Page
  Given User is in Stack page
    When click on the dropdown and select Stack
    Then The user should be  on Stack Page
      @Stack12
      Scenario: Check User is on same Linked List from Dropdown in Stack Page
    Given User is in Stack page
    When click on the dropdown and select Linked List
    Then The user should be directed to Linked List Page
    @Stack13 
    Scenario: Check User is on same Stack page clicked on Scrutinizers(UserName) Link
     Given User is in Stack page
     When User clicks on Scrutinizers
      Then The user should be  on Stack Page