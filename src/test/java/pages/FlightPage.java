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
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "com.delta.mobile.android:id/predictive_city_text")
    private List<WebElement> placeList;

    @FindBy(id = "com.delta.mobile.android:id/calendar_tv")
    private List<WebElement> dateList;

    @FindBy(id = "com.delta.mobile.android:id/group_scroll_inner")
    private List<WebElement> selectFlight;

    @FindBy(id = "com.delta.mobile.android:id/compare_experiences_link")
    private WebElement compare;

    public void selectPlaceFromList(){
        selectByindex(placeList,1);
    }

    public void selectDate(){
        selectByindex(dateList,36);
    }

    public void selectFlight(){
        waitForElementToBeClickable(compare);
        selectByindex(selectFlight,0);
    }

    public void scroll(){
        driver.swipe(520,990,520,750,1000);
    }


}
