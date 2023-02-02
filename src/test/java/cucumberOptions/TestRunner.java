package cucumberOptions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "stepDefinitions",
		dryRun = false,//stop if have step not implement
		monochrome = true, // make the report easier to read
		plugin = {"pretty", "html:target/site/cucumber-report-dedault","json:target/site/cucumber.json"},
		snippets = SnippetType.CAMELCASE,
		tags = {"@add_address_feature"})

public class TestRunner{

}