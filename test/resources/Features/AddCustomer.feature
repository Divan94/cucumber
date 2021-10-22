 #Author: Divakar.email@your.domain.com
 
Feature: Add Customer flow validation

Background:
 Given User launches demo telecom application
    And User click on add customer button
@run
   Scenario: Add Customer
   
    When User enter all the fields
    And User click on submit button
    Then User verify customer id is generated
    
   Scenario: Add Customer validation by using 1 dim list
   
   When User enter all the fields by one dim list concept
    | Divan | Rajendran | divakar.r0610@gmail.com | Potheri | 7200808733 |
   And User click on submit button
   Then User verify customer id is generated
   
  
   Scenario: Add Customer validation by using 1 dim map
   
   When User enter all the fields by one dim map concept
    | fname   | Divakar                 |
   | lname   | R                       |
   | mail    | divakar.r0610@gmail.com |
   | address | guduvancheri            |
   | phono   |              8682844259 |
   And User click on submit button
   Then User verify customer id is generated
  Scenario Outline: 
    
    When User enter all the fields "<fname>","<lname>","<mail>","<addres>","<phono>"
    And User click on submit button
    Then User verify customer id is generated

    Examples: 
      | fname   | lname | mail              | address       | phono      |
      | Divan   | R     | divakar@gmail.com | potheri       | 8682844259 |
      | Prem    | G     | prem@gmail.com    | tambaram      | 9952043537 |
      | Sathish | N     | sathish@gmail.com | perungalathur | 7200808733 |
