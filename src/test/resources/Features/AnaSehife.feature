Feature: AnaSehife


  Background:
  And User click popup


  Scenario Outline:Check direction to "<Elements>" web page
    Given User is in "Baku electronics" page
    When Click to "<Elements>" button
    Then User should be navigated to "<Elements>" wep page
    Examples:
      | Elements                        |
      | Böyük məişət texnikası          |
      | Kiçik məişət texnikası          |
      | Gözəllik və sağlamlıq           |
      | Oyun konsolları və aksessuarlar |
      | Mebel, tekstil və dekor         |
      | Qab-qacaq, tava-qazan           |

    Scenario: Check product details page
      Given User is in "Baku electronics" page
      When Click to any items
      Then User should see product details page


  Scenario: Check Smartfonlar slider
    Given User is in "Baku electronics" page
    When Click to slider button
    Then User should see smart phones on the page



  Scenario Outline: Check "<Yeni Xeberler>" functionality
    Given User is in "Baku electronics" page
    When Click to "<Yeni Xeberler>" buttons
    Then Users should see "<Yeni Xeberler>" on the page
    Examples:
      | Yeni Xeberler |
      | Xəbərlər      |
      | İcmallar      |



  Scenario: Check direction Musteri karti web page on the footer
    Given User is in "Baku electronics" page
    When Click to Musteri karti button
    Then User should be navigated to Musteri karti page


  Scenario: Check direction Sirket haqqinda web page on the footer
    Given User is in "Baku electronics" page
    When Click to Sirket haqqinda button
    Then User should be navigated to Sirket haqqinda page



  Scenario: Check direction Zemanet web page on the footer
    Given User is in "Baku electronics" page
    When Click to Zemanet button
    Then User should be navigated to Zemanet page



  Scenario: Check direction Arxayin al web page on the footer
    Given User is in "Baku electronics" page
    When Click to Arxayin al button
    Then User should be navigated to Arxayin al page


  Scenario Outline: Check direction "<SocialMedia>" web page on the footer
    Given User is in "Baku electronics" page
    When Clicks to "<SocialMedia>" button
    Then User should be navigated to "<SocialMedia>" page
    Examples:
      | SocialMedia |
      | facebook    |
      | instagram   |
      | youtube     |














