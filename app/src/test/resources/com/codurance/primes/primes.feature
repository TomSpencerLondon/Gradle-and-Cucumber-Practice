Feature: Calculate prime factors of a number
  As a Math student,
  I want to calculate the prime factors of a number
  So that I can pass my test.

  Scenario Outline: Calculation of prime factors
    When I type <number>
    And I click calculate
    Then I get <result>
    Examples:
      | number | result |
      | 3      | 2      |
      | 4      | 2, 3   |
      | 6      | 2, 3, 5|