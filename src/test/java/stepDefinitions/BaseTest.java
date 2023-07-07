package stepDefinitions;

import cucumber.TestContext;
import io.cucumber.java.After;

public class BaseTest {

    TestContext testContext;

    public BaseTest(TestContext context) {
        testContext = context;
    }

    @After
    public void AfterSteps() {
        testContext.getWebDriverManager().closeDriver();
    }

}