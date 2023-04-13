
Feature: Verify that User can able to 
				add multiple mobiles in to cart

  Scenario: Verify that User Can able to add cart Vivo mobile
    Given User can open "edge" browser
    Then User can open application url "https://www.amazon.in/"
    And  Verify that user landed in right application
    When User enter the Moblie "vivo" in search text box
    Then User click search icon
    And User able to select mobile in search list "Vivo Y16 (Drizzling Gold, 4GB RAM, 64GB Storage)"
    When User able to navigate in searched mobile page "Vivo Y16 (Drizzling Gold, 4GB RAM, 64GB Storage)"
    Then User selected quantity "2"
    And User able to click Add to Cart