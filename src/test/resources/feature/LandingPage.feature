@LandingPage
Feature: Verifying DS Portal Application Navigation

User wants to learn data structures and algorithums to prepare for the interviews
User enters into this application for interview preparation - https://dsportalapp.herokuapp.com/


Background:
Given user is on dsportal home page
@LandingPageScenario1
  Scenario: For navigating to dsalgo dashBoard 
    When user click on "Get Started" button   
    Then user navigates to dsalgo dashBoard "https://dsportalapp.herokuapp.com/home" successfully
