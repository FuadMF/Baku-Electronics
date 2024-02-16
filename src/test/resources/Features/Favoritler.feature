Feature: Favoritler
  Background:
    And User click popup

  Scenario: Check direction to favoritler page
    Given User is in "Baku electronics" page
    When Click to favoritler sebeti button
    Then User should be navigated to favoritler page


  Scenario: Check basket number with adding some elements
    Given User is in "Baku electronics" page
    When Click to favoritler button for four elements
    Then favoritler sebeti should be matched with added elements


  Scenario: Check basket number with adding and removing some elements
    Given User is in "Baku electronics" page
    When Click to favoritler button for four elements
    And  Click to favoritler sebeti button
    And  Click favoritler button for two of them
    Then favoritler sebeti should be decreased


  Scenario: Check basket number with adding element
    Given User is in "Baku electronics" page
    When Click to favoritler button for four elements
    And  Click to favoritler sebeti button
    Then User should see that item on the favoritler sebeti page

  Scenario: Chech basket items when back to homepage
    Given User is in "Baku electronics" page
    When  Click to favoritler button for four elements
    And   Click to favoritler sebeti button
    And   Click to home page logo
    Then  favoritler sebeti should be matched with added elements

  Scenario: Check deleting item from the favoritler sebeti
    Given User is in "Baku electronics" page
    When Click to favoritler button for four elements
    And Click to favoritler sebeti button
    And Click favoritler button for four of them
    Then Item should be deleted from the favoritler sebeti