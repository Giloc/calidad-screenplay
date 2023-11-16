#Author:Trio_Calavera
#Leng:en

  Feature: Add products to car in Amazon
    As a user of the Amazon website, I want to search for products to add them to the shopping cart

  Scenario: Search for a product on the Amazon website's search bar
    Given that I am on the main page of Amazon
    When  I type the name of a product
    Then I can see and select related products in the results

  Scenario: View product details
    Given that I have searched for a product
    When I select one of the results
    Then I can view the product specifications

  Scenario: Add product to the shopping cart
    Given that I have opened a product
    When I add it to the shopping cart
    Then the number of products in the cart increases

  Scenario: Search and add a product to the shopping cart
    Given that I am on the main page of Amazon
    When I type the name of a product
    And I select one of the results
    And I add it to the shopping cart
    Then the number of products in the cart increases