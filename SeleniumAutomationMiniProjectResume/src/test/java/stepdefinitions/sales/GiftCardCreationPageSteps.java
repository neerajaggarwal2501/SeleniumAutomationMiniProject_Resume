package stepdefinitions.sales;

import java.io.IOException;

import framework.FrameWork;
import framework.filereaders.JSONFileReader;
import framework.managers.FileReaderManager;
import io.cucumber.java.en.When;
import testdatapojo.GiftCardCreationTestDataPOJO;

public class GiftCardCreationPageSteps {
	FrameWork fw;

	public GiftCardCreationPageSteps(FrameWork framework) throws IOException {
		fw = framework;
	}

	@When("from  Gift card type dropdown user selects {string}")
	public void from_gift_card_type_dropdown_user_selects(String giftCardType) {
		fw.getPageObjectManager().getGiftCardCreationPage().selectGiftCardTypeFromDropDown(giftCardType);
	}

	@When("enters the Initial value as {string}")
	public void enters_the_initial_value_as(String initialValue) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterInitialValue(initialValue);
	}

	@When("enters the copuon code as {string}")
	public void enters_the_copuon_code_as(String couponCode) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterCouponCode(couponCode);
	}

	@When("clicks on Generate Code Button")
	public void clicks_on_generate_code_button() {
		fw.getPageObjectManager().getGiftCardCreationPage().clickGenerateCouponCode();
	}

	@When("enters recipient Name as {string}")
	public void enters_recipient_name_as(String recipientName) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterRecipientsName(recipientName);
	}

	@When("enters the recipient email as {string}")
	public void enters_the_recipient_email_as(String recipientEMail) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterRecipientsEmail(recipientEMail);
	}

	@When("enters the senders Name as {string}")
	public void enters_the_senders_name_as(String sendersName) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterSendersName(sendersName);
	}

	@When("enters the senders email as {string}")
	public void enters_the_senders_email_as(String sendersEMail) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterSendersEMail(sendersEMail);
	}

	@When("enters the message as {string}")
	public void enters_the_message_as(String message) {
		fw.getPageObjectManager().getGiftCardCreationPage().enterMessage(message);
	}

	
	@When("user fills the form to create a Gift Card using the json file {string}")
	public void user_fills_the_form_to_create_a_gift_card_using_the_json_file(String testDataFileName) {
		//get an instance of jsonFilereader
		JSONFileReader jsonFileReader = FileReaderManager.getInstance().getJSONFileReader();
		//Read the json data into a pojo object
		GiftCardCreationTestDataPOJO newGiftCard = jsonFileReader.getGiftCardCreationData(testDataFileName);
		fw.getPageObjectManager().getGiftCardCreationPage().fillGiftCardCreationForm(newGiftCard);
	}
//	@When("user fills the form to create a Gift Card")
//	public void user_fills_the_form_to_create_a_gift_card() throws IOException {
//		JSONFileReader jsonFileReader = FileReaderManager.getInstance().getJSONFileReader();
//		NewGiftCard newGiftCard = jsonFileReader.getNewGiftCardData();
//		System.out.println(newGiftCard.toString());
//
//		fw.getPageObjectManager().getNewGiftCardPage().fillGiftCardForm(newGiftCard);
//	}
}
