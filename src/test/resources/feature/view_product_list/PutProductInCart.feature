Feature: Add product to Cart

  Scenario: Add product when cart is empty
    Given The cart is empty
    When Customer add Notebook product
    Then Notebook product quantity will increase by 1

  Scenario: Add product when cart has other product
    Given The cart is not empty
    When Customer add Notebook product
    Then Notebook product quantity will increase by 1

  Scenario: Add product when cart has an existing same product
    Given The cart has Notebook product with quantity 1
    When Customer add Notebook product
    Then Notebook product quantity will increase by 2

  Scenario: Add product when Product is out of stock
    Given The Mouse product is out of stock
    When Customer add Mouse product
    Then Display message "The Chosen Product is out of stock"