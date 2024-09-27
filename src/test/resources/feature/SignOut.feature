
Feature: Checking Sign Out

Background:
Given User is logged in DSAlgo Portal

Scenario: Validate Sign Out functionality
When User clicks on signout button
Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options