# DevComTestTask framework

DevComTestTask framework is a lightweight and flexible testing framework designed to simplify the creation and execution of automated tests. It integrates popular testing libraries and tools to provide a seamless testing experience.

## Features

- Integration with Cucumber for behavior-driven testing
- Support for multiple browsers through Selenium WebDriver
- Page Object Model design pattern for scalable and maintainable tests
- Configuration file for managing test parameters
- Helper classes for common testing tasks
- Assertion library for validating test results

## Prerequisites

Before getting started with DevComTestTask framework, ensure that the following dependencies are installed:

- Java Development Kit (JDK) 11 or higher
- Maven build tool
- Cucumber plugin for your IDE (optional)

## Getting Started

To use DevComTestTask framework in your project, follow these steps:

1. Clone the MyTestFramework repository or download the source code.
2. Import the project into your preferred IDE.
3. Set up the project dependencies in the `pom.xml` file. You can add additional libraries or tools as needed.
4. Create your test scenarios using Gherkin syntax in feature files located in the `src/test/resources` directory.
5. Implement the step definitions for your scenarios in the `stepDefinitions` package.
6. Add any necessary page objects in the `pages` package to interact with web elements.
7. Customize the test configuration in the `Configuration.properties` file located in the `configs` directory.
8. In the `Configuration.properties`, you can also choose your preferred browser by modifying the value of the "browser" setting (use "chrome" for Google Chrome and "firefox" for Firefox).
9. Run the tests using the provided test runner class or through your IDE's test runner.
10. View the test reports and results to validate the execution.

## Project Structure

The project follows a standard Maven directory structure:

- `src/main/java`: Contains the main Java source files (not used for testing).
- `src/test/java`: Contains the test-related Java source files, including step definitions and helper classes.
- `src/test/resources`: Contains the feature files for defining test scenarios.
- `configs`: Contains the configuration files for the test framework.
- `pages`: Contains the page objects for interacting with web elements.
- `runners`: Contains the test runner classes for executing the tests.

## Running the Tests

You can run the tests using either the provided test runner class or through your IDE's test runner.

To run the tests using the test runner class:
1. Locate the test runner class, such as `TestRunner.java`, in the `runners` package.
2. Right-click on the test runner class and select "Run" or "Run As" > "JUnit Test" (depending on your IDE).

To run the tests through the IDE's test runner:
1. Open the feature file containing the test scenarios.
2. Right-click on the feature file and select "Run" or "Run As" > "Cucumber Feature" (depending on your IDE).

To run tests through the command promt
1. Open the command prompt and cd until the project root directory.
2. Run the following command in the command prompt: mvn test

## Reporting

DevComTestTask framework generates test reports in HTML format. After running the tests, you can find the reports in the `target/cucumber-reports` directory. Open the HTML file to view the detailed test results and statistics.

## Customization

You can customize various aspects of DevComTestTask framework according to your project's requirements:

- Add additional dependencies in the `pom.xml` file to incorporate additional libraries or tools.
- Modify the `Configuration.properties` file to update test configuration parameters.
- Extend or modify the provided base classes, such as `BaseTest`, to add custom functionality.

## Contributions

Contributions to DevComTestTask framework are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request on the GitHub repository.

## Contact

For any questions or inquiries, please contact [nazariyt@gmail.com](mailto:nazariyt@gmail.com).

---

This README provides a brief overview of the DevComTestTask framework and how to get started with it. Feel free to customize it further to match the specifics of your framework and project. Happy testing!
