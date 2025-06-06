package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class Runner {

    @CucumberOptions(
            features = "src/test/resources/features",
            glue = {"stepdefs", "base"},
            plugin = {"pretty", "html:target/cucumber-report.html"},
            monochrome = true
    )
    public class TestRunner extends AbstractTestNGCucumberTests {}
}
