
Feature: POS Manager should be able to create new Point Of Sale Configuration

  Acceptance Criteria:
  Verify that the user can create new  Point Of Sale
  Verify that the user can switch Kanban-List view
  Verify that the user can discard changes
  Verify that the user can edit  Point Of Sale
  Verify user cannot create new Point of Sale without Point of Sale name
  Verify user cannot create new Point of Sale without Operation type

  Background: User is logged in
    Given user is logged in the application

  @wip_guvanch
  Scenario Outline: user can create new  Point Of Sale
    When user clicks the Point of Sale module
    And user clicks the List button
    And user clicks the Create button
    And user enters the "<name>" in the name box
    And user chooses the Operation Type
    Then user clicks the Save button
    Examples: Details below
      | name       |
      | Lightspeed |


  Scenario: user can switch Kanban-List view
    When user clicks the Point of Sale module
    And user clicks the List button
    Then user clicks the Kanban button


  Scenario: user can discard changes
    When user clicks the Point of Sale module
    And user clicks the List button
    And user clicks the Create button
    And user enters the "random" in the name box
    And user clicks the Discard button
    And user clicks OK to the Warning popup message
    Then user is on the Point of Sale module


  Scenario Outline: user can edit  Point Of Sale
    When user clicks the Point of Sale module
    And user clicks the List button
    And user searches for "<name>" in the search box
    And user clicks the "<expected name>"
    And user clicks the Edit button
    And user re-enters the "<new name>" name
    Then user clicks the Save button
    Examples: Details below
      | name       | expected name | new name |
      | Lightspeed | Lightspeed    | Shopify  |

  Scenario: user cannot create new Point of Sale without Point of Sale name
    When user clicks the Point of Sale module
    And user clicks the List button
    And user clicks the Create button
    And user chooses the Operation Type
    And user clicks the Save button
    Then user sees the The following fields are invalid error message


  Scenario: user cannot create new Point of Sale without Operation type
    When user clicks the Point of Sale module
    And user clicks the List button
    And user clicks the Create button
    And user enters the "random" in the name box
    And user clicks the Save button
    Then user sees the The following fields are invalid error message


