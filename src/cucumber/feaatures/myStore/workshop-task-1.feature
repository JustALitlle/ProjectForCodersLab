Feature: Add new Address to myStore

  Scenario: user should add new address to account
    Given open browser with test Store
    When login on account asadas@10minutemail.com Waldekn22
    And create new address
    When fill out the form of new address with Hejo, wroclawska, poznan, 60-129, 1190841
    Then new address should be added
    And close the browser

  Scenario Outline: user should add new address to account
    Given open browser with test Store
    When login on account asadas@10minutemail.com Waldekn22
    And create new address
    When fill out the form of new address with <alias>, <address>, <city>, <zipcode>, <phone>
    Then new address should be added
    And close the browser
    Examples:
      | alias  | address   | city    | zipcode | phone      |
      | Hejov2 | poznaksna | wroclaw | 50-429  | 3278612873 |



