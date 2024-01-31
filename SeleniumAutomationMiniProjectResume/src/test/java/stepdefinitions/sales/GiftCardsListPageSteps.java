package stepdefinitions.sales;

import java.io.IOException;

import framework.FrameWork;
import io.cucumber.java.en.When;

public class GiftCardsListPageSteps {

	FrameWork fw;

	public GiftCardsListPageSteps(FrameWork framework) throws IOException {
		fw = framework;
	}



	@When("user clicks on Add New button to create a new Gift Card")
	public void user_clicks_on_button_to_create_a_new_gift_card() {
		fw.getPageObjectManager().getGiftCardsListPage().clickAddNewButton();
	}
}