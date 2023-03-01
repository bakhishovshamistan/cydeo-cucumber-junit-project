Feature: Cucumber Data Tables implementation practices

  @dataTablePets
  Scenario: List of pets I like
    Then user should see below pets list
      | cat      |
      | dog      |
      | parrot   |
      | lion     |
      | tiger    |
      | dinosaur |

    #To beautify the pipes above
  #Windows: control + alt + L
  #MAC: command + option + L