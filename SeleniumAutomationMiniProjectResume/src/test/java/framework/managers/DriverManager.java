package framework.managers;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import framework.enums.Browser;
import framework.enums.EnvironmentType;

public class DriverManager {

	private WebDriver driver;
	private static EnvironmentType environmentType;
	private static Browser browser;
	private int implicitWait;

	public DriverManager() throws IOException {
		environmentType = FileReaderManager.getInstance().getConfigFileReader().getEnironmentType();
		browser = FileReaderManager.getInstance().getConfigFileReader().getBrowserName();
		implicitWait = FileReaderManager.getInstance().getConfigFileReader().getImplicitWait();
	}

	public WebDriver getDriver() {
		if (driver == null) {
			createDriver();
		}
		return driver;
	}

	private WebDriver createDriver() {
		switch (environmentType) {
		case LOCAL:
			createlocalDriver();
			break;
		case REMOTE:
			createRemoteDriver();
			break;
		}
		return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("To be implemented...");
	}

	private WebDriver createlocalDriver() {
		switch (browser) {
		case CHROME:
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			driver = new FirefoxDriver();
			break;
		case MSEDGE:
			driver = new EdgeDriver();
			break;
		case SAFARI:
			driver = new SafariDriver();
			break;
		default:
			driver = null;
			throw new RuntimeException("Driver not initialized. Invalid browser value + " + browser + " specified."
					+ "Supported values are chrome/firefox/msedge");
		}
		if (implicitWait > 0) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
		}
		return driver;
	}
}