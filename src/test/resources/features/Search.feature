Feature: Search and place order for Vegetables

  @SeleniumTest
  Scenario: Search for items and validate the results
    Given User is on Greencart landing page
    When User searched for cucumber vegetable
    Then "cucumber" results are displayed

  @SeleniumTest
  Scenario Outline: Search for items and validate the results
    Given User is on Greencart landing page
    When User searched for <Name> vegetable
    And Added items to cart
    And User proceed to checkout page for purchase
    Then verify selected <Name> items are displayed in check out page

    Examples:
    | Name     |
    | Brinjal  |
    | Beetroot |