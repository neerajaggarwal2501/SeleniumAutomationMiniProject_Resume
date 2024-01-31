package framework.managers;

import org.openqa.selenium.WebDriver;

import pageobjects.HomePage;
import pageobjects.LoginPage;
import pageobjects.promotions.DiscountCreationPage;
import pageobjects.promotions.DiscountListPage;
import pageobjects.sales.GiftCardCreationPage;
import pageobjects.sales.GiftCardListPage;
import pageobjects.samples.BingHomePage;

public class PageObjectManager {

	private WebDriver driver;
	private HomePage homePage;
	private LoginPage loginPage;
	private GiftCardCreationPage newGiftCardPage;
	private GiftCardListPage giftCardsListPage;
	private DiscountListPage discountListPage;
	private DiscountCreationPage newDiscountPage;
	private BingHomePage bingHomePage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? new HomePage(driver) : homePage;
	}

	public LoginPage getLoginPage() {
		return (loginPage == null) ? new LoginPage(driver) : loginPage;
	}

	public GiftCardCreationPage getGiftCardCreationPage() {
		return (newGiftCardPage == null) ? new GiftCardCreationPage(driver) : newGiftCardPage;
	}

	public GiftCardListPage getGiftCardsListPage() {
		return (giftCardsListPage == null) ? new GiftCardListPage(driver) : giftCardsListPage;
	}

	public DiscountListPage getDiscountListPage() {
		return (discountListPage == null) ? new DiscountListPage(driver) : discountListPage;
	}

	public DiscountCreationPage getDiscountCreationPage() {
		return (newDiscountPage == null) ? new DiscountCreationPage(driver) : newDiscountPage;
	}

	public BingHomePage getBingHomePage() {
		return (bingHomePage == null) ? new BingHomePage(driver) : bingHomePage;
	}

}
