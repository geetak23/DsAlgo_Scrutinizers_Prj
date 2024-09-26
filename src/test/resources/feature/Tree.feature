@TreeModule @DataStructures
Feature: Validating Tree Module

 @TreePage
  Scenario: Check User able to Directed to Tree page from Dropdown
    Given User is logged in DSAlgo Portal
  #  When click on the dropdown and select Tree
   # Then The user should be directed to Tree Page

  Scenario: Check User able to Directed to Tree page from Get Started button
    Given User is logged in DSAlgo Portal
    When click on Get Started button underTree
    Then The user should be directed to Tree Page

  Scenario: Check User able to directed to Overview of trees Topic page
    Given User is in Tree page
    When User clicks on Overview of trees Topic button
    Then User should be directed to Overview of trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Overview of trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Terminologies Topic page
    Given User is in Tree page
    When User clicks on Terminologies Topic button
    Then User should be directed to Terminologies Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Terminologies Topic page With "Try Here"
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

  Scenario: Check User able to directed to Types of Trees Topic page
    Given User is in Tree page
    When User clicks on Types of Trees Topic button
    Then User should be directed to Types of Trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Types of Trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Tree Traversals Topic page
    Given User is in Tree page
    When User clicks on Tree Traversals Topic button
    Then User should be directed to Tree Traversals Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Tree Traversals Topic page With "Try Here"
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

  Scenario: Check User able to directed to Traversals-Illustration Topic page
    Given User is in Tree page
    When User clicks on Traversals-Illustration Topic button
    Then User should be directed to Traversals-Illustration Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Traversals-Illustration Topic page With "Try Here"
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

  Scenario: Check User able to directed to Binary Trees Topic page
    Given User is in Tree page
    When User clicks on Binary Trees Topic button
    Then User should be directed to Binary Trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Binary Trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Types of Binary Trees Topic page
    Given User is in Tree page
    When User clicks on Types of Binary Trees Topic button
    Then User should be directed to Types of Binary Trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Types of Binary Trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Implementation in Python Topic page
    Given User is in Tree page
    When User clicks on Implementation in Python Topic button
    Then User should be directed to Implementation in Python Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Implementation in Python Topic page With "Try Here"
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

  Scenario: Check User able to directed to Binary Tree Traversals Topic page
    Given User is in Tree page
    When User clicks on Binary Tree Traversals Topic button
    Then User should be directed to Binary Tree Traversals Topic page With Try Here

  Scenario: Validate Try Here button
    Given User is in Binary Tree Traversals Topic page With "Try Here"
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

  Scenario: Check User able to directed to Implementation of Binary Trees Topic page
    Given User is in Tree page
    When User clicks on Implementation of Binary Trees Topic button
    Then User should be directed to Implementation of Binary Trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Implementation of Binary Trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Applications of Binary trees Topic page
    Given User is in Tree page
    When User clicks on Applications of Binary trees Topic button
    Then User should be directed to Applications of Binary trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Applications of Binary trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Binary Search Trees Topic page
    Given User is in Tree page
    When User clicks on Binary Search Trees Topic button
    Then User should be directed to Binary Search Trees Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Binary Search Trees Topic page With "Try Here"
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

  Scenario: Check User able to directed to Implementation Of BST Topic page
    Given User is in Tree page
    When User clicks on Implementation Of BST Topic button
    Then User should be directed to Implementation Of BST Topic page With "Try Here"

  Scenario: Validate "Try Here" button
    Given User is in Implementation Of BST Topic page With "Try Here"
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
