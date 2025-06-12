Feature: Add item to cart
@positive
Scenario: Search for a valid product and add first item to cart
Given I launch the Amazon homepage
When I search for "wireless mouse"
And I click on the first product in results
And I add the item to the cart
Then the item should be successfully added to the cart
