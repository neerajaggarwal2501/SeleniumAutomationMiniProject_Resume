package stepdefinitions.promotions;

import java.io.IOException;

import framework.FrameWork;
import framework.filereaders.JSONFileReader;
import framework.managers.FileReaderManager;
import io.cucumber.java.en.When;
import testdatapojo.DiscountCreationTestDataPOJO;

public class DiscountCreationPageSteps {

	FrameWork fw;

	public DiscountCreationPageSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

	@When("user clicks on Add New button to create a new Discount")
	public void user_clicks_on_add_new_button_to_create_a_new_discount() {
		fw.getPageObjectManager().getDiscountListPage().clickAddButton();
	}

	@When("user fills the form to create a new Discount using the json file {string}")
	public void user_fills_the_form_to_create_a_new_discount_using_the_json_file(String testDataFileName) {
		JSONFileReader jsonFileReader = FileReaderManager.getInstance().getJSONFileReader();
		// Read the json data into a pojo object
		DiscountCreationTestDataPOJO discountCreationPOJO = jsonFileReader.getDiscountCreationData(testDataFileName);
		fw.getPageObjectManager().getDiscountCreationPage().fillDiscountCreationForm(discountCreationPOJO);
		
		System.out.println(discountCreationPOJO.toString());
	}
}