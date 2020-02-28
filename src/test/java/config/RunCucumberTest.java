package config;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber-reports/Cucumber.json"},
    glue = {"stepdefs"},
	features = {"src/test/features"})
public class RunCucumberTest {
}
