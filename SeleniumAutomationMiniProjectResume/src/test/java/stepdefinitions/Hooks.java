package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import framework.FrameWork;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks {

	FrameWork fw;

	public Hooks(FrameWork framework) {
		fw = framework;
	}

	@After(order = 1)
	public void takeScreenshotOnFailure(Scenario scenario) throws InterruptedException {
		if (scenario.isFailed()) {
			Thread.sleep(2000); // TODO
			TakesScreenshot ts = (TakesScreenshot) fw.getDriverManager().getDriver();
			byte[] src = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png", "screenshot");
		}
	}

	@After(order = 0)
	public void tearDown() {
		if (fw.getDriverManager().getDriver() != null) {
			fw.getDriverManager().getDriver().quit();
		}
	}
}