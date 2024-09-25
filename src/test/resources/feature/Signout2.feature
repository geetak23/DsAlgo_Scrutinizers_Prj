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
@Signout
Feature: Checking Sign Out

Background:
Given User has already Logged in DSAlgo portal

Scenario: Validate Sign Out functionality
Given User is logged in DSAlgo Portal
When User clicks on signout button
Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    
     