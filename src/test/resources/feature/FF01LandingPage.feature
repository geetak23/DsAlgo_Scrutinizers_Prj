@LandingFF @seq1
Feature: DS Portal Application Navigation

#User wants to learn data structures and algorithums to prepare for the interviews
#User enters into this application for interview preparation - https://dsportalapp.herokuapp.com/

Background:
  Given user is on dsportal landingPage
  	
@LandingFF_navigating_to_dashboard
Scenario: For navigating to dsalgo dashBoard
	 When user click on "Get Started" button  		  
	 Then user navigates to dsalgo dashBoard "https://dsportalapp.herokuapp.com/home" successfully and page title should be "NumpyNinja"
	  