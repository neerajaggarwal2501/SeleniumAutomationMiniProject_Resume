package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	String originalStyle;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Email")
	WebElement email;

	@FindBy(id = "Password")
	WebElement password;

	@FindBy(xpath = "//button[@type='submit' and text()='Log in']")
	WebElement loginButton;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logoutLnk;

	public void enterEmail(String email) throws InterruptedException {
		this.email.clear();
		this.email.sendKeys(email);
	}

	public void enterPassword(String password) throws InterruptedException {
		this.password.clear();
		this.password.sendKeys(password);
	}

	public void clickOnLoginButton() throws InterruptedException {

		// Perform actual action
		this.loginButton.click();
	}

	public void clickOnLogoutLink() throws InterruptedException {
		this.logoutLnk.click();
	}
}
