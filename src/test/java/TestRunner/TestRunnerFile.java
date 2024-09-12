package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src\\main\\resources\\FeatureFiles"},
		glue= {"StepDefinitions"},
		plugin = { "pretty", "html:target/HtmlReports/reports.html" }
)

public class TestRunnerFile {

}
