Feature: Notbuklar
  Background:
    And User click popup
    When  User hover notbuklar ve komputer texnikasi
    And   User clicks notbuklar

    Scenario: Check direction to notbuklar page
      Given  User is in "Notbuklar" page
      Then  User should see "Notbuklar" on the page


  Scenario Outline: Check "<Brend>" filters for notebook
   Given  User is in "Notbuklar" page
    And  User clicks "<Brend>" filters
    Then User should see "<Brend>" notebooks on the page
  Examples:
    | Brend |
    | Acer  |
    | Apple |
    | ASUS  |
    | DELL  |
    | HP    |


Scenario Outline:  Check  "<Emeliyyat sistemi>" filters for notebook
  Given User is in "Notbuklar" page
  And User clicks "<Emeliyyat sistemi>" emeliyyat sistemi filters
  And User click product items
  Then User should see "<Emeliyyat sistemi>" notebooks on the page table
  Examples:
    | Emeliyyat sistemi |
    | Chrome OS         |
    | FreeDos           |
    | MacOS             |
    | Windows           |
    | Windows 10       |

  Scenario Outline:  Check  "<Ekranin olcusu>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Ekranin olcusu>" ekranin olcusu filters
    And User click product items
    Then User should see "<Ekranin olcusu>" notebooks on the page table
    Examples:
      | Ekranin olcusu |
      | 13             |
      | 13.3           |
      | 13.4           |
      | 13.6           |
      | 14             |


  Scenario Outline:  Check  "<Prosessor tipi>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Prosessor tipi>"  prosessor tipi filters
    And User click product items
    Then User should see "<Prosessor tipi>" notebooks on the page table
  Examples:
    | Prosessor tipi |
    | Athlon         |
    | Celeron        |
    | Core i3        |
    | Core i5        |
    | Core i7        |


  Scenario Outline:  Check "<Videokart modeli>" filters for notebook
    Given User is in "Notbuklar" page
    And  User clicks "<Videokart modeli>" notbuklar videokart modeli filters
    And User click product items
    Then User should see "<Videokart modeli>" notebooks on the page table
Examples:
  | Videokart modeli    |
  | AMD Radeon          |
  | AMD Radeon 540X     |
  | AMD Radeon Graphics |
  | AMD Radeon Vega 7   |
  | Apple M1            |


  Scenario Outline:Check "<Operativ yaddas>" filters for notebook
    Given User is in "Notbuklar" page
    And  User clicks "<Operativ yaddas>" operativ yaddas notbuklar filters
    And  User click product items
    Then User should see "<Operativ yaddas>" notebooks on the page table
    Examples:
      | Operativ yaddas |
      | 4 GB            |
      | 8 GB            |
      | 8GB DDR4-SDRAM  |
      | 12 GB           |
      | 16 GB           |



  Scenario Outline: Check "<Yaddas novu>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Yaddas novu>" yaddas novu notbuklar filters
    And User click product items
    Then User should see "<Yaddas novu>" notebooks on the page table
Examples:
  | Yaddas novu  |
  | DDR4         |
  | DDR4 3200MHz |
  | DDR5         |
  | DDR5 4800MHz |
  | HDD          |

  Scenario Outline: Check "<Qurasdirilmis yaddas>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Qurasdirilmis yaddas>" qurasdirilmis yaddas notbuklar filters
    And User click product items
    Then User should see "<Qurasdirilmis yaddas>" notebooks on the page table
    Examples:
      | Qurasdirilmis yaddas |
      | 1 TB                 |
      | 1 TB HDD             |
      | 1 TB HDD+ 256 GB SSD |
      | 1 TB SSD             |
      | 1TB HDD+128GB SSD    |

  Scenario Outline: Check "<Nuvelerin sayi>" filters for notebook
      Given User is in "Notbuklar" page
      And User clicks "<Nuvelerin sayi>" nuvelerin sayi notbuklar filters
      And User click product items
      Then User should see "<Nuvelerin sayi>" notebooks on the page table
      Examples:
        | Nuvelerin sayi |
        | 2              |
        | 4              |
        | 6              |
        | 8              |
        | 10             |


  Scenario Outline: Check "<Ekran icazesi>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Ekran icazesi>" ekran icazesi notbuklar filters
    And User click product items
    Then User should see "<Ekran icazesi>" notebooks on the page table
    Examples:
      | Ekran icazesi      |
      | 2.5K (2560 x 1600) |
      | 2.8K(2880x1620)    |
      | 2K (2560x1600)     |
      | 3.2K (3200x2000)   |
      | 4K UHD (3840x2160) |

  Scenario Outline: Check "<Prosessor tezliyi>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Prosessor tezliyi>" prosessor tezliyi notbuklar filters
    And User click product items
    Then User should see "<Prosessor tezliyi>" notebooks on the page table
    Examples:
      | Prosessor tezliyi |
      | 0.9 - 4.6 GHz     |
      | 0.9 GHz - 4.4 GHz |
      | 1.0 GHz - 3.6 GHz |
      | 1.0 GHz - 3.6 GHz |
      | 1.1 GHz - 2.8 GHz |

  Scenario Outline: Check "<Ekran tipi>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Ekran tipi>" ekran tipi notbuklar filters
    And User click product items
    Then User should see "<Ekran tipi>" notebooks on the page table
    Examples:
      | Ekran tipi |
      | BEND GL    |
      | IPS        |
      | LED        |
      | OLED       |
      | Retina     |

  Scenario Outline: Check "<Reng>" filters for notebook
    Given User is in "Notbuklar" page
    And User clicks "<Reng>" reng notbuklar filters
    And User click product items
    Then User should see "<Reng>" notebooks on the page table
    Examples:
      | Reng       |
      | Alga Green |
      | Ağ        |
      | Bej        |
      | Black      |
      | black/blue |
@sale
Scenario: Check "Endirim" filters for notebook
  Given User is in "Notbuklar" page
  And User click "Endirim" category button
  Then User should see Endirim products on the page
@low
  Scenario: Check "Ucuzdan bahaya" filters for notebook
    Given User is in "Notbuklar" page
    And User click "Ucuzdan bahaya" category button
    Then User should see Ucuzdan bahaya products on the page
@high
  Scenario: Check "Bahadan ucuza" filters for notebook
    Given User is in "Notbuklar" page
    And User click "Bahadan ucuza" category button
    Then User should see Bahadan ucuza products on the page

Scenario Outline: Check filters on the Notbuklar page
  Given User is in "Notbuklar" page
   And User clicks "<Brend>" filters
   And User clicks "<Emeliyyat sistemi>" emeliyyat sistemi filters
   And User clicks "<Ekranin olcusu>" ekranin olcusu filters
   And User clicks "<Operativ yaddas>" operativ yaddas notbuklar filters
  Then  User should see notbuklar on the page
Examples:
  | Brend | Emeliyyat sistemi | Ekranin olcusu | Operativ yaddas |
  | Apple | MacOS             | 13.3           | 8 GB            |