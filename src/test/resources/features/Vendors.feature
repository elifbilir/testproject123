Feature:Purchase / Vendors Feature

  Acceptance Criteria:
  1.Verify that the user can create Vendors
  2.Verify that the user can edit Vendors
  3.Verify that the user can delete Vendors
  4.Verify that the user can switch Kanban-List view
  5.Verify that user can discard changes
  6.Verify that user can move to the next records page by right-left buttons

    Background: For the scenarios in the feature file, user is expected to be on Purchase/Vendors page
     Given user click "Vendor create" button
     Given user logins as Posmanager
     Given user click Purchases module
     Given user click Vendors button

  @CNTR-815
     Scenario: user can create Vendors
      When user click create button
      And  user fill  name field
      Then user clicks save button

  @CNTR-816
     Scenario:user can edit Vendors
      When user click create button
      And user fill  name field
      And user clicks save button
      And user click Edit button
      Then user sees change title on page

  @CNTR-817
   Scenario: user can delete Vendors
     When user click create button
     And user fill  name field
     And user clicks save button
     And user click Action dropdown
     And user select Delete button
     And user should see Confirmation massage
     Then user click ok button

  @CNTR-818
   Scenario: user can switch Kanban-List view
     When user click Kanban button
     And user clicks List button on page
    Then Verify user can change Kanban List view

  @CNTR-819
  Scenario: user can discard changes
    When user click create button
    And user fill  name field
    And user click on Discard button
    And user should see the warning message
    And user click on Ok button
    Then Verify  user can discard changes

  @CNTR-820
    Scenario:user can move to the next records page by right-left buttons
    When user click on the right and left buttons
    Then Verify user can move to the next records page



















