#Autor: Diana Patricia Gamba Alarcón

  @Stories
  Feature: Reto_aplicativo_StarSharp
    As a user, I want to schedule a meeting in the business unit previously created in the StarSharp application.
    @smokeTest
    Scenario: Schedule a meeting in the business unit previously created
      Given that Diana wants to schedule a meeting in the StarSharp application
      When she creates a business unit in the StarSharp application
      Then she can find the meeting created
