package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/001_DashBoardPage",
		glue = "stepdefinitions", 
		dryRun = false, 
		monochrome = true, 
		plugin = { "pretty", "html:TestReports\\TestReport.html","json:TestReports\\TestReport.json","rerun:TestReports\\TestReport_FailedTests.txt" },
		tags = "@Regression or @Smoke"
		)
public class TestRunner_Sample {
}