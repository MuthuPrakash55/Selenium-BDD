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
Feature: Verify that User can able to 
				add multiple mobiles in to cart

 Scenario Outline: Verify that User Can able to add cart Vivo,Oppo mobile
    Given User can open "edge" browser
    Then User can open application url "https://www.amazon.in/"
    And  Verify that user landed in right application
    When User enter the Moblie <mobile> in search text box
    Then User click search icon
    And User able to select mobile in search list <item>
    When User able to navigate in searched mobile page <item>
    Then User selected quantity <quantity>
    And User able to click Add to Cart
    
    
    Examples:
				|mobile|item|quantity|
    		|"Vivo"|"Vivo Y16 (Drizzling Gold, 4GB RAM, 64GB Storage)"|"2"|
    		|"Oppo"|"Oppo F21s Pro (Dawnlight Gold, 8GB RAM, 128 Storage)"|"1"|
    
    
    
    