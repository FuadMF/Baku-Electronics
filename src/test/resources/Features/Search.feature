Feature: Search
  Background:
    And User click popup
    When User clicks search input
  Scenario Outline: Check search on the page
      Given User is in "Baku electronics" page
      And   User hover "<Text>" category
      And   User  random click product items
      Then  User should see  product "<expected>" details on the page
      Examples:
        | Text                              | expected                    |
        | Smartfonlar, Mobil Telefonlar     | smartfon                      |
        | Kondisionerlər                    | kondisioner                   |
        | Oyun Konsolları                   | playstation&xbox&oyun konsolu |
        | Kombi                             | kombi                         |
        | Televizorlar                      | televizor                     |
        | Iphone                            | apple                         |
        | Samsung                           | samsung                       |
        | Redmi                             | redmi                         |
        | Elektrik Çaydanlar Və Termopotlar | electrik çaydanlar&termopot   |


  Scenario Outline:Check search on the page
    Given  User is in "Baku electronics" page
    And    User inputs "<Brend>"
    And    User clicks enter
    Then   User should see "<Brend>" products on the page
    Examples:
      | Brend                       |
      | Samsung Galaxy a            |
      | Apple                       |
      | kabel usb                   |
      | Dyson                       |
      | Redmi                       |
      | tozsoran                    |
      | utu                         |
      | qabyuyan                    |
      | bosch                       |
      | soyuducu                    |
      | Konstruktor Öz şəhərini tik |
      | playStation                 |
      | termopot                    |



  Scenario Outline:Check search on the page unsuccesful
    Given  User is in "Baku electronics" page
    And    User inputs "<input>"
    And    User clicks enter
    Then   User shouldn't see "<error>" products on the page
    Examples:
      | input        | error                                   |
      |              | - Axtarış sorğunuz boşdur               |
      | %            | % - Axtarış sorğunuz çox qısadır        |
      | magazalar    | magazalar - Heç bir nəticə tapılmadı    |
      | kampaniyalar | kampaniyalar - Heç bir nəticə tapılmadı |
      | endirim      | endirim - Heç bir nəticə tapılmadı      |
      | zemanet      | zemanet - Heç bir nəticə tapılmadı      |
      | $            | $ - Axtarış sorğunuz çox qısadır        |


