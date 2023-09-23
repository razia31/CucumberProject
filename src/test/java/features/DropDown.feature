Feature: Validate DropDown functionality


Background: Launching App
Given browser is open and navigate to the Base URL


Scenario: TC-101 DropDown functionality should work as expected
Given user navigate to Practice page
When user see the Select an Option
Then user can select Option one
Then user can select Option two
Then User can select Option three