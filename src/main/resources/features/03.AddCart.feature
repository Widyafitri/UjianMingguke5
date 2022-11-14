Feature: Add Cart product

  Scenario: User add cart product one
    When User click product dress item
    And User choose dress color
    And User choose dress size
    And User click button add cart on dress product
    And User click icon cart for dress view
    Then Showing dress product after add cart

  Scenario: User add cart product two
    When User click product tshirt item
    And User choose tshirt color
    And User choose tshirt size
    And User click button add cart on tshirt product
    And User click icon cart for tshirt view
    Then Showing tshirt product after add cart