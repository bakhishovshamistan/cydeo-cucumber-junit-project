package com.cydeo.step_definitions;


/*
    In this class we will be able to create "pre" and "post" condition for ALL the SCENARIOS and even STEPS.
 */

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    // import the @Before coming from io.cucumber.java
    @Before(order = 1)
    public void setUpMethod() {
        System.out.println("---> @Before: running before each scenario");
    }

   // @Before (value = "@login", order = 2)
    public void login_scenario_before() {
        System.out.println("---> @Before: running before each scenario");
    }

    @After
    public void tearDownMethod(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        System.out.println("---> @After: running after each scenario");
        BrowserUtils.sleep(2);
        Driver.closeDriver();
    }

    //@BeforeStep
    public void setupStep() {
        System.out.println("---> @BeforeStep: running before each step");
    }

    //@AfterStep
    public void tearDownStep() {
        System.out.println("---> @AfterStep: running after each step");
    }

}
