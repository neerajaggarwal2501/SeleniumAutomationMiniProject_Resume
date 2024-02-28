package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "@TestReports/TestReport_Retry.txt",
		glue = "stepdefinitions", 
		dryRun = false, 
		monochrome = true, 
				plugin = { "pretty", "html:TestReports\\RetryTestReport.html","json:TestReports\\RetryTestReport.json"},
		tags = "@Regression or @Smoke"
		)
public class TestRunner_Sample_ReRunFailedTests {
}