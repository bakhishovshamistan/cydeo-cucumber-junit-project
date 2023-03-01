Feature: Cucumber Data Tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |

    #To beautify the pipes above
  #Windows: control + alt + L

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Shami        |
      | surname | Bakhishov    |
      | age     | 30           |
      | address | Boston       |
      | state   | MA           |
      | zipcode | 02132        |
      | phone   | 617-415-3958 |

  @dataTable

  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |