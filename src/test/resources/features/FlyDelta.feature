Feature: Test the seat booking module

  @test
  Scenario: Seat booking
#    And user on home screen taps on tickMark

    Given user on home screen taps on continueAsGuest
    And user on bookFlight screen taps on oneWay
#    And user on bookFlight screen taps on from
#    And user on bookFlight screen types on enterCity value New York
#    And user on bookFlight screen select 1 from city
#    And user on bookFlight screen taps on to
#    And user on bookFlight screen types on enterCity value San Francisco
#    And user on bookFlight screen select 1 from city
#    And user on bookFlight screen taps on date
#    And user on bookFlight screen select 31 from calender
#
#    And user on bookFlight screen taps on applyDate
    And user on bookFlight screen taps on findFlight
    And user on bookFlight screen select 1st flight

    And user on summary screen scrolldown on reviewInfo value Review Passenger Info
    And user on summary screen taps on reviewInfo

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
    And user on info screen scroll till 2016
#    And user on info screen taps on 1980

    And user on info screen scrolldown on phone
    And user on info screen types on phone value 1234567891

    And user on info screen scrolldown on email
    And user on info screen types on email value aaa@gmail.com

    And user on info screen scrolldown on remail
    And user on info screen types on remail value aaa@gmail.com

    And user on info screen scrolldown on selectSeat
    And user on info screen types on selectSeat

