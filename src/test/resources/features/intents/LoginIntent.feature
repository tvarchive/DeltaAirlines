Feature: FlyDelta login

  @Intent
  Scenario: Login
    Given user on home screen taps on flyDeltaIntro
    And user on login screen types on userName value 9325224005
    And user on login screen types on password value ADMIN123admin
    And user on login screen scrolldown on loginBtn
    And user on login screen taps on loginBtn