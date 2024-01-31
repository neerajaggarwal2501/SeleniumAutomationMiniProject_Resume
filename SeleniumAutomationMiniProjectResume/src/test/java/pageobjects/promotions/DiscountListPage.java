package pageobjects.promotions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DiscountListPage {
	WebDriver driver;
	WebDriverWait wait;

	public DiscountListPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(@class,'content-header')]/*[self::h1 or self::h3]")
	WebElement pageHeader;

	@FindBy(xpath = "//a[@href='/Admin/GiftCard/Create']")
	WebElement newButton;

	@FindBy(xpath = "//a[@href='/Admin/Discount/Create']")
	WebElement addNewButton;

	public void clickAddButton() {
		addNewButton.click();
	}
}
