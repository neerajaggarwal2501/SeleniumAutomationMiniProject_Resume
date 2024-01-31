package pageobjects.sales;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testdatapojo.GiftCardCreationTestDataPOJO;

public class GiftCardCreationPage {

	WebDriver driver;
	WebDriverWait wait;

	public GiftCardCreationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "GiftCardTypeId")
	WebElement giftCardTypeDropDown;

	@FindBy(xpath = "//input[@role='spinbutton' and @tabindex = '0']")
	WebElement initialValueTextBoxWithIncrementAndDecrementButtons;

	@FindBy(xpath = "//span[@aria-label='Increase value']")
	WebElement initialValueTextBoxIncrementButton;

	@FindBy(xpath = "//span[@aria-label='Decrease value']")
	WebElement initialValueTextBoxDecrementButton;

	@FindBy(id = "IsGiftCardActivated")
	WebElement isGiftCardActivatedCheckBox;

	@FindBy(id = "GiftCardCouponCode")
	WebElement couponCodetextBox;

	@FindBy(id = "generateCouponCode")
	WebElement generateCouponButton;

	@FindBy(id = "RecipientName")
	WebElement recipientNameTextBox;

	@FindBy(id = "RecipientEmail")
	WebElement recipientEmailTextBox;

	@FindBy(id = "SenderName")
	WebElement senderNameTextBox;

	@FindBy(id = "SenderEmail")
	WebElement senderEmailTextBox;

	@FindBy(id = "Message")
	WebElement messageTextBox;

	public void selectGiftCardTypeFromDropDown(String giftCardType) {
		Select dropDown = new Select(giftCardTypeDropDown);
		dropDown.selectByVisibleText(giftCardType);
	}

	public void enterInitialValue(String initialValue) {
		initialValueTextBoxWithIncrementAndDecrementButtons.sendKeys(initialValue);
	}

	public void selectIsGiftCardActivated() {
		isGiftCardActivatedCheckBox.click();
	}

	public void enterCouponCode(String couponCode) {
		couponCodetextBox.sendKeys(couponCode);
	}

	public void clickGenerateCouponCode() {
		generateCouponButton.click();
	}

	public void enterRecipientsName(String recipientName) {
		recipientNameTextBox.sendKeys(recipientName);
	}

	public void enterRecipientsEmail(String recipientEmail) {
		recipientEmailTextBox.sendKeys(recipientEmail);
	}

	public void enterSendersName(String sendersName) {
		senderNameTextBox.sendKeys(sendersName);
	}

	public void enterSendersEMail(String sendersEmail) {
		senderEmailTextBox.sendKeys(sendersEmail);
	}

	public void enterMessage(String message) {
		messageTextBox.sendKeys(message);
	}

	public void fillGiftCardCreationForm(GiftCardCreationTestDataPOJO newGiftCard) {
		wait.until(ExpectedConditions.visibilityOf(initialValueTextBoxWithIncrementAndDecrementButtons));
		enterInitialValue(newGiftCard.initialValue);
		selectIsGiftCardActivated();
		enterCouponCode(newGiftCard.couponCode);
		clickGenerateCouponCode();
		enterRecipientsName(newGiftCard.recipientName);
		enterRecipientsEmail(newGiftCard.recipientEmail);
		enterSendersName(newGiftCard.senderName);
		enterSendersEMail(newGiftCard.senderEmail);
		enterMessage(newGiftCard.message);
	}
}
