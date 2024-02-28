package stepdefinitions.commonsteps;

import java.io.IOException;

import framework.FrameWork;
import io.cucumber.java.en.When;

public class BrowserNavigationSteps {

	FrameWork fw;

	public BrowserNavigationSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

	@When("user clicks on back button from the browser")
	public void user_clicks_on_back_button_from_the_browser() throws InterruptedException {
		fw.getDriverManager().getDriver().navigate().back();
	}
}