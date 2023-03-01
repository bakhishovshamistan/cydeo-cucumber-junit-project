package com.cydeo.step_definitions;

import com.cydeo.pages.WikiResultPage;
import com.cydeo.pages.WikipediaSearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Wikipedia_StepDefinitions {

    WikipediaSearchPage wikipediaSearchPage = new WikipediaSearchPage();


    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("user types {string} in the wiki search box")
    public void userTypesInTheWikiSearchBox(String searchValue) {
        wikipediaSearchPage.searchBox.sendKeys(searchValue);
    }

    @Then("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
        wikipediaSearchPage.searchButton.click();
    }

    @And("user sees {string} is in the wiki title")
    public void userSeesIsInTheWikiTitle(String expectedInTitle) {

        BrowserUtils.verifyTitleContains(expectedInTitle);

    }

    WikiResultPage wikiResultPage = new WikiResultPage();
    @And("User sees {string} is in the main header")
    public void userSeesIsInTheMainHeader(String expectedInMainHeader) {

        String actualHeaderText = wikiResultPage.mainHeader.getText();

        Assert.assertEquals(actualHeaderText,expectedInMainHeader);

    }

    @And("user sees {string} is in the image header")
    public void userSeesIsInTheImageHeader(String expectedInImageHeader) {
        Assert.assertEquals(wikiResultPage.imageHeader.getText(),expectedInImageHeader);
    }
}
