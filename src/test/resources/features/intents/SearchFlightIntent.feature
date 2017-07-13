Feature: Search Flight

  @Intent
  Scenario: Search One Way Flight
    Given user on bookFlight screen taps on oneWay
    And user on bookFlight screen taps on from
    And user on bookFlight screen types on enterCity value New York
    And user on bookFlight screen select 1 from city
    And user on bookFlight screen taps on to
    And user on bookFlight screen types on enterCity value San Francisco
    And user on bookFlight screen select 1 from city
    And user on bookFlight screen taps on date
    And user on bookFlight screen select 31 from calender
    And user on bookFlight screen taps on applyDate
    And user on bookFlight screen taps on passengers
    And user on bookFlight screen taps on 2passenger
    And user on bookFlight screen verifies more is Visible
    And user taps on findFlight
