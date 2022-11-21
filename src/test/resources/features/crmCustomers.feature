@CNTR-852
Feature: Centrilli CRM Customer Creation Feature

  User Story: As a POS Manager I should be able to create CUSTOMER

  AC:
  Verify that the user can create new CUSTOMER
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit CUSTOMER
  Verify that the user can delete CUSTOMER



  Background: For the scenarios in the feature file, user should be on CRM Customers page
    Given user logins as Posmanager
    Given user clicks on CRM button
    Given user clicks on CRM Customers button


  @CNTR-846
  Scenario Outline: User should be able to create a new customer
    When user clicks on Create button in Customer page
    And user types a "<name>"
    And user clicks on the save button
    Then user should be able to create a new customer with the "<name>"
    Examples:
    |name|
    |Akif|


  @CNTR-847
  Scenario: User should not be able to create a new Customer without typing name
    When user clicks on Create button in Customer page
    And user click on save button to create a new customer without typing name
    Then user should see the warning message written The following fields are invalid

  @CNTR-848
  Scenario: User should be able to switch Kanban List view
    When user clicks List button
    Then verify that user can change Customers display from kanban to list

  @CNTR-849
  Scenario Outline: User should be able to discard changes
    When user clicks on Create button in Customer page
    And user types a "<name>"
    And user should discard changes by clicking Discard button
    Then user should see the warning message written changes will be discarded
    Examples:
      |name|
      |Akif|

  @CNTR-850
  Scenario Outline: User should be able to edit customer
    When user clicks on Create button in Customer page
    When user types a "<name>"
    And user clicks on the save button
    And user clicks on the edit button
    And user types an "<email>"
    And user clicks on the save button
    Then user should see the changes
  Examples:
    |name    | email        |
    |Ali Tunc| ali@gmail.com|

  @CNTR-851
  Scenario Outline: User should be able to delete customer
    When user clicks on Create button in Customer page
    And user creates a new "<customer>"
    And user sees Customer number increases one
    And user deletes the "<customer>"
    Then Customers number decreases one after the "<customer>" is deleted
    Examples:
    |customer|
    |Ali Tunc|











