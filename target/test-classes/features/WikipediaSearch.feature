@wikipedia
Feature: Wikipedia Search Functionality


  Scenario: Search Page Title Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    Then user clicks wiki search button
    And user sees "Steve Jobs" is in the wiki title

  Scenario: Search Functionality Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    Then user clicks wiki search button
    And User sees "Steve Jobs" is in the main header

  Scenario: Wikipedia Search Functionality Image Header Verification
    Given user is on Wikipedia home page
    When user types "Steve Jobs" in the wiki search box
    Then user clicks wiki search button
    And user sees "Steve Jobs" is in the image header

    @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality with Scenario Outline
    Given user is on Wikipedia home page
    When user types "<searchValue>" in the wiki search box
    Then user clicks wiki search button
    And user sees "<expectedTitle>" is in the wiki title
    And User sees "<expectedMainHeader>" is in the main header
    And user sees "<expectedImageHeader>" is in the image header

    @ceos
    Examples: search values we are going to be using in this scenario outlines
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Steve Jobs      | Steve Jobs      | Steve Jobs         | Steve Jobs          |
      | Mary Barra      | Mary Barra      | Mary Barra         | Mary Barra          |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer    | Rosalind Brewer     |
      | Sundar Pichai   | Sundar Pichai   | Sundar Pichai      | Sundar Pichai       |

    @scientists
    Examples:
      | searchValue     | expectedTitle   | expectedMainHeader | expectedImageHeader |
      | Marie Curie     | Marie Curie     | Marie Curie        | Marie Curie         |
      | Albert Einstein | Albert Einstein | Albert Einstein    | Albert Einstein     |


