#Author: Divakar.email@your.domain.com
Feature: Add Customer flow validation

  Scenario: Add Customer

  # Given User launches demo telecom application
  # And User click on add customer button
  # When User enter all the fields
  # And User click on submit button
  # Then User verify customer id is generated
  
 Scenario: Add Customer validation by using 1 dim list
  #Given User launches demo telecom application
  #And User click on add customer button
  #When User enter all the fields by one dim list concept
  # | Divan | Rajendran | divakar.r0610@gmail.com | Potheri | 7200808733 |
  #And User click on submit button
  #Then User verify customer id is generated
  
  
  Scenario: Add Customer validation by using 1 dim map
    Given User launches demo telecom application
    And User click on add customer button
    When User enter all the fields by one dim map concept
      | fname   | Divakar                 |
      | lname   | R                       |
      | mail    | divakar.r0610@gmail.com |
      | address | guduvancheri            |
      | phono   |              8682844259 |
    And User click on submit button
    Then User verify customer id is generated
