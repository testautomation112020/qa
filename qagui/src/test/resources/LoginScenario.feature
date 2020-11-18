@BDD
Feature: User login

  @login @wordpress @userpanel
  Scenario: Login
    Given User starts on main page
    When User logs to the user panel
    Then User can modify user profile


  @wordpress @userpanel
  Scenario: Login
    Given User starts on main page
    When User logs to the user panel
    Then User can modify user profile