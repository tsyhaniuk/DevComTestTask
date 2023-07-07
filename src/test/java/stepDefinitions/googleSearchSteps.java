package stepDefinitions;

import constants.Constant;
import cucumber.TestContext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.YouTubePage;

public class googleSearchSteps {
    TestContext testContext;
    HomePage homePage;
    SearchResultsPage searchResultsPage;
    YouTubePage youTubePage;

    public googleSearchSteps(TestContext context) {
        testContext = context;
        homePage = testContext.getPageObjectManager().getHomePage();
        searchResultsPage = testContext.getPageObjectManager().getSearchResultsPage();
        youTubePage = testContext.getPageObjectManager().getYouTubePage();
    }

    @Given("^I am on the Google homepage$")
    public void openGooglePage() {
        homePage.navigateToHomePage();
    }

    @When("^I search for \"YouTube\"$")
    public void performGoogleSearch() {
        homePage.enterSearchTerm();
    }

    @And("^I click on the YouTube link$")
    public void openFirstSearchResult() {
        searchResultsPage.openFirstLink();
    }

    @Then("^I should be redirected to the YouTube page$")
    public void verifyOpenedPage() {
        Assertions.assertEquals(Constant.getYOUTUBE_URL(), youTubePage.getPageUrl());
        Assertions.assertEquals(Constant.getYOUTUBE_TITLE(), youTubePage.getPageTitle());
    }


}
