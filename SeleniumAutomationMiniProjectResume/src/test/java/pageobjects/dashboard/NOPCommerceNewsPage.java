package pageobjects.dashboard;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NOPCommerceNewsPage {

	WebDriver driver;
	WebDriverWait wait;

	public NOPCommerceNewsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "\"Powered by nopCommerce\" link")
	WebElement link_poweredByNOPCommercelink;

	@FindBy(linkText = "Web API plugin")
	WebElement link_WebAPIPlugin;
	
	@FindBy(linkText = "Recommended hosting for your store")
	WebElement link_RecommendedHostingForYourStore;

	@FindBy(linkText = "here")
	WebElement link_here;
	
	@FindBy(linkText = "Get the plugin")
	WebElement link_getThePlugin;
	
	
	public void clickLinkWithTextPoweredByNOPCommerce() {
		link_poweredByNOPCommercelink.click();
	}

	public void clickLinkWithTextWebAPIPlugin() {
		link_WebAPIPlugin.click();
	}
	
	public void clickLinkWithTextRecommendedHostingForYourStore() throws InterruptedException {
		link_RecommendedHostingForYourStore.click();
	}
	
	public void clickLinkWithTexthere()  {
		link_here.click();
	}
	
	public void clickLinkWithTexGetThePlugin()  {
		link_getThePlugin.click();
	}	
	
	public void waitUntilStalenessOfLinkWithtextRecommendedHostingForYourStore() throws InterruptedException
	{
		System.out.println(driver.getPageSource());
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		System.out.println("\n\n\n" +driver.getPageSource());
		wait.until(ExpectedConditions.stalenessOf(link_RecommendedHostingForYourStore));
	}
}