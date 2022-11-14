
Feature: Create vehicle costs


  Scenario: create a vehicle cost
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user selects a vehicle
    And user selects a type
    And user selects a date
    And user enters total price
    And user enters cost description
    And user clicks on save button
    Then title is changed to "Vehicle" and new table is created



  Scenario: can not create a vehicle cost
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user clicks on save button
    Then user sees These fields are invalid error message



  Scenario: cancel creating a vehicle cost by clicking discard
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user selects a vehicle
    And user clicks on discard button
    And user sees warning message
    And user clicks on ok button
    Then user is back to vehicle costs page



  Scenario: cancel creating a vehicle cost by clicking discard
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user clicks on discard button
    And user is back to vehicle costs page
    Then user sees the title is vehicle costs



  Scenario: title is changed from new to "vehicle"
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user selects a vehicle
    And user selects a type
    And user selects a date
    And user enters total price
    And user enters cost description
    And user clicks on save button
    Then title is changed to "Audi/A1/" - Odoo



  Scenario: User should see Attachment(s) and Action buttons
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user selects a vehicle
    And user selects a type
    And user selects a date
    And user enters total price
    And user enters cost description
    And user clicks on save button
    Then user sees Attachments and Action buttons



  Scenario: User should see new created vehicle on the vehicle costs list
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user clicks create button
    And user sees the title New Odoo
    And user selects a vehicle
    And user selects a type
    And user selects a date
    And user enters total price
    And user enters cost description
    And user clicks on save button
    And user is back to vehicle costs page
    And user writes the created vehicle type in the search box and search
    Then user sees the new created vehicle on the list


  Scenario: User sees the vehicle costs page in List and Kanban and Graph mode
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    When user clicks on kanban button
    Then user sees the vehicles costs as "kanban"
    When user clicks on graph button
    Then user sees the vehicles costs as "graph"
    When user clicks on list button
    Then user sees the vehicles costs as "list"


@wip
  Scenario: create a vehicle cost
    Given : user is already logged in and on main page
    When user clicks on more button
    And user clicks fleet button
    And user clicks Vehicle Costs button
    And user checks the number of vehicles
    And user clicks create button
    And user sees the title New Odoo
    And user selects a vehicle
    And user selects a type
    And user selects a date
    And user enters total price
    And user enters cost description
    And user clicks on save button
    And user clicks on vehicle costs button
    And number of the vehicle costs list increased "1"
    Then user sees the number of the vehicles increased "1"



