Feature: Add item to cart from shop and buy it.

  Scenario: User should add item to card and then procced to buy it.
    Given Open browser with test Store.
    When Login on account asadas@10minutemail.com Waldekn22.
    And Go to cloth section.
    When Add Hummingbird Printed Sweater with size M and add 5 pieces.
    And Process checkout.
    Then Take a screenshot of the order confirmation and the amount.
    And Close browser.