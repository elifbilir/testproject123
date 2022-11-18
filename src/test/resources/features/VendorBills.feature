Feature:POS Manager should be able to create new Purchase-Vendor Bill

AC:
Verify that the user can create new  Vendor Bill
Verify that the user can switch Kanban-List view
Verify that the user can discard changes
Verify that the user can edit Vendor Bill
Verify that the user can delete Vendor Bill


  Background: User is logged in
      Given user is logged as POS Manager



@elif
  Scenario:user can create new  Vendor Bill
      When user clicks on Purchases button
      When user clicks on Vendor Bills button
      When user clicks on create button
      And user selects a vendor "<Vendor>"
      And user enters a vendor reference "<Vendor Reference>"
      And user selects a  bill date"<bill date>"
      And user selects a due date "<due date>"
      Then user clicks on save


  Scenario:user can not create a vendor bill
      When user clicks on create button
      And user clicks save button
      Then warning message is displayed



  Scenario:user can switch Kanban-List view
      When user clicks on "kanban" button
      Then vendor bills are displayed in "kanban" view



  Scenario:user can discard changes
      When user clicks on create button
      And user selects a "<Vendor>"
      And user clicks on discard button
      And confirmation message is displayed
      And user clicks on ok button
      Then user is back to Vendor Bills page



  Scenario:user can edit vendor bill
      When user clicks on create button
      And user selects a "<Vendor>"
      And user enters "<Vendor Reference>"
      And user enters an "<order>"
      And user selects a "<bill date>"
      And user selects a "<due date>"
      And user clicks save button
      And vendor bill is created and displayed on vendor bill page
      And user clicks the Edit button
      Then user can make changes on the bill


    Scenario:user can delete vendor bill
      When user clicks on create button
      And user selects a "<Vendor>"
      And user enters "<Vendor Reference>"
      And user enters an "<order>"
      And user selects a "<bill date>"
      And user selects a "<due date>"
      And user clicks save button
      And user click vendor bills button
      And user selects a vendor bill
      And action and print buttons are displayed
      And user clicks action button
      And user clicks on delete button
      And confirmation message is displayed
      And user clicks OK button
      Then selected vendor bill is deleted
















