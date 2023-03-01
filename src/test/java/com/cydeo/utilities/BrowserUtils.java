package com.cydeo.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {



    /*
    This method will accept int(in seconds)
    and execute Thread.sleep method for given duration
    Arg: int second
     */


    public static void sleep(int second) {
        second*=1000;

        try {
            Thread.sleep(second);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(String expectedInUrl, String expectedInTitle) {

        //Return and store all window handles in a Set
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String each : allWindowHandles) {
            Driver.getDriver().switchTo().window(each);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedInUrl)) {
                break;
            }
        }

        //5. Assert: Title contains given Title
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(expectedInTitle));


    }


    public static void verifyTitle(String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(),expectedTitle);
    }

    public static void verifyTitleContains(String expectedInTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedInTitle));
    }



    public static void waitForInvisibilityOf(WebElement target) {

          /*
   This method accepts WebElement target,
   and waits for that WebElement not to be displayed on the page
    */

        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.invisibilityOf(target));


    }



    public static void waitForTitleContains(String title) {

        /*
    This method accepts String title,
    and waits for that Title to contain given String value.
     */

        //Create the object of 'WebDriverWait' class, and set up the constructor args
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        //use the 'wait' object with the proper syntax to create explicit wait conditions.
        wait.until(ExpectedConditions.titleContains(title));

    }

    public static List<String> dropdownOptions_as_String(WebElement dropdownElement){

        Select month = new Select(dropdownElement);
        List<WebElement> actualMonth_as_WEBELEMENT = month.getOptions();

        List<String> actualMonth_as_STRING = new ArrayList<>();

        for (WebElement each : actualMonth_as_WEBELEMENT) {
            actualMonth_as_STRING.add(each.getText());
        }

        return actualMonth_as_STRING;

    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue) {

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)) {
                each.click();
            }
        }

    }

}
