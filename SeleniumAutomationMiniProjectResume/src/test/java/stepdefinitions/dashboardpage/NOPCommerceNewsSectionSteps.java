package stepdefinitions.dashboardpage;

import java.io.IOException;

import framework.FrameWork;
import io.cucumber.java.en.When;

public class NOPCommerceNewsSectionSteps {

	FrameWork fw;

	public NOPCommerceNewsSectionSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

	@When("user clicks on the hyperlink Powered by nopCommerce link")
	public void user_clicks_on_the_hyperlink_powered_by_nop_commerce_link() {
		fw.getPageObjectManager().getNOPCommerceNewsPage().clickLinkWithTextPoweredByNOPCommerce();
	}

	@When("user clicks on the hyperlink Web API plugin")
	public void user_clicks_on_the_hyperlink_web_api_plugin() {
		fw.getPageObjectManager().getNOPCommerceNewsPage().clickLinkWithTextWebAPIPlugin();
	}

	@When("user clicks on the hyperlink Recommended hosting for your store")
	public void user_clicks_on_the_hyperlink_recommended_hosting_for_your_store() throws InterruptedException {
		fw.getPageObjectManager().getNOPCommerceNewsPage().clickLinkWithTextRecommendedHostingForYourStore();
	}

	@When("user clicks on the hyperlink here")
	public void user_clicks_on_the_hyperlink_here() {
		fw.getPageObjectManager().getNOPCommerceNewsPage().clickLinkWithTexthere();
	}

	@When("user clicks on the hyperlink Get the plugin")
	public void user_clicks_on_the_hyperlink_get_the_plugin() {
		fw.getPageObjectManager().getNOPCommerceNewsPage().clickLinkWithTexGetThePlugin();
	}

}