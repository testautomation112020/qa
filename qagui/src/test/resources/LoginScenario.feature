@BDD
Feature: User login

  @login @wordpress @userpanel
  Scenario: Login
    Given User starts on main page
    When User logs to the user panel
    Then User can modify user profile


  @wordpress @userpanel @search
  Scenario: Login
    Given User starts on main page
    When User logs to the user panel
    And User checks search button
    When User clicks to search button
    Then User arrives to search panel