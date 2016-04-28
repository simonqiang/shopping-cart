Feature: View product list for sale

  Scenario: Empty product catalogue
    Given There is no product in product catalogue
    When Customer view the product catalogue
    Then Display message "There is no product available"

  Scenario: With product available
    Given There are products in product catalogue
    When Customer view the product catalogue
    Then Display all products in product catalogue
