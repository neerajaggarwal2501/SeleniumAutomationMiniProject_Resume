package stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.junit.Assert;

import framework.FrameWork;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {

	FrameWork fw;

	public HomePageSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

	@When("user enters Username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String userName, String pasword) throws InterruptedException {
		fw.getPageObjectManager().getLoginPage().enterEmail(userName);
		fw.getPageObjectManager().getLoginPage().enterPassword(pasword);
		// Thread.sleep(1000);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		fw.getPageObjectManager().getLoginPage().clickOnLoginButton();
		// Thread.sleep(10000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) throws InterruptedException {
		String actualTitle = fw.getDriverManager().getDriver().getTitle();
		if (!actualTitle.equals(expectedTitle)) {
			Assert.assertTrue(actualTitle.contains(expectedTitle));
		}
	}

	@When("user click on logout link")
	public void user_click_on_logout_link() throws InterruptedException {
		// Thread.sleep(1000);
		fw.getPageObjectManager().getLoginPage().clickOnLogoutLink();
	}

	@Then("validate that the navigation bar has following items")
	public void validate_that_the_navigation_bar_has_following_items(DataTable expectedDataTable) {
		List<List<String>> actualList = fw.getPageObjectManager().getHomePage().getNavBarItems();
		DataTable actualDataTable = DataTable.create(actualList);

		expectedDataTable.diff(actualDataTable);
	}

	@When("user clicks on Navigation bar item {string}")
	public void user_clicks_on_navigation_bar_item(String navBarItem) throws Exception {
		fw.getPageObjectManager().getHomePage().clickNavBarItem(navBarItem);
	}

	@When("user clicks on sub-menu item {string}")
	public void user_clicks_on_sub_menu_item(String navBarItem) throws Exception {
		fw.getPageObjectManager().getHomePage().clickNavBarItem(navBarItem);
	}
}
