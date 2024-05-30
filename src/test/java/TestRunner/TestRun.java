package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//Features/Login.feature",glue = "StepDefinitionPageObject",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty"}
)

public class TestRun {

}
