
Feature: DS Portal Application Navigation

User wants to learn data structures and algorithums to prepare for the interviews
User enters into this application for interview preparation - https://dsportalapp.herokuapp.com/

Background:
Given user is on dsportal home page

  Scenario: For navigating to dsalgo dashBoard 
    Given user is on prepare for the interviews page
    When user click on "Get Started" button   
    Then user navigates to dsalgo dashBoard "https://dsportalapp.herokuapp.com/home" successfully
