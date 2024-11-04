@LinkedListModule
Feature: Linked List Functionality with login

  Background: 
    Given User has already Logged in

  @LinkedList01
  Scenario: Check User able to Directed to Linked List page from Dropdown
    When click on the dropdown and select Linked List
    Then The user should be directed to Linked List Page

  @LinkedList02
  Scenario: Check User able to Directed to Linked List page from Get Started button
    When click on Get Started button under Linked List
    Then The user should be directed to Linked List Page

  @LinkedList03
  Scenario: Check User able to directed to Introduction Topic page
    Given User is in Linked List page
    When User clicks on Introduction Topic button
    Then User should be directed to Introduction Topic page With "Try Here"

  @LinkedList04
  Scenario: Validate "Try Here" button
    Given User is in Introduction Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList05
  Scenario Outline: Try Editor validation for Introduction Topic with valid testcodes
    Given User is in "Text Editor" page with run through Introduction page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList06
  Scenario Outline: Try Editor validation for Introduction Topic with invalid testcode
    Given User is in "Text Editor" page with run through Introduction page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList07
  Scenario: Check User able to directed to Creating Linked LIst Topic page
    Given User is in Linked List page
    When User clicks on Creating Linked LIst Topic button
    Then User should be directed to Creating Linked LIst Topic page With "Try Here"

  @LinkedList08
  Scenario: Validate "Try Here" button
    Given User is in Creating Linked LIst Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList09
  Scenario Outline: Try Editor validation for Creating Linked LIst Topic with  Valid codes
    Given User is in "Text Editor" page with run through Creating Linked LIst page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList10
  Scenario Outline: Try Editor validation for Creating Linked LIst Topic with invalid codes
    Given User is in "Text Editor" page with run through Creating Linked LIst page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList11
  Scenario: Check User able to directed to Types of Linked List Topic page
    Given User is in Linked List page
    When User clicks on Types of Linked List Topic button
    Then User should be directed to Types of Linked List Topic page With "Try Here"

  @LinkedList12
  Scenario: Validate "Try Here" button
    Given User is in Types of Linked List Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList13
  Scenario Outline: Try Editor validation for Types of Linked List Topic with valid codes
    Given User is in "Text Editor" page with run through Types of Linked List page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList14
  Scenario Outline: Try Editor validation for Types of Linked List Topic with invalid codes
    Given User is in "Text Editor" page with run through Types of Linked List page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList15
  Scenario: Check User able to directed to Implement Linked List in Python Topic page
    Given User is in Linked List page
    When User clicks on Implement Linked List in Python Topic button
    Then User should be directed to Implement Linked List in Python Topic page With "Try Here"

  @LinkedList16
  Scenario: Validate "Try Here" button
    Given User is in Implement Linked List in Python Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList17
  Scenario Outline: Try Editor validation for Implement Linked List in Python Topic with testcodes
    Given User is in "Text Editor" page with run through Implement Linked List in Python page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList18
  Scenario Outline: Try Editor validation for Implement Linked List in Python Topic with testcodes
    Given User is in "Text Editor" page with run through Implement Linked List in Python page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList19
  Scenario: Check User able to directed to Traversal Topic page
    Given User is in Linked List page
    When User clicks on Traversal Topic button
    Then User should be directed to Traversal Topic page With "Try Here"

  @LinkedList20
  Scenario: Validate "Try Here" button
    Given User is in Traversal Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList21
  Scenario Outline: Try Editor validation for Traversal Topic with testcodes
    Given User is in "Text Editor" page with run through Traversal page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList22
  Scenario Outline: Try Editor validation for Traversal Topic with invalid code
    Given User is in "Text Editor" page with run through Traversal page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList23
  Scenario: Check User able to directed to Insertion Topic page
    Given User is in Linked List page
    When User clicks on Insertion Topic button
    Then User should be directed to Insertion Topic page With "Try Here"

  @LinkedList24
  Scenario: Validate "Try Here" button
    Given User is in Insertion Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList25
  Scenario Outline: Try Editor validation for Insertion Topic with valid code
    Given User is in "Text Editor" page with run through Insertion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList26
  Scenario Outline: Try Editor validation for Insertion Topic with invalid code
    Given User is in "Text Editor" page with run through Insertion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList28
  Scenario: Check User able to directed to Deletion Topic page
    Given User is in Linked List page
    When User clicks on Deletion Topic button
    Then User should be directed to Deletion Topic page With "Try Here"

  @LinkedList29
  Scenario: Validate "Try Here" button
    Given User is in Deletion Topic page With "Try Here"
    When User clicks on "Try Here" button
    Then User should be directed to "Text Editor" page with run

  @LinkedList30
  Scenario Outline: Try Editor validation for Deletion Topic with valid code
    Given User is in "Text Editor" page with run through Deletion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 0 and clicks on run button
    Then User should able to see output in the console

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList31
  Scenario Outline: Try Editor validation for Deletion Topic with invalid code
    Given User is in "Text Editor" page with run through Deletion page
    When User writes code in Text Editor from sheetname '<SheetName>' and rownumber 1 and clicks on run button
    Then User should able to see an error message in alert window
    When User clicks on Ok button
    Then User should be on Same page

    Examples: 
      | SheetName  |
      | pythonCode |

  @LinkedList32
  Scenario: Check User able to Directed to Graph page from Dropdown in Linked List page
    Given User is in Linked List page
    When click on the dropdown and select Graph
    Then The user should be directed to Graph Page

  @LinkedList33
  Scenario: Check User able to Directed to Satck page from Dropdown in Linked List page
    Given User is in Linked List page
    When click on the dropdown and select Stack
    Then The user should be directed to Stack Page

  @LinkedList34
  Scenario: Check User able to Directed to Queue page from Dropdown in Linked List page
    Given User is in Linked List page
    When click on the dropdown and select Queue
    Then The user should be directed to Queue Page

  @LinkedList35
  Scenario: Check User able to Directed to Tree page from Dropdown in Linked List page
    Given User is in Linked List page
    When click on the dropdown and select Tree
    Then The user should be directed to Tree Page

  @LinkedList36
  Scenario: Check User able to Directed to Array page from Dropdown in Linked List page
    Given User is in Linked List page
    When click on the dropdown and select Array
    Then The user should be directed to Array Page

  @LinkedList37
  Scenario: Check User is on same Linked List from Dropdown in Linked List page
    Given User is in Linked List page
    When click on the dropdown and select Linked List
    Then The user should be on Linked List Page

  @LinkedList38
  Scenario: Check User is on same Linked List clicked on Scrutinizers(UserName) Link
    Given User is in Linked List page
    When User clicks on Scrutinizers
    Then The user should be on Linked List Page

  @LinkedList39
  Scenario: Try Editor validation for Introduction Topic with no testcode
    Given User is in "Text Editor" page with run through Introduction page
    When User clicks on run button without entering code
    Then User should be on Same page

  @LinkedList40
  Scenario: Try Editor validation for Creating Linked LIst Topic with  no code
    Given User is in "Text Editor" page with run through Creating Linked LIst page
    When User clicks on run button without entering code
    Then User should be on Same page

  @LinkedList41
  Scenario: Try Editor validation for Types of Linked List Topic with no code
    Given User is in "Text Editor" page with run through Types of Linked List page
    When User clicks on run button without entering code
    Then User should be on Same page

  @LinkedList42
  Scenario: Try Editor validation for Implement Linked List in Python Topic with no testcode
    Given User is in "Text Editor" page with run through Implement Linked List in Python page
    When User clicks on run button without entering code
    Then User should be on Same page

  @LinkedList43
  Scenario: Try Editor validation for Traversal Topic with no code
    Given User is in "Text Editor" page with run through Traversal page
    When User clicks on run button without entering code
    Then User should be on Same page

  @LinkedList44
  Scenario: Try Editor validation for Insertion Topic with no code
    Given User is in "Text Editor" page with run through Insertion page
    When User clicks on run button without entering code
    Then User should be on Same page

  
