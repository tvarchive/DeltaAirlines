package steps;

import com.testvagrant.stepdefs.steps.BaseSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.WebElement;
import pages.FlightPage;

import java.util.List;


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
}
