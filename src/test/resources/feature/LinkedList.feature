@LinkedListModule @Sharanya1
Feature: Linked List Functionality with login

  Background: 
    Given  User has already Logged in

  Scenario: Check User able to Directed to Linked List page from Dropdown
    When click on the dropdown and select Linked List
    Then The user should be directed to Linked List Page

  Scenario: Check User able to Directed to Linked List page from Get Started button
    When click on Get Started button under Linked List
    Then The user should be directed to Linked List Page

  Scenario: Check User able to directed to Introduction Topic page
    Given User is in Linked List page
    When User clicks on Introduction Topic button
    Then User should be directed to Introduction Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Introduction Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run
  @Test3  
Scenario Outline: Try Editor validation for Introduction Topic with valid testcodes
  
    Given User is in "Text Editor" page with run through Introduction page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
Examples:
 |SheetName |
 |pythonCode |
 @Test3
    Scenario Outline: Try Editor validation for Introduction Topic with invalid testcode
   Given User is in "Text Editor" page with run through Introduction page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page
    Examples:
 |SheetName |
 |pythonCode |
  Scenario: Check User able to directed to Creating Linked LIst Topic page
    Given User is in Linked List page
    When User clicks on Creating Linked LIst Topic button
    Then User should be directed to Creating Linked LIst Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Creating Linked LIst Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run
@Test3
  Scenario Outline: Try Editor validation for Creating Linked LIst Topic with  Valid codes
    Given User is in "Text Editor" page with run through Creating Linked LIst page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
    Examples:
 |SheetName |
 |pythonCode |
 @Test3
  Scenario Outline: Try Editor validation for Creating Linked LIst Topic with invalid codes
  Given User is in "Text Editor" page with run through Creating Linked LIst page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page
    
    Examples:
 |SheetName |
 |pythonCode |

  Scenario: Check User able to directed to Types of Linked List Topic page
    Given User is in Linked List page
    When User clicks on Types of Linked List Topic button
    Then User should be directed to Types of Linked List Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Types of Linked List Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  Scenario Outline: Try Editor validation for Types of Linked List Topic with valid codes
    Given User is in "Text Editor" page with run through Types of Linked List page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
  Examples:
 |SheetName |
 |pythonCode | 
 Scenario Outline: Try Editor validation for Types of Linked List Topic with invalid codes
    Given User is in "Text Editor" page with run through Types of Linked List page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window

 
    When User clicks on Ok button
    Then User should be on Same page
Examples:
 |SheetName |
 |pythonCode |
 
  Scenario: Check User able to directed to Implement Linked List in Python Topic page
    Given User is in Linked List page
    When User clicks on Implement Linked List in Python Topic button
    Then User should be directed to Implement Linked List in Python Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Implement Linked List in Python Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  Scenario Outline: Try Editor validation for Implement Linked List in Python Topic with testcodes
    Given User is in "Text Editor" page with run through Implement Linked List in Python page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
  Examples:
 |SheetName |
 |pythonCode |
 Scenario Outline: Try Editor validation for Implement Linked List in Python Topic with testcodes
    Given User is in "Text Editor" page with run through Implement Linked List in Python page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window

    When User clicks on Ok button
    Then User should be on Same page
    Examples:
 |SheetName |
 |pythonCode |

  Scenario: Check User able to directed to Traversal Topic page
    Given User is in Linked List page
    When User clicks on Traversal Topic button
    Then User should be directed to Traversal Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Traversal Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

 Scenario Outline: Try Editor validation for Traversal Topic with testcodes
    Given User is in "Text Editor" page with run through Traversal page

  When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
  Examples:
 |SheetName |
 |pythonCode |
 Scenario Outline: Try Editor validation for Traversal Topic with invalid code
    Given User is in "Text Editor" page with run through Traversal page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window

    When User clicks on Ok button
    Then User should be on Same page
    Examples:
 |SheetName |
 |pythonCode |

  Scenario: Check User able to directed to Insertion Topic page
    Given User is in Linked List page
    When User clicks on Insertion Topic button
    Then User should be directed to Insertion Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Insertion Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  Scenario Outline: Try Editor validation for Insertion Topic with valid code
    Given User is in "Text Editor" page with run through Insertion page
     When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
  Examples:
 |SheetName |
 |pythonCode |
 Scenario Outline: Try Editor validation for Insertion Topic with invalid code
    Given User is in "Text Editor" page with run through Insertion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page
    Examples:
 |SheetName |
 |pythonCode |
 
  Scenario: Check User able to directed to Deletion Topic page
    Given User is in Linked List page
    When User clicks on Deletion Topic button
    Then User should be directed to Deletion Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Deletion Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

   Scenario Outline: Try Editor validation for Deletion Topic with valid code
    Given User is in "Text Editor" page with run through Deletion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console
  Examples:
 |SheetName |
 |pythonCode |
 Scenario Outline: Try Editor validation for Deletion Topic with invalid code
    Given User is in "Text Editor" page with run through Deletion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window

    When User clicks on Ok button
    Then User should be on Same page
    Examples:
 |SheetName |
 |pythonCode |