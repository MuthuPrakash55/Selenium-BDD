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
Feature: verify that user can able to fill the form


  Scenario: Verify that user can able to fill the register form
    Given user open "chrome" browser
    When user open the application url "https://demo.automationtesting.in/Register.html"
		Then verify that user is navigate to right application
		And verify that user can able to write the first name"vijay" and last name "kumar" in the name field
		And verify that user can to fill the address in the address text box field
  	Then verify that user can able to fill the email "123@gmail.com" in email text box field
  	Then verify that user can able to fill the phone number "1234567891" in phone box field
  	Then verify that user can able to click the radio button of gender 
  	Then verify that user can able to select the check box button of hobbie  	
  	Then verify that user can able to select the  skill "Java" from the dropdown
  	Then verify that user can able to select the country India from the dropdown
  	Then verify that user can able to select the year"1992" and month of "February" and day of "10" from dropdown
  	And verify that user can able write the password "12345" in the password text box field
  	#And verify that user can able to rewrite the password "12345" in the confirm password text box field
  	When user click the submit icon button
  	#Then verify that the user  entered register form is submitted