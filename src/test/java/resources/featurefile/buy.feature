Feature: Search functionality
  As a user I want to check serch functionality on carguide site
@sanity @regression
  Scenario Outline: User should be able to search the buy car with model
   Given I am on homepage
    When I mouse hover on buy+sell tab
    And  I click on search cars tab
    Then I navigate to "New & Used Car Search - carsguide"
    And  I select make "<Any Make>"
    And  I select model "<Any Model>"
    And  I select location "<Any Location>"
    And  I select price "<Price>"
    And  I click on find my next car tab
    Then I should be able to see the "<result>"

    Examples:
      |Any Make       |Any Model     |Any Location       |Price       | result     |
      | BMW           |X Models      |NSW - Hunter          |$60,000      |15 BMW X Models for Sale under $60,000 in Hunter, NSW|
      |Land Rover     |Any Model     |QLD - Sunshine Coast  |$90,000      |19 Land Rovers for Sale under $90,000 in Sunshine Coast, QLD|
      | Mercedes-Benz | C-Class      | VIC                  | $70,000     | 120 Mercedes-Benz C-Class for Sale under $70,000 in VIC |
      | Hyundai       | Sonata       | NT                   | $70,000     | 1 Hyundai Sonata for Sale under $70,000 in              |
      | Audi          |Q5            | QLD - Brisbane       |$100,000     | 37 Audi Q5s for Sale under $100,000 in Brisbane, QLD    |
      |Jeep           |Compass       | WA - Perth           | $90,000     | 24 Jeep Compass for Sale under $90,000 in Perth, WA     |
@smoke @regression
  Scenario Outline: User should be able to search the cat with model
    Given I am on homepage
    When  I mouse hover on buy+sell tab
    And   I click on used link
    Then  I navigate to "Used Cars For Sale" text
    And   I select make "<Any Make>"
    And   I select model "<Any Model>"
    And   I select location "<Any Location>"
    And   I select price "<Price>"
    And   I click on find my next car tab
    Then  I should be able to see the "<result>"

    Examples:
      |Any Make             |Any Model          |Any Location       |Price       | result     |
      |Honda                |CR-V               |NSW - Sydney                    |$50,000             |68 Used Honda CR-Vs for Sale under $50,000 in Sydney, NSW|
      |Mazda                |Bravo              |NSW - New England               |$70,000             |1 Used Mazda Bravo for Sale under $70,000 in New England, NSW|
      |Kia                  |Sorento            |TAS - North                     |$80,000             |14 Used Kia Sorentos for Sale under $80,000 in North, TAS|
      |Tata                 |Xeon               |SA - Adelaide                   |$1000,000           |1 Used Tata Xenon for Sale under $100,000 in Adelaide, SA|
      |Skoda                |Octavias           |VIC - Northen                   |$45,000             |35 Used Skoda Octavias for Sale under $45,000 in Northern, VIC|
      |Mercedes             |GL-Class           |QLD - Gold Coast                |$90,000             |3 Used Mercedes-Benz GL-Class for Sale under $90,000 in Gold Coast, QLD|