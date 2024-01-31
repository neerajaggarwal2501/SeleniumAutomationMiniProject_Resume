package stepdefinitions.samples;

import java.io.IOException;

import org.junit.Assert;

import framework.FrameWork;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleSteps {

	FrameWork fw;

	public SampleSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

//	@Given("user opens url {string}")
//	public void user_opens_url(String url) throws InterruptedException {
//		fw.getDriverManager().getDriver().get(url);
//	}

	@Then("the title of page is {string}")
	public void the_title_of_page_is(String expectedTitle) throws InterruptedException {
		StringBuffer actualTitle = new StringBuffer(fw.getDriverManager().getDriver().getTitle());
		Assert.assertEquals(expectedTitle, actualTitle.toString());
	}

	@When("user clicks on {string}")
	public void user_clicks_on(String service) throws InterruptedException {
		Thread.sleep(1);
		switch (service) {
		case "Flights":
			fw.getPageObjectManager().getBingHomePage().clickOnFlights();
			break;
		case "Stays":
			fw.getPageObjectManager().getBingHomePage().clickOnStays();
			break;
		case "Car rentals":
			fw.getPageObjectManager().getBingHomePage().clickOnCarRentals();
			break;
		}
	}

}
