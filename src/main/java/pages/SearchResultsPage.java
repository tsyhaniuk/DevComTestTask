package pages;

import constants.Constant;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Constant.getExplicitWaitDuration());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a/img[@alt=\"Google\"]")
    WebElement googleLabel;

    @FindAll(@FindBy(xpath = "//h3"))
    List<WebElement> googleResults;

    public void openFirstLink() {
        wait.until(ExpectedConditions.visibilityOf(googleLabel));
        googleResults.get(0).click();
    }
}
