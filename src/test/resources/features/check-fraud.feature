Feature: Check fraudulent operations
  As bank client
  I want to check if one transfer operation is fraudulent or not to transfer money from one source account to another
  the transfer has to fullfil the next conditions:
  1. Open date of source account...
  2. Check average transfer amount...
  3. Operation date time...

  Scenario: Making operation with invalid opening date - operation invalid
    * def kt = Java.type('com.travelport.demokarate.KarateSteps')
    Given kt.theOpeningDateOfTheSourceAccountIsToday()
    And url 'http://localhost:8080'
    And path '/operations/fraudulent'
    And header Content-Type = 'application/json'
    And request '{ "sourceAccount": {"number": "7777-7777-7777-7777"}, "targetAccount": {"number": "9999-9999-9999-9999"}, "amount": 12 } '
    When method post
    Then status 200
    And match response.isFraudulent == true
