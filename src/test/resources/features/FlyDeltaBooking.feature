Feature: Seat Booking module


  @SeatBooking
  Scenario: Seat booking
    Given user on home screen taps on flyDeltaIntro
    And user on login screen types on userName value 9325224005
    And user on login screen types on password value ADMIN123admin
    And user on login screen scrolldown on loginBtn
    And user on login screen taps on loginBtn
    Given user on home screen taps on openSideMenu
    And user on home screen taps on book
    And user on bookFlight screen verifies oneWay is visible
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
    And user on bookFlight screen taps on 1stFlight
#    And user waits for tripsummary to be visible
    And user on bookFlight screen verifies TripSummary is visible
    And user on summary screen scrolldown on reviewInfo
    And user on summary screen taps on reviewInfo
    And user on info screen verifies addPassengerInfo is visible
    And user on info screen scrolldown on nextPassenger value Next Passenger
    And user on info screen taps on nextPassenger
    And user on info screen verifies addPassengerInfo is visible
    And user on info screen types on fname value aaa
    And user on info screen types on lname value aaa
    And user on info screen scrolldown on gender
    And user on info screen taps on gender
    And user on info screen taps on male
    And user on info screen taps on month
    And user on info screen taps on jan
    And user on info screen taps on day
    And user on info screen taps on 1
    And user on info screen scrolldown on year
    And user on info screen taps on year
    And user on info screen taps on 2016

    And user on info screen scrolldown on bookFlight value Select Seats & Trip Extras
    And user on info screen taps on bookFlight
    And user on info screen taps on selectSeat
    And user on seats screen chooses 3 seat
    Then user on seat screen taps on doneButton
