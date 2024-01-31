package stepdefinitions;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.Assert;

import framework.FrameWork;
import framework.managers.FileReaderManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {

	FrameWork fw;

	public CommonSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

	@When("user opens url")
	public void user_opens_url() throws InterruptedException, MalformedURLException, IOException {
		fw.getDriverManager().getDriver()
				.get(FileReaderManager.getInstance().getConfigFileReader().getApplicationURL());
	}

	@When("user opens url {string}")
	public void user_opens_url(String url) throws InterruptedException, MalformedURLException, IOException {
		fw.getDriverManager().getDriver().get(url);
	}

	@Then("page with header {string} is displayed")
	public void page_with_header_is_displayed(String expectedPageHeader) throws InterruptedException {
		String actualPageHeader = fw.getPageObjectManager().getGiftCardsListPage().getPageHeader();
		System.out.println(actualPageHeader + "   expected= " + expectedPageHeader);
		Assert.assertTrue(actualPageHeader.contains(expectedPageHeader));

	}
}
