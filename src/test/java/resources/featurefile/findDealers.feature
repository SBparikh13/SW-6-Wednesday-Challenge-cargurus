Feature: Find the dealers and verify
  as a user I want to find dealers and verify their names
  @sanity @regression
  Scenario: User should be able to find dealers and verify  dealers are in the list
    Given I am on homepage
    When  I mouse hover on buy+sell tab
    And I click on find a dealer
    Then I navigate to "Find a Car Dealership Near You" on dealer page
    And I should see the dealers names as table
   # Then I verify "dealers name" as table
      | dealersName |
      | 3 Point Motors Epping |
      | 4WD Specialist Group |
      | 5 Star Auto |
      | A & M Car Sales Pty Ltd |
      | A1 MOTORS COMPANY |
      | ANDREA MOTORI SERVICE |
      | Oxford Motors|
