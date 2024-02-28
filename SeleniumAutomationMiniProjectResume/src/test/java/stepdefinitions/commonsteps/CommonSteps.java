package stepdefinitions.commonsteps;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

	@Then("the title of page is {string}")
	public void the_title_of_page_is(String expectedTitle) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(fw.getDriverManager().getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		StringBuffer actualTitle = new StringBuffer(fw.getDriverManager().getDriver().getTitle());
		Assert.assertEquals(expectedTitle, actualTitle.toString());
	}

	@Then("the url of page is {string}")
	public void the_url_of_page_is(String expectedURL) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(fw.getDriverManager().getDriver(), Duration.ofSeconds(15));
		wait.until(ExpectedConditions.urlToBe(expectedURL));
		StringBuffer actualURL = new StringBuffer(fw.getDriverManager().getDriver().getCurrentUrl());
		Assert.assertEquals(expectedURL, actualURL.toString());
	}

}