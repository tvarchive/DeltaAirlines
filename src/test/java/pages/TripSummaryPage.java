package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by testvagrantserver on 11/07/17.
 */
public class TripSummaryPage extends BasePage {

    @FindBy(xpath = "//android.view.View[@content-desc='Trip Summary']")
    private WebElement tripSummary;


    public TripSummaryPage(AppiumDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }


    public void waitForTripSummaryToBeVisible() {
        waitForElementToBeVisible(tripSummary);
    }
}
