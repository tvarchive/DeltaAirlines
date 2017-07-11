package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FlightPage extends BasePage {


    AppiumDriver driver;

    public FlightPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "com.delta.mobile.android:id/predictive_city_text")
    private List<WebElement> placeList;

    @FindBy(id = "com.delta.mobile.android:id/calendar_tv")
    private List<WebElement> dateList;

    @FindBy(id = "com.delta.mobile.android:id/group_scroll_inner")
    private List<WebElement> selectFlight;

    @FindBy(id = "com.delta.mobile.android:id/compare_experiences_link")
    private WebElement compare;

    public void selectPlaceFromList() {
        selectByindex(placeList, 1);
    }

    public void selectDate() {
        selectByindex(dateList, 36);
    }

    public void selectFlight() {
        waitForElementToBeClickable(compare);
        selectByindex(selectFlight, 0);
    }

    public void scroll() {
        driver.swipe(520, 990, 520, 750, 1000);
    }

    @FindBy(className = "android.widget.ImageView")
    private List<WebElement> seats;

    private By noThanks = By.id("com.delta.mobile.android:id/seatmap_no_thanks_button");
    private By popup = By.id("com.delta.mobile.android:id/popup_content");
    private By seatKey = By.id("com.delta.mobile.android:id/seat_key_button");

    public void chooseSeat() {
        waitForElementToBeClickable(seatKey);
        int size = seats.size();
        int i = 30;
            inner:
            for (; i < size; i++) {
                seats.get(i).click();
                if (isElementPresent(noThanks)) {
                    driver.findElement(noThanks).click();
                }
                if (isElementPresent(popup)) {
                    System.out.println("=====Booked");
                    break inner;
                }
            }
    }

    @FindBy(xpath = "//android.widget.Button[@content-desc='Find Flights']")
    private WebElement button;

    By button1 = By.xpath("//android.widget.Button[@content-desc='Find Flights']");

    public void searchFlight() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementToBeClickable(button1);
        driver.findElement(button1).click();
    }

    /*public void chooseSeat(int noOfSeats, String popup, List seats) {
        waitForElementToBeClickable(seatKey);
        int i = 30;
        popupMessage = By.id(popup);
        seatsList = seats;
        for (int j = 0; j < noOfSeats; j++) {
            waitForElementToBeClickable(seatKey);
            int size = seats.size();
            inner:
            for (; i < size; i++) {
                seatsList.get(i).click();
                if (isElementPresent(noThanks)) {
                    driver.findElement(noThanks).click();
                }
                if (isElementPresent(popupMessage)) {
                    break inner;
                }
            }
        }
    }*/
}
