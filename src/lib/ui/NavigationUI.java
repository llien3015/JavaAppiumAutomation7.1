package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

 abstract public class NavigationUI extends MainPageObject
{

    protected static String
          MY_LISTS_LINK,
          MY_LISTS_LINK2;



    public NavigationUI(AppiumDriver driver)
    {
        super(driver);
    }

    public void clickMyLists()
    {
        this.waitForElementAndClick(
                MY_LISTS_LINK,
                "Cannot find navigation button to My Lists",
                5
        );
    }
    public void clickMyListsX()
    {
        this.waitForElementAndClick(
                MY_LISTS_LINK2,
                "Cannot find X to My Lists",
                15
        );
    }

}
