@Stack2
Feature: Stack Functionality with login

  Background: 
    Given User has already Logged in

  Scenario: Check User able to Directed to Satck page from Dropdown
    When click on the dropdown and select Stack
    Then The user should be directed to Stack Page

  Scenario: Check User able to Directed to Stack page from Get Started button
    When click on Get Started button under Stack
    Then The user should be directed to Stack Page

  Scenario Outline: Validate Stack topics
    Given User is in Stack page
    When User clicks on Stack topic "StackTopic" button.
    Then User should be directed to "Title" With Try Here
    When User clicks on Try Here button
    Then User should be directed to Text Editor page with run

    Examples: 
      | StackTopic          | Title               |
      | Operations in Stack | Operations in Stack |
      | Operations          | Operations          |
      | Implementation      | Implementation      |
      | Applications        | Applications        |

  @TestValid
  Scenario Outline: Scenario Outline: Try Editor validation for "StackTopic" with valid testcodes
    Given User is in Stack Text Editor page with run through "StackTopic"
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | StackTopic          | SheetName  |
      | Operations in Stack | pythonCode |
      | Operations          | pythonCode |
      | Implementation      | pythonCode |
      | Applications        | pythonCode |

  @TestValid2
  Scenario Outline: Try Editor validation for "StackTopic" with invalid testcodes
    Given User is in Stack Text Editor page with run through "StackTopic"
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | StackTopic          | SheetName  |
      | Operations in Stack | pythonCode |
      | Operations          | pythonCode |
      | Implementation      | pythonCode |
      | Applications        | pythonCode |
