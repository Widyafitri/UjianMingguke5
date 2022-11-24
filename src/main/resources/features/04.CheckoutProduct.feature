Feature: Checkout Product

  Scenario: User checkout product
    When User click button checkout
    And User input firstname lastname
    And User input company name just optional
    And User choose country
    And User input address one
    And User input address two just optional
    And User input city
    And User choose province
    And User input postcode
    And User input phone number
    And User enter notes just optional
    And User click checkbox have read and agree
    And User click button place order
    Then Showing message Thank you. Your order has been received
