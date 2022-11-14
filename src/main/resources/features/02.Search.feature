Feature: Search Product

  Scenario: User searching for product not found
    When User click button search for product not found
    And User typing sock product search
    And User click enter for product not found
    Then Showing message no product were found

  Scenario: User search product item
    When User click button search
    And User typing dress product search
    And User click enter
    Then Showing dress product
