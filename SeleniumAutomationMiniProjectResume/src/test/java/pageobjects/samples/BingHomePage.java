package pageobjects.samples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingHomePage {

	WebDriver driver;

	public BingHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Flights")
	WebElement flights;

	@FindBy(linkText = "Stays")
	WebElement stays;

	@FindBy(linkText = "Car rentals")
	WebElement carRentals;

	public void clickOnFlights() {
		flights.click();
	}

	public void clickOnStays() {
		stays.click();
	}

	public void clickOnCarRentals() {
		carRentals.click();
	}
}