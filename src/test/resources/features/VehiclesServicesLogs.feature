@CNTR-797
Feature: Centrilli Fleet/Vehicles/Vehicles Services Logs Function verifications

  Acceptance Criterias:
  Login as a POSMANAGER
  1. Verify that user can create a Vehicle Service Logs
  2. Verify that user cannot create a Vehicle Service Logs without selecting vehicle
  3. Verify that user can cancel creating by clicking Discard button
  4. Verify that page title is changed to the new Service Logs value after user create the Service Logs
  5. Verify that “Attachment” and Action buttons are displayed at the top of the page (after creating a new Service Logs).
  6. Verify that user can find the new created Service Logs value under Service Logs list by using search box.
  7. Verify that user can change Service Logs display to Kanban / List / Graph


  Background: For the scenarios in the feature file, user is expected to be on Vehicle Service Logs page
    Given user is on the centrilli login page
    Given user logins as posmanager
    Given user clicks Fleet button
    Given user clicks Vehicle Service Logs button
    Given user is on the Vehicle Service Logs page

  @CNTR-738
  Scenario: user can create a vehicle service log
    When user clicks on Create button
    And user selects a vehicle
    And user selects a service type
    And user clicks on Save button
    Then user sees Edit button on the page

  @CNTR-791
  Scenario: user cannot create a Vehicle Service Logs without selecting a vehicle
    When user clicks on Create button
    And user clicks on Save button
    Then user sees The following fields are invalid message

  @CNTR-792
  Scenario: user can cancel creating a Vehicle Service Log by clicking Discard button
    When user clicks on Create button
    And user clicks on Discard button
    Then user is on the Vehicle Service Logs page

  @CNTR-793
  Scenario: page title is changed to the new Service Logs value after user create the Service Logs
    When user clicks on Create button
    And user selects a vehicle
    And user selects a service type
    And user clicks on Save button
    Then user sees "Audi" in page title

  @CNTR-794
  Scenario: “Attachment” and "Action" buttons are displayed at the top of the page (after creating a new Service Logs)
    When user clicks on Create button
    And user selects a vehicle
    And user selects a service type
    And user types "inv-02" invoice reference input box
    And user clicks on Save button
    Then user sees Attachment button at the top of the page
    Then user sees Action button at the top of the page

  @CNTR-795
  Scenario: user can find the new created Service Logs value under Service Logs list by using search box
    When user types "Audi/A1" to the search box and hits the enter key
    Then user sees the new created Service Logs value "inv-02" at the end of the Service Logs list

  @CNTR-796
  Scenario: user can change Service Logs display to Kanban / List / Graph
    When user clicks on Kanban button
    Then user displays Vehicles Services Logs page on "kanban" mode
    When user clicks on Graph button
    Then user displays Vehicles Services Logs page on "graph" mode
    When user clicks on List button
    Then user displays Vehicles Services Logs page on "list" mode