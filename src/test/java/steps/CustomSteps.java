package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.FlightPage;
import pages.TripSummaryPage;


public class CustomSteps extends BaseSteps {

    @And("^user on bookFlight screen select 1 from city$")
    public void userOnBookFlightScreenSelectFromCities() throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).selectPlaceFromList();
    }


    @And("^user on bookFlight screen select 31 from calender$")
    public void userOnBookFlightScreenSelectFromCalender() throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).selectDate();
    }

    @And("^user on bookFlight screen select 1st flight$")
    public void userOnBookFlightScreenSelectStFlight() throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).selectFlight();
    }

    @And("^user on summary screen scrollup till reviewInfo$")
    public void userOnSummaryScreenScrolldownTillReviewInfo() throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).scroll();

    }

    @And("^user on info screen scroll till 2016")
    public void userOnInfoScreenScrollTill() throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).scroll();
    }

    @And("^user on seats screen chooses (\\d+) seat$")
    public void userOnSeatsScreenChoosesSeat(int seat) throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).chooseSeat();
    }

    @And("^user taps on findFlight$")
    public void userTapsOnFindFlight() throws Throwable {
        new FlightPage(getDriverInstanceFor("user")).searchFlight();
    }

    @And("^user waits for tripsummary to be visible$")
    public void userWaitsForTripsummaryToBeVisible() throws Throwable {
        new TripSummaryPage(getDriverInstanceFor("user")).waitForTripSummaryToBeVisible();
    }
//    @And("^user on seats screen chooses (\\d+) (\\w+) from (\\w+)$")
//    public void userOnSeatsScreenChoosesSeat(int noOfSeats, String seat, List seats) throws Throwable {
//        new FlightPage(getDriverInstanceFor("user")).chooseSeat(2,seat,seats);
//    }
}
