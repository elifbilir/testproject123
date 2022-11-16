Feature: Centrilli app Vehicle Model feature

  

  Background: For this scenarios in the feature file , user is expected to be on Vehicle Model page
    Given user is on the centrilli login page
    Given user logins as posmanager
    Given user clicks Fleet button
    Given user clicks Vehicle Model button
  
  Scenario: user can create a vehicle model
    When user click on create button
    And  user fill a model name field
    And  user select a make
    Then click on the save


  Scenario: user cannot create a Vehicle Model selecting vehicle
    When user clicks Vehicle Model button button
    And  user click on the create button
    And  user click save button
    Then user should see error message

  Scenario: verify that the Attachment and Action button are displayed at the top of the page
    When user click on the create button
    And  user fill in a model name field
    And  user fill in a make field
    And  user click on the save button
    Then user should see Attachment button at the top of the page
    Then user should see Action button at the top of the page



  Scenario: user can find the new created Vehicle Model value list by using search box
    And user fill "ABCD" to the search box and hit the enter key
    Then user should see the new created Vehicle Model value


  Scenario: Verify that the user has changed the Vehicle Model page number with the arrow
    When user enter Make button
    And  user click on the right and left arrow
    Then user should see changed page number

   @Wip
  Scenario: create a number of Vehicle Models increased one
     When user create Vehicle Model number
   Then user should see number of Vehicle Models increased one











