package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

public class TestNGCucumberRunner {

    @CucumberOptions(
            features = "src/test/resources/features",
            glue = {"stepDefs", "com.amazon.base"},
            plugin = {
                    "pretty",
                    "html:target/cucumber-reports/cucumber.html",
                    "json:target/cucumber-reports/cucumber.json",
                    "junit:target/cucumber-reports/cucumber.xml"
            },
            monochrome = true
    )
    public class TestRunner extends AbstractTestNGCucumberTests {

        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
            return super.scenarios();
        }
    }
}
