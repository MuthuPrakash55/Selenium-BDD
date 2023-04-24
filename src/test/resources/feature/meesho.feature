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
Feature: verify that user can able to products to add to bag

	Scenario: verify that user is able to products in add to bag
	 	When user can open "chrome" browser
	 	Then user enter app url "https://www.meesho.com/"
		And verify that user landed in right application page
		Then verify that user can able  to move to element "Beauty & Health"
		And verify that user can able to click the "Feminine Hygiene"
		Then verify that user landed in right page "Feminine Hygiene - Buy Feminine Hygiene Online Starting at Just ₹83 | Meesho"
		And verify that user able to click












