package pageobjects.promotions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import testdatapojo.DiscountCreationTestDataPOJO;

public class DiscountCreationPage {

	WebDriver driver;
	WebDriverWait wait;

	public DiscountCreationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "IsActive")
	WebElement isActive;

	@FindBy(xpath = "//input[@id='Name']")
	WebElement nameTextBox;

	@FindBy(id = "DiscountTypeId")
	WebElement discountTypeDropDown;

	@FindBy(id = "UsePercentage")
	WebElement usePercentageCheckBox;

	@FindBy(xpath = "((//div[@id='pnlDiscountAmount'])//input[@role='spinbutton'])[1]")
	WebElement discountAmountTextBox;

	@FindBy(id = "RequiresCouponCode")
	WebElement requiresCouponCoeCheckBox;

	@FindBy(id = "StartDateUtc")
	WebElement startDateTextBox;

	@FindBy(id = "EndDateUtc")
	WebElement endDateTextBox;

	@FindBy(id = "IsCumulative")
	WebElement cumilativeWithOtherDiscountsCheckBox;

	@FindBy(id = "DiscountLimitationId")
	WebElement discountLimitationDropDown;

	@FindBy(id = "AdminComment")
	WebElement adminContentTextBox;

	public void selectIsActiveCheckBox() {
		if (!isActive.isSelected())
			isActive.click();
	}

	public void deSelectIsActiveCheckBox() {
		if (isActive.isSelected())
			isActive.click();
	}

	public void enterValueInDiscountNameTextBox(String discountName) {
		this.nameTextBox.sendKeys(discountName);
	}

	public void selectFromDiscountTypeDropDown(String discountTypeValue) {
		Select select = new Select(discountTypeDropDown);
		select.selectByVisibleText(discountTypeValue);
	}

	public void selectUsePercentageCheckBox() {
		wait.until(ExpectedConditions.elementToBeClickable(usePercentageCheckBox));
		if (!usePercentageCheckBox.isSelected())
			usePercentageCheckBox.click();
	}

	public void deSelectUsePercentageCheckBox() {
		if (usePercentageCheckBox.isSelected())
			usePercentageCheckBox.click();
	}

	public void enterValueInDiscountAmountTextBox(String discountAmount) {
		wait.until(ExpectedConditions.visibilityOf(discountAmountTextBox));
		discountAmountTextBox.sendKeys(discountAmount);
	}

	public void selectRequiresCouponCodeCheckBox() {
		if (!requiresCouponCoeCheckBox.isSelected())
			requiresCouponCoeCheckBox.click();
	}

	public void deSelectRequiresCouponCodeCheckBox() {
		if (requiresCouponCoeCheckBox.isSelected())
			requiresCouponCoeCheckBox.click();
	}

	public void enterValueInStartDateTextBox(String startDate) {
		startDateTextBox.sendKeys(startDate);
	}

	public void enterValueInEndDateTextBox(String endDate) {
		endDateTextBox.sendKeys(endDate);
	}

	public void selectCumilativeWithOtherDiscountsCheckBox() {
		if (!cumilativeWithOtherDiscountsCheckBox.isSelected())
			cumilativeWithOtherDiscountsCheckBox.click();
	}

	public void deSelectCumilativeWithOtherDiscountsCheckBox() {
		if (cumilativeWithOtherDiscountsCheckBox.isSelected())
			cumilativeWithOtherDiscountsCheckBox.click();
	}

	public void selectValueFromDiscountLimitationDropDown(String discountLimitationValue) {
		Select select = new Select(discountLimitationDropDown);
		select.selectByVisibleText(discountLimitationValue);
	}

	public void enterValueInAdminCommentTextBox(String comments) {
		adminContentTextBox.sendKeys(comments);
	}

	public void fillDiscountCreationForm(DiscountCreationTestDataPOJO discountCreationPOJO) {
		if (discountCreationPOJO.isActive.equals("True"))
			selectIsActiveCheckBox();
		else if (discountCreationPOJO.isActive.equals("False")) {
			deSelectIsActiveCheckBox();
		}
		enterValueInDiscountNameTextBox(discountCreationPOJO.name);
		selectFromDiscountTypeDropDown(discountCreationPOJO.discountType);
		if (discountCreationPOJO.usePercentage.equals("True"))
			selectUsePercentageCheckBox();
		else if (discountCreationPOJO.usePercentage.equals("False")) {
			deSelectUsePercentageCheckBox();
		}

		enterValueInDiscountAmountTextBox(discountCreationPOJO.discountAmount);
		if (discountCreationPOJO.requiresCouponCode.equals("True"))
			selectRequiresCouponCodeCheckBox();
		else if (discountCreationPOJO.requiresCouponCode.equals("False")) {
			deSelectRequiresCouponCodeCheckBox();
		}
		enterValueInStartDateTextBox(discountCreationPOJO.startDate);
		enterValueInEndDateTextBox(discountCreationPOJO.endDate);
		if (discountCreationPOJO.cumulativeWithOtherDiscounts.equals("True"))
			selectCumilativeWithOtherDiscountsCheckBox();
		else if (discountCreationPOJO.cumulativeWithOtherDiscounts.equals("False")) {
			deSelectCumilativeWithOtherDiscountsCheckBox();
		}
		selectValueFromDiscountLimitationDropDown(discountCreationPOJO.discountLimitation);
		enterValueInAdminCommentTextBox(discountCreationPOJO.adminComment);
	}
}