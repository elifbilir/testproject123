@Salo

Feature: Pos manager should be able to create Inventory Transfers and Stock operations

  Acceptance Criteria:
 Create a stock Operation

1.  Verify that the user can create new Stock operation
2.  Verify that the user can switch Kanban-List view
3.  Verify that the user can discard changes
4.  Verify that the user can edit Stock operation
5.  Verify that the user can delete Stock operation



 Background: For the scenarios in the feature file, user is expected to be on Stock Operations page
   Given user is on the centrilli login page
   Given user logins as posmanager
   Given user clicks on Inventory button
   Given user have to click transfers button
#-------------------------------------------------------------------------- ok
     Scenario Outline: user can create new Stock Operation
       When user clicks on the Create button
       And user types a new "<partner>"
       And user clicks on "<partner>" on dropdown menu
       And user clicks on Additional information button
       And user clicks to operation type button
       Then user chooses first option
       Then user clicks on Save button
       Examples:
       |partner|
       |Salih123|

#----------------------------------------------------------- ok
         Scenario: user can switch to kanban list
         When user is on the Transfers page
         Then user clicks on Kanban button
#-------------------------------------------------------------- ok
  Scenario Outline: user can Discard changes the Stock Operations
    When user clicks on the Create button
    And user types a new "<partner>"
    And user clicks on "<partner>" on dropdown menu
    And user clicks to the Discard button
    And user clicks on ok button
    Then user should land on Stock operation page

    Examples:
      |partner|
      |Salih123|
#----------------------------------------------------------------- ok
         Scenario: user can Edit the Stock Operations
           When user is on the Transfers page
           And user clicks to reference field
           And user chooses first name on the list
           And user clicks to edit button
           And user clicks on Additional information button
           And user clicks to Priority field
           And user chooses the Not Urgent option
           And user clicks on Save button
           Then user verified that stock operations has been edited

#----------------------------------------------------------------ok
         Scenario: user can delete the Stock Operation
           When user is on the Transfers page
           And user clicks to reference field
           And user chooses a draft Stock Operation
           And  user clicks to Action button
           And user clicks on Delete button
           And user clicks on ok button
           Then user should see Stock Operation has been deleted

#---------------------------------------------------------------------ok







