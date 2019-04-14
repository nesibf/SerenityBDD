@TestMatrixValues
Feature: Test Matrix Values

  Scenario Outline: Looking up TEST site for changing values in matrix
    Given the user is on TEST home page
    When the user starts the game with '<values>'
    Then the user verify values are changing

    Examples:
      | values | points |
      | 00000  | 0      |
      | 11100  | 60     |
      | 11110  | 80     |
      | 11111  | 100    |
      | 22200  | 120    |
      | 22220  | 160    |
      | 22222  | 200    |
      | 33300  | 180    |
      | 33330  | 240    |
      | 33333  | 300    |
      | 44400  | 240    |
      | 44440  | 320    |
      | 44444  | 400    |
      | 55500  | 300    |
      | 55550  | 400    |
      | 55555  | 500    |
