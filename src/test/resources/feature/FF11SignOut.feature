@Signout @seq11
Feature: Checking Sign Out

  Background: 
    Given User has already Logged in

  @Signout01
  Scenario: Validate Sign Out functionality
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options

  @Signout02
  Scenario: Validate Sign Out functionality in Array Page
    Given  User is on the "Arrays in Python" Home Page of URL "https://dsportalapp.herokuapp.com/array/arrays-in-python/"
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options

    @Signout03
  Scenario: Validate Sign Out functionality in Linked List Page
    Given  User is in Linked List page
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    
    @Signout04
  Scenario: Validate Sign Out functionality in Stack Page
    Given  User is in Stack page
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    @Signout05
  Scenario: Validate Sign Out functionality in Queue Page
    Given  User is in Queue page
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    @Signout06
  Scenario: Validate Sign Out functionality in Tree Page
    Given  User is in Tree page
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    @Signout07
  Scenario: Validate Sign Out functionality in Graph Page
    Given  User is in Graph page
    When User clicks on signout button
    Then The User shoud see the Logged out successfully message in the home page  with Register and Sign in Options
    