
Feature: Verify and Validate the LinkedList page
  
  Scenario: Navigation from dsportal home page to the Linked List page
    Given User is in dsportal home page 
    When User select the LiskedList from the drop down menu  
    Then The user should be redirected to the LinkedList page
   
  Scenario: Check user is in Introduction page
        Given User is in LinkedList page
        When The user click "Introduction" Link
        Then  The user redirected to "Introduction" page
        
  Scenario: Check Try Here button
     Given The user is in LinkedList page
     When  The user click "Try Here" button
     Then  The user should be directed to the TryEditor page

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
    
    Scenario: Check user returns to the Introduction page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Introduction page
             
    Scenario: Check user is in Creating Linked LIst page 
       Given User is in LinkedList/Introduction page
       When The user click "Creating Linked LIst" Link 
       Then  The user redirected to "Creating Linked LIst" page
    
    Scenario: Check Try Here button
       Given User is in LinkedList/Creating Linked LIst page
       When The user click "Try Here" button
       Then  The user redirected to the TryEditor page
             
    Scenario:  Check TryEditor with valid code
        Given The user is in Python Editor page
        When   The user writes the valid Python code
        Then  The user click "Run" button  and is able to see the output in console
    
     Scenario:  Check TryEditor with invalid code    
        Given The user is in Python Editor page   
        When The user write invalid Python code
        Then  The user click "Run" button and will see the Alert message
     
      Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays in the LinkedList/Creating Linked LIst page
       
      Scenario: Check user returns to the LinkedList/Creating Linked LIst page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the LinkedList/Creating Linked LIst page
      
      Scenario: Check  user is in Types of Linked List page
       Given  User is in LinkedList/Creating Linked LIst page
       When  The user click "Types of Linked List"" Link
       Then  The user redirected to "Types of Linked List" page
      
       Scenario: Check Try Here button
       Given User is in Types of Linked List page
       When  The user click "Try Here" button
       Then  The user should be redirected to the PageEditor page
       
      Scenario: Check TryEditor with valid code
       Given The user is in Python Editor page
       When   The user writes the valid Python code
       Then  click "Run" button and is able to see the output of the code in  the console.

       Scenario: Check TryEditor with invalid code    
        Given The user is in Python Editor page
        When The user write invalid Python code
        Then  The user click "Run" button and we will an alert message 

       Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user accept the alert message
       
       Scenario: Check user returns to the Types of Linked List page page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Types of Linked List page page
       
      Scenario: Check  user is in Implement Linked List in Python page
       Given  User is in Types of Linked List page
       When  The user click "Implement Linked List in Python" Link
       Then  The user redirected to "Implement Linked List in Python" page
      
       Scenario: Check Try Here button
       Given User is in Types of Linked List page
       When  The user click "Try Here" button
       Then  The user should be redirected to the PageEditor page
       
      Scenario: Check TryEditor with valid code
       Given The user is in Python Editor page
       When   The user writes the valid Python code
       Then  click "Run" button and is able to see the output of the code in  the console.

       Scenario: Check TryEditor with invalid code    
        Given The user is in Python Editor page
        When The user write invalid Python code
        Then  The user click "Run" button and we will an alert message 

       Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user accept the alert message
       
       Scenario: Check user returns to the Types of Linked List page page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the Implement Linked List in Python page
       
       Scenario: Check  user is in "Transversal" page
       Given  User is in Implement Linked List in Python page
       When  The user click "Transversal" Link
       Then  The user redirected to "Transversal"  page
      
       Scenario: Check Try Here button
       Given User is in "Transversal"  page
       When  The user click "Try Here" button
       Then  The user should be redirected to the PageEditor page
       
      Scenario: Check TryEditor with valid code
       Given The user is in Python Editor page
       When   The user writes the valid Python code
       Then  click "Run" button and is able to see the output of the code in  the console.

       Scenario: Check TryEditor with invalid code    
        Given The user is in Python Editor page
        When The user write invalid Python code
        Then  The user click "Run" button and we will an alert message 

       Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user accept the alert message
       
       Scenario: Check user returns to the "Transversal"  page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the "Transversal"  page
       
         Scenario: Check  user is in "Insertion" page
       Given  User is in Transversal page
       When  The user click "Insertion" Link
       Then  The user redirected to "Insertion"  page
      
       Scenario: Check Try Here button
       Given User is in "Insertion"  page
       When  The user click "Try Here" button
       Then  The user should be redirected to the PageEditor page
       
      Scenario: Check TryEditor with valid code
       Given The user is in Python Editor page
       When   The user writes the valid Python code
       Then  click "Run" button and is able to see the output of the code in  the console.

       Scenario: Check TryEditor with invalid code    
        Given The user is in Python Editor page
        When The user write invalid Python code
        Then  The user click "Run" button and we will an alert message 

       Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user accept the alert message
       
       Scenario: Check user returns to the "Insertion"  page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the "Insertion"  page
       
       Scenario: Check  user is in "Deletion" page
       Given  User is in Insertion page
       When  The user click "Deletion" Link
       Then  The user redirected to "Deletion"  page
      
       Scenario: Check Try Here button
       Given User is in "Deletion"  page
       When  The user click "Try Here" button
       Then  The user should be redirected to the PageEditor page
       
      Scenario: Check TryEditor with valid code
       Given The user is in Python Editor page
       When   The user writes the valid Python code
       Then  click "Run" button and is able to see the output of the code in  the console.

       Scenario: Check TryEditor with invalid code    
        Given The user is in Python Editor page
        When The user write invalid Python code
        Then  The user click "Run" button and we will an alert message 

       Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user accept the alert message
       
       Scenario: Check user returns to the "Deletion"  page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the "Deletion"  page
       
       Scenario: Check  user is in "Practice Questions" page
       Given  User is in Deletion page
       When  The user click "Practice Questions" Link
       Then  The user redirected to "Practice Questions"  page
       
       