
Feature: Verify and Validate the Queue feature
  
   Scenario: Navigation from dsportal/LinkedList  page to the dsAlgo/Queue page
    Given User is in dsportal  page 
     When User select the Queue from the drop down menu  
    Then The user should be redirected to the Queue page
    
   Scenario: Check  user is in Implementation of Queue in Python page
   Given  User is in Queue home page
   When  The user click "Implementation of Queue in Python" Link
   Then  The user redirected to Implementation of Queue in Python" page

    Scenario: Check the Try Here button
     Given  User is in Implementation of Queue in Python
     When  The user click "Try Here" button
     Then  The user should be redirected to the  PageEditor page

   Scenario: Check TryEditor with valid code
      Given The user is in Python Editor page
     When   The user writes the valid Python code
     Then  The user click "Run" button and is able to see the output in the console

    Scenario: Check TryEditor with invalid code
      Given The user is in Python Editor page
      When   The user writes the invalid Python code
      Then  The user click "Run" button and will see the alert message
           
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page
    
    Scenario: Check user returns to the Implementation of Queue in Python page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Implementation of Queue in Python page
       
    Scenario: Check  user is in Implementation using collections.deque page
       Given  User is in Implementation of Queue in Python page
       When  The user click "Implementation using collections.deque" Link
       Then  The user redirected to Implementation using collections.deque page

    Scenario: Check the Try Here button
      Given  User is in Implementation using collections.deque
      When  The user click "Try Here" button
      Then  The user should be redirected to the  PageEditor page

    Scenario: Check TryEditor with valid code
      Given The user is in Python Editor page
      When   The user writes the valid Python code
      Then  The user click "Run" button and is able to see the output in the console

    Scenario: Check TryEditor with invalid code
      Given The user is in Python Editor page
      When   The user writes the invalid Python code
      Then  The user click "Run" button and will see the alert message
           
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page
    
    Scenario: Check user returns to the Implementation using collections.deque page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Implementation using collections.deque page
       
    Scenario: Check  user is in Implementation using array page
      Given  User is in Implementation using collections.deque page
      When  The user click "Implementation using array" Link
      Then  The user redirected to Implementation using array page

    Scenario: Check the Try Here button
      Given  User is in Implementation using array page
      When  The user click "Try Here" button
      Then  The user should be redirected to the  PageEditor page

    Scenario: Check TryEditor with valid code
      Given The user is in Python Editor page
     When   The user writes the valid Python code
     Then  The user click "Run" button and is able to see the output in the console

    Scenario: Check TryEditor with invalid code
      Given The user is in Python Editor page
      When   The user writes the invalid Python code
      Then  The user click "Run" button and will see the alert message
           
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page
    
    Scenario: Check user returns to the Implementation using array page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Implementation using array page

    Scenario: Check  user is in Queue operations page
       Given  User is in Implementation using array page
       When  The user click "Queue operations" Link
       Then  The user redirected to Queue operations page

     Scenario: Check the Try Here button
       Given  User is in Queue operations page
       When  The user click "Try Here" button
       Then  The user should be redirected to the  PageEditor page

    Scenario: Check TryEditor with valid code
      Given The user is in Python Editor page
     When   The user writes the valid Python code
     Then  The user click "Run" button and is able to see the output in the console

    Scenario: Check TryEditor with invalid code
      Given The user is in Python Editor page
      When   The user writes the invalid Python code
      Then  The user click "Run" button and will see the alert message
           
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page
    
    Scenario: Check user returns to the Queue operations page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Queue operations page
       
   Scenario: Check  user is in "Practice Questions" page
       Given  User is in Queue operations page
       When  The user click "Practice Questions" Link
       Then  The user redirected to "Practice Questions"  page
