Feature: Centrilli Contact Feature verifications

  Acceptance Criterias:
  Login as a POSMANAGER
  1. Verify that the user can create new contact
  2. Verify that the user can switch Kanban-List view
  3. Verify that the user can discard changes
  4. Verify that the user can edit contact
  5. Verify that the user can delete contact

  Background: For the scenarios in the feature file, user is expected to be on Contacts page
    Given user is on the centrilli login page
    Given user logins as posmanager
    Given user clicks Contacts button
    Given user is on the Contacts page

  Scenario: the user can create new contact
    When user clicks on Create button
    Then user sees the title New Odoo
    And user types "Centrilli User" name input box
    Then user sees "Centrilli User" in the name input box
    And user types "Cybertek" company input box
    Then user sees "Cybertek" in the company input box
    And user types "newcontact@centrilli.com" email input box
    Then user sees "newcontact@centrilli.com" in the email input box
    And user clicks on Save button
    Then user should see the title "Cybertek, Centrilli User" Odoo

  Scenario: the user can switch Kanban-List view
    When user displays Contacts page in "Kanban" mode
    And user clicks on List button
    Then user should be able to display Contacts page in "List" mode

  Scenario: the user can discard changes
    When user clicks on Create button
    And user types "Centrilli User" name input box
    And user sees "Cybertek" in the company input box
    Then user clicks on Discard button
    And user should see the warning popup window
    And user clicks on ok button
    Then user should be on the Contacts page

  Scenario: the user can edit contact
    When user types "Centrilli User" to the search box and hits the enter key
    Then user should see the contact that named "Centrilli User"
    And user clicks on contact "Centrilli User"
    Then user should see the title "Cybertek, Centrilli User" Odoo
    And user clicks on Edit button
    Then user cleans the company input box
    And user types "Cydeo" company input box and hits the enter key
    And user sees the warning popup window
    And user clicks on ok button
    And user clicks on Save button
    Then user should see the title "Cydeo, Centrilli User" Odoo

  Scenario:
    When user types "Centrilli User" to the search box and hits the enter key
    Then user should see the contact that named "Centrilli User"
    And user clicks on contact "Centrilli User"
    And user clicks on Action button
    Then user sees Action dropdown menu
    And user clicks Delete on dropdown menu
    Then user sees confirmation popup window
    And user clicks on ok button
    Then user should NOT see  the contact "Centrilli User" on the contact page






