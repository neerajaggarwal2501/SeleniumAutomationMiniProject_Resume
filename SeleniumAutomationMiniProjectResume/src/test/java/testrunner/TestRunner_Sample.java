package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features-Samples",
		glue = "stepdefinitions", 
		dryRun = false, 
		monochrome = true, 
		plugin = { "pretty", "html:TestReports\\TestReport.html","json:TestReports\\TestReport.json" },
		tags = "@Regression or @Sanity"
		)
public class TestRunner_Sample {
}