Feature: Magazalar
  Background:
    And User click popup

  Scenario: Check Magazalar functionality
    Given User is in "Magazalar web" page
   When Click Magazalar button
   Then User should be navigated to the Magazalar page

  Scenario: Check Magazalar Bakı functionality
    Given User is in "Magazalar web" page
    When Click Magazalar button
    Then User should see Branches  list in Baku
    


