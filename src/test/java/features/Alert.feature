Feature: Alert Feature

  Background: The Login Page should be open
    Given browser is open and navigate to the Base URL


  Scenario: TC-104 Validate that alert function working as expected
    Given user navigate to the Practice page
    When user click on Try it
    Then Alert box is present
    Then User should be able to click Ok
    #When user navigate inside the iFrame
    #Then User should be able to click on practice page
    #Then User can click on alert inside the iFrame
