
@tag
Feature: Verify and Validate the Stack page
  
  @tag1
  Scenario: Navigation from dsportal home page to the Stack page
    Given User is in dsportal home page
    When User select the Stack from the drop down menu 
    Then The user should be redirected to the Stack page
    
   @tag1
  Scenario: Check  user is in Operations in Stack page
    Given User is in Stack page
    When The user click " Operations in Stack" Link
    Then The user should be redirected to  Operations in Stack page
   
    Scenario:  Check the Try Here button
    Given  User is in Operations in Stack page
    When The user click "Try Here" button
    Then The user should be redirected to the  PageEditor page
      
     Scenario:  Check TryEditor with valid code
      Given The user is in Python Editor page
      When  The user writes the valid Python code
      Then The user click "Run" button and is able to see the output in the console
   
    Scenario: Check TryEditor with invalid code
     Given  The user is in Python Editor page
     When The user writes the invalid Python code
     Then The user click "Run" button and will see the alert message
    
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page  
       
     Scenario: Check user returns to the  Operations in Stack page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the  Operations in Stack page  

 Scenario: Check  user is in Implementation page
    Given User is in Operations in Stack page
    When The user click "Implementation" Link
    Then The user should be redirected to Implementation page
   
    Scenario:  Check the Try Here button
    Given  User is in Operations in Implementation page
    When The user click "Try Here" button
    Then The user should be redirected to the  PageEditor page
      
     Scenario:  Check TryEditor with valid code
      Given The user is in Python Editor page
      When  The user writes the valid Python code
      Then The user click "Run" button and is able to see the output in the console
   
    Scenario: Check TryEditor with invalid code
     Given  The user is in Python Editor page
     When The user writes the invalid Python code
     Then The user click "Run" button and will see the alert message
    
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page  
       
     Scenario: Check user returns to the  Implementation page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the  Implementation page

    Scenario: Check  user is in Applications page
      Given User is in Implementation page
      When The user click "Applications" Link
      Then The user should be redirected to Applications page
   
    Scenario:  Check the Try Here button
    Given  User is in Applications page
    When The user click "Try Here" button
    Then The user should be redirected to the  PageEditor page
      
     Scenario:  Check TryEditor with valid code
      Given The user is in Python Editor page
      When  The user writes the valid Python code
      Then The user click "Run" button and is able to see the output in the console
   
    Scenario: Check TryEditor with invalid code
     Given  The user is in Python Editor page
     When The user writes the invalid Python code
     Then The user click "Run" button and will see the alert message
    
    Scenario: User accept the Alert message
       Given The user is in Alert Popup window
       When   The user click the "OK" button
       Then  The user stays on the TryEditor page  
       
     Scenario: Check user returns to the  Applications page
       Given The user is in TryEditor page
       When   The user clicks the Back button on the browser
       Then  The user returns to the  Applications page  
       
     Scenario: Check  user is in "Practice Questions" page
       Given  User is in Applications page
       When  The user click "Practice Questions" Link
       Then  The user redirected to "Practice Questions"  page
       



