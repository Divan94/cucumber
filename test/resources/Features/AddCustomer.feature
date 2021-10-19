#Author: Divakar.email@your.domain.com

Feature: Add Customer flow validation

  Scenario: Add Customer
  
    Given User launches demo telecom application
    And User click on add customer button	
    When User enter all the fields
    And User click on submit button
    Then User verify customer id is generated
    
