#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: signout button
Background: 
    Given User has already Logged in 
      | username      | password     |
      | Scrutinizers  | Numpysdet176 |
    
  @tag1
  Scenario: checking sign out button is succesfully logged out
    Given The user is on the "DSPortal" Home Page of url "https://dsportalapp.herokuapp.com/home"
    
    When User clicks on sign out button
    
    Then User shoud be directed "DSPortal" Home page with Logged out successfully message.

  