Feature:Purchase / Vendors Feature

  Acceptance Criteria:
  1.Verify that the user can create Vendors
  2.Verify that the user can edit Vendors
  3.Verify that the user can delete Vendors
  4.Verify that the user can switch Kanban-List view
  5.Verify that user can discard changes
  6.Verify that user can move to the next records page by right-left buttons

  Background: For the scenarios in the feature file, user is expected to be on Purchase/Vendors page
    Given user is on the centrilli login page
    Given user logins as posmanager
    Given user click Purchases module
    Given user click Vendors button

   @CTNR-815-Done
   Scenario:user can create Vendors
     When user click Vendors create button
     And  user fill  name field
     Then user click Vendors save button

   @CTNR-816-Done
   Scenario:user can edit Vendors
     When user click Vendors create button
     And user fill  name field
     And user click Vendors save button
     And user should see name title on page
     And user click Edit button
     Then user sees change title on page

  @CTNR-817-Done
  Scenario: user can delete Vendors
     When user click Vendors create button
     And user fill  name field
     And user click Vendors save button
     And user click Action dropdown
     And user select Delete button
     And user should see Confirmation massage
     Then user click ok button

  @CTNR-818-Done
  Scenario: user can switch Kanban-List view
    When user click Kanban button.
    And user click List button on page
    Then  user should display Kanban List view

  @CNTR-819-Done
  Scenario: user can discard changes
    When user click Vendors create button
    And user fill  name field
    And user click on Discard button
    And user should see the warning message
    And user click on Ok button
    Then user sees discard changes message

  @CNTR-820-Done
   Scenario:user can move to the next records page by right-left buttons
    When user click on the right
    And user click on the left button
    Then user able to move to the next page by button






















