package managers;

import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.SearchResultsPage;
import pages.YouTubePage;

public class PageObjectManager {

    private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;
    private YouTubePage youTubePage;

    public PageObjectManager(WebDriver driver) {

        this.driver = driver;

    }

    public HomePage getHomePage() {

        return (homePage == null) ? homePage = new HomePage(driver) : homePage;

    }

    public SearchResultsPage getSearchResultsPage() {

        return (searchResultsPage == null) ? searchResultsPage = new SearchResultsPage(driver) : searchResultsPage;

    }

    public YouTubePage getYouTubePage() {

        return (youTubePage == null) ? youTubePage = new YouTubePage(driver) : youTubePage;

    }


}
