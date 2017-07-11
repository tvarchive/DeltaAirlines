Feature: User Info

  @Intent
  Scenario: Fill User Information for other passengers
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