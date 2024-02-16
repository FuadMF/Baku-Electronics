Feature: SmartfonlarMobilTelefonlar

Background:
  And User click popup
  When Move to Telefonlar,plansetler ve qadcetler element
  And Click to Smartfonlar,mobil telefonlar button


  Scenario Outline: Check "<Brend>" checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Brend>" checkbox
    Then User should see "<Brend>" phones on the page
    Examples:
      | Brend                 |
      | Apple                 |
      | ENERGIZER             |
      | Honor                 |
      | HUAWEI                |
      | INFINIX               |
      | Apple&ENERGIZER       |
      | Apple&ENERGIZER&Honor |
      | HUAWEI&INFINIX        |


  Scenario Outline: Check "<Emeliyyat>" sistemi checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Emeliyyat>" sistemi checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Emeliyyat           | Text       |
      | Android             | Android    |
      | Android, MIUI       | Android    |
      | Android 10          | Android 10 |
      | Android 10, MIUI 11 | Android 10 |
      | Android 11          | Android 11 |



  Scenario Outline: Check "<Ekran>" olcusu  checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Ekran>" olcusu checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Ekran    | Text     |
      | 1.8      | 1.8      |
      | 1.77     | 1.77     |
      | 1.77 TFT | 1.77 TFT |
      | 2.4      | 2.4      |
      | 2.8      | 2.8      |



Scenario Outline: Check "<Prosessor>" tipi checkbox
  Given User is in "Smartfonlar,mobil telefonlar web" page
  When Click to "<Prosessor>" tipi checkbox
  And Click to any item
  Then User should see "<Text>" about of the phones details
  Examples:
    | Prosessor                | Text                     |
    | Apple A13 Bionic (7 nm+) | Apple A13 Bionic (7 nm+) |
    | Apple A14 Bionic (5 nm)  | Apple A14 Bionic (5 nm)  |
    | Apple A15 Bionic (5 nm)  | Apple A15 Bionic (5 nm)  |
    | Apple A16 Bionic (4 nm)  | Apple A16 Bionic (4 nm)  |
    | Apple A17 Pro (3 nm)     | Apple A17 Pro (3 nm)     |


  Scenario Outline: Check "<Operativ>" yaddas checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Operativ>" yaddas checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Operativ | Text |
      | 2 GB     | 2 GB |
      | 2GB      | 2GB  |
      | 3 GB     | 3 GB |
      | 4 GB     | 4 GB |
      | 4 MB     | 4 MB |


  Scenario Outline: Check "<Qurasdirilmis>" yaddas checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Qurasdirilmis>" yaddass checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Qurasdirilmis | Text  |
      | 1 TB          | 1 TB  |
      | 4 MB          | 4 MB  |
      | 4MB           | 4MB   |
      | 16 MB         | 16 MB |
      | 16mb          | 16mb  |



  Scenario Outline: Check "<Nuvelerin>" sayi checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Nuvelerin>" sayi checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Nuvelerin | Text |
      | 2         | 2    |
      | 4         | 4    |
      | 6         | 6    |
      | 8         | 8    |
      | yox       | yox  |



  Scenario Outline: Check "<Esas>" kamera checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Esas>" kamera checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Esas        | Text        |
      | 0.1mpx      | 0.1mpx      |
      | 0.3MP       | 0.3MP       |
      | 1.3MP + 2MP | 1.3MP + 2MP |
      | 2 MP        | 2 MP        |
      | 8MP         | 8MP         |




  Scenario Outline: Check "<Kamera>" frontal checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Kamera>" frontal checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Kamera      | Text        |
      | 0.3MP       | 0.3MP       |
      | 5 MP        | 5 MP        |
      | 5 MP, f/2.2 | 5 MP, f/2.2 |
      | 5MP         | 5MP         |
      | 8 MP        | 8 MP        |



  Scenario Outline: Check "<Ekran>" icazesi checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Ekran>" icazesi checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Ekran     | Text      |
      | 120 х 160 | 120 х 160 |
      | 128 x 160 | 128 x 160 |
      | 160 х 120 | 160 х 120 |
      | 160x120   | 160x120   |
      | 240x320   | 240x320   |



  Scenario Outline: Check "<Prosessor>" tezliyi checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Prosessor>" tezliyi checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Prosessor               | Text                    |
      | (1x3.36 GHz Cortex-X3 & | (1x3.36 GHz Cortex-X3 & |
      | (2x1.8 GHz Cortex-A75 & | (2x1.8 GHz Cortex-A75 & |
      | (2x2.2 GHz Cortex-A76 & | (2x2.2 GHz Cortex-A76 & |
      | 1.6 GHz                 | 1.6 GHz                 |
      | 1.8 GHz                 | 1.8 GHz                 |



  Scenario Outline: Check "<Ekran>" tipi checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Ekran>" tipii checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Ekran             | Text              |
      | AMOLED            | AMOLED            |
      | Dynamic AMOLED 2X | Dynamic AMOLED 2X |
      | FHD+ AMOLED       | FHD+ AMOLED       |
      | FHD+ TFT          | FHD+ TFT          |



  Scenario Outline: Check "<Reng>" checkbox
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click to "<Reng>" tip checkbox
    And Click to any item
    Then User should see "<Text>" about of the phones details
    Examples:
      | Reng      | Text      |
      | Ağ        | Ağ        |
      | Bej       | Bej       |
      | Boz       | Boz       |
      | Bronz     | Bronz     |
      | Bənövşəyi | Bənövşəyi |



Scenario: Check Endirim button
  Given User is in "Smartfonlar,mobil telefonlar web" page
  When Click to Endirim button
  Then User Should see Endirim items on the page



Scenario: Check Ucuzdan bahaya button
  Given User is in "Smartfonlar,mobil telefonlar web" page
  When Click Ucuzdan bahaya button
  Then Items should be listed ucuzdan bahaya


  Scenario: Check Bahadan ucuza button
    Given User is in "Smartfonlar,mobil telefonlar web" page
    When Click Bahadan ucuza button
    Then Items should be listed bahadan ucuza
