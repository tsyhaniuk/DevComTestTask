package pages;

import constants.Constant;
import dataProviders.ConfigFileReader;
import managers.FileReaderManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    private ConfigFileReader configFileReader;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Constant.getExplicitWaitDuration());
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//textarea[@type='search']")
    private WebElement searchTextArea;

    public void navigateToHomePage() {
        driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
    }

    public void enterSearchTerm() {
        wait.until(ExpectedConditions.visibilityOf(searchTextArea)).sendKeys("YouTube", Keys.ENTER);
    }
}
