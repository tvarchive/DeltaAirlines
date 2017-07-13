Feature: Test the seat booking module


  @test
  Scenario: Seat booking
    Given Intent:Login
    And Intent:Book
    When  Intent:Search One Way Flight
    And user on bookFlight screen taps on 1stFlight
    And user on bookFlight screen verifies TripSummary is Visible
    And user on summary screen scrolldown on reviewInfo
    And user on summary screen taps on reviewInfo
    And user on info screen verifies addPassengerInfo is visible
    And user on info screen scrolldown on nextPassenger value Next Passenger
    And user on info screen taps on nextPassenger
    And Intent:Fill User Information for other passengers
    And user on info screen taps on selectSeat
    And user on seats screen chooses 2 seat
    Then user on seat screen taps on doneButton
