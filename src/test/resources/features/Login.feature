Feature: Application login

#  Background:
#    Given validate the browser
#    When browser is triggered
#    Then check is browser is started

  @RegTest
  Scenario: Homepage default login
    Given User is on landing page
    When User login into application with "Bill" and password "12345"
    Then Homepage is displayed
    And Cards displayed are "true"

  @RegTest @SmokeTest
  Scenario: Homepage default login
    Given User is on landing page
    When User login into application with "Alan" and password "12345"
    Then Homepage is displayed
    And Cards displayed are "true"

  @MobileTest
  Scenario: Homepage default login
    Given User is on landing page
    When User sign up with following details
      | name      | code | email            | phone   |
      | merlin    | abas | merlin@asd.com   | 3123123 |
      | meliodas  | qwer | meliodas@asd.com | 3123125 |
    Then Homepage is displayed
    And Cards displayed are "false"

  @RegTest
  Scenario Outline: Homepage default login
    Given User is on landing page
    When User login in to application with <username> and password <password>
    Then Homepage is displayed
    And Cards displayed are "true"

    Examples:
      | username  | password  |
      | user1     | password1 |
      | user2     | password2 |
      | user3     | password3 |