@CNTR-811
Feature: Centrilli Sales Functionality feature

  As a Sales Manager
  1. Verify that user can create a Customer
  2. Verify that user cannot create a Customer without typing name (empty name)
  3. Verify that user can cancel creating by clicking Discard button
  4. Verify that page title is changed to the new Customer name after user create the Customer
  5. Verify that “Contact created” message is displayed at the bottom of the page (after creating a new Customer).
  6. Verify that user can find the new created Customer under Customers list by using search box.
  7. Verify that user can change Customers display to Kanban / List
  8- Verify that all Customers number increased 1


  Background: For the scenarios in the feature file, user should be on Customers/ New page
    Given As a SalesManager user login with valid email and password
    Given user clicks on Sales button
    Given user clicks on Customers button
    Given user clicks on Create button
    Given user is on the Customers New page

  @CNTR-803
  Scenario Outline: User should be able to create a new customer
    When user types a "<name>"
    And user clicks on the save button
    Then user should be able to create a new customer with the "<name>"
    Examples:
    |name|
    |Akif|
   |Ayse|
   |Sule|

  @CNTR-804
  Scenario: User should not be able to create a new Customer without typing name
    When user click on save button to create a new customer without typing name
    Then user should see the warning message written The following fields are invalid

  @CNTR-805
  Scenario Outline: User should be able to cancel creating by clicking Discard button
    When user types a "<name>"
    Then user should cancel creating by clicking Discard button
    Examples:
      |name|
      |Akif|
      |Hakan|
      |Sule|

  @CNTR-806
  Scenario Outline: Verify that page title changes to the new Customer name after user creates one
    When user types a "<name>"
    And user clicks on the save button
    Then user should see that the page title should be changed as new customer's "<name>"
Examples:
    |name|
    |Akif|

  @CNTR-807
  Scenario Outline: After creating a new Customer Contact created message should be seen at the bottom of the page
    When user types a "<name>"
    And user clicks on the save button
    Then user should see that Contact created message is displayed at the bottom of the page
Examples:
    |name|
    |Suphi|

  @CNTR-808
  Scenario Outline: User should be able to find the new created Customer under Customers list by using search box.
    When user types a "<name>"
    And user clicks on the save button
    And user clicks on Customers button
    And user types the "<name>" into the search box
    Then user should see the new created Customer "<name>" under Customers list
    Examples:
      |name|
      |Yusuf|

  @CNTR-809
  Scenario: Verify that user can change Customers display from Kanban to List
    When user clicks on Customers button
    And user clicks List button
    Then verify that user can change Customers display from kanban to list

  @CNTR-810
  Scenario: Verify that all Customers number increases 1 after creating a new customer
    When user creates a customer
    Then user should see all Customers number increases one

