@Queue2
Feature: Queue Functionality with login

  Background: 
    Given User has already Logged in

  Scenario: Check User able to Directed to Queue page from Dropdown
    When click on the dropdown and select Queue
    Then The user should be directed to Queue Page

  Scenario: Check User able to Directed to Queue page from Get Started button
    When click on Get Started button under Queue
    Then The user should be directed to Queue Page

  Scenario Outline: Validate Queue topics with Testcode
    Given User is in Queue page
    When User clicks on Queue topic "QueueTopic" button.
    Then User should be directed to "Title" With Try Here
    When User clicks on Try Here button
    Then User should be directed to Text Editor page with run

    Examples: 
      | QueueTopic                             | Title                                  |
      | Implementation of Queue in Python      | Implementation of Queue in Python      |
      | Implementation using collections deque | Implementation using collections deque |
      | Implementation using array             | Implementation using array             |
      | Queue Operations                       | Queue Operations                       |

  @TestValid
  Scenario Outline: Scenario Outline: Try Editor validation for "QueueTopic" with valid testcodes
    Given User is in  Queue Text Editor page with run through "QueueTopic"
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | QueueTopic                             | SheetName  |
      | Implementation of Queue in Python      | pythonCode |
      | Implementation using collections deque | pythonCode |
      | Implementation using array             | pythonCode |
      | Queue Operations                       | pythonCode |

  @TestValid2
  Scenario Outline: Try Editor validation for "QueueTopic" with invalid testcodes
    Given User is in  Queue Text Editor page with run through "QueueTopic"
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | QueueTopic                             | SheetName  |
      | Implementation of Queue in Python      | pythonCode |
      | Implementation using collections deque | pythonCode |
      | Implementation using array             | pythonCode |
      | Queue Operations                       | pythonCode |
