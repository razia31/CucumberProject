Feature: Login Feature

  Background: The Login Page should be open
    Given browser is open and navigate to the Base URL


    Scenario Outline: TC-101 valid User should be able to login to the application
      Given user navigate to the login page
      When user enter valid <username>
      And user enter a valid <password>
      And user click on Login button
      #Then Validate that user is navigated to the Home page.

  Examples:
      | username  | password   |
      | "razia"   | "razia31"  |
      | "fariha"  | "fariha31" |
      | "TestUser"| "Test@123" |




