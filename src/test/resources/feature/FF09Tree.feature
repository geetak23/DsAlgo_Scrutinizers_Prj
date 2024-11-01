@TreeModule
Feature: Validating Tree Module2

  Background: 
    Given User has already Logged in
@Tree01
  Scenario: Check User able to Directed to Tree page from Dropdown
    When click on the dropdown and select Tree
    Then The user should be directed to Tree Page
@Tree02
  Scenario: Check User able to Directed to Tree page from Get Started button
    When click on Get Started button underTree
    Then The user should be directed to Tree Page

  @Tree03
  Scenario Outline: Validate Tree topics directed to text Editor
    Given User is in Tree page
    When User clicks on trees topic <TreeTopic> button.
    Then User should be directed to "Title" With Try Here
    When User clicks on Try Here button
    Then User should be directed to Text Editor page with run

    Examples: 
      | TreeTopic                      | Title                          |
      | Overview of Trees              | Overview of Trees              |
      | Terminologies                  | Terminologies                  |
      | Types of Trees                 | Types of Trees                 |
      | Tree Traversals                | Tree Traversals                |
      | Traversals-Illustration        | Traversals-Illustration        |
      | Binary Trees                   | Binary Trees                   |
      | Types of Binary Trees          | Types of Binary Trees          |
      | Implementation in Python       | Implementation in Python       |
      | Binary Tree Traversals         | Binary Tree Traversals         |
      | Implementation of Binary Trees | Implementation of Binary Trees |
      | Applications of Binary trees   | Applications of Binary trees   |
      | Binary Search Trees            | Binary Search Trees            |
      | Implementation Of BST          | Implementation Of BST          |
 @Tree04
  Scenario Outline: Scenario Outline: Try Editor validation for "TreeTopic" with valid testcodes
    Given User is in Text Editor page with run through <TreeTopic>
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | TreeTopic                      | SheetName  |
      | Overview of Trees              | pythonCode |
      | Terminologies                  | pythonCode |
      | Types of Trees                 | pythonCode |
      | Tree Traversals                | pythonCode |
      | Traversals-Illustration        | pythonCode |
      | Binary Trees                   | pythonCode |
      | Types of Binary Trees          | pythonCode |
      | Implementation in Python       | pythonCode |
      | Binary Tree Traversals         | pythonCode |
      | Implementation of Binary Trees | pythonCode |
      | Applications of Binary trees   | pythonCode |
      | Binary Search Trees            | pythonCode |
      | Implementation Of BST          | pythonCode |
@Tree05
  Scenario Outline: Try Editor validation for "Tree Topic" with invalid testcodes
    Given User is in Text Editor page with run through <TreeTopic>
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | TreeTopic                      | SheetName  |
      | Overview of Trees              | pythonCode |
      | Terminologies                  | pythonCode |
      | Types of Trees                 | pythonCode |
      | Tree Traversals                | pythonCode |
      | Traversals-Illustration        | pythonCode |
      | Binary Trees                   | pythonCode |
      | Types of Binary Trees          | pythonCode |
      | Implementation in Python       | pythonCode |
      | Binary Tree Traversals         | pythonCode |
      | Implementation of Binary Trees | pythonCode |
      | Applications of Binary trees   | pythonCode |
      | Binary Search Trees            | pythonCode |
      | Implementation Of BST          | pythonCode |
@Tree06
      Scenario Outline: Try Editor validation for "Tree Topic" with no code.
    Given User is in Text Editor page with run through <TreeTopic>
   When User clicks on run button without entering code
    Then User should be on Same page
    Examples: 
      | TreeTopic                      | 
      | Overview of Trees              | 
      | Terminologies                  | 
      | Types of Trees                 | 
      | Tree Traversals                | 
      | Traversals-Illustration        | 
      | Binary Trees                   | 
      | Types of Binary Trees          | 
      | Implementation in Python       | 
      | Binary Tree Traversals         |
      | Implementation of Binary Trees | 
      | Applications of Binary trees   | 
      | Binary Search Trees            | 
      | Implementation Of BST          | 