

@Signout
Feature: Checking Sign Out

Background:
Given User has already Logged in DSAlgo portal

Scenario: Validate Sign Out functionality
Given User is logged in DSAlgo Portal
When User clicks on signout button
Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    
     