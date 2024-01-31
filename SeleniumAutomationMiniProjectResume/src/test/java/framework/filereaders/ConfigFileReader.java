package framework.filereaders;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import framework.enums.Browser;
import framework.enums.EnvironmentType;

public class ConfigFileReader {

	Properties properties;

	public ConfigFileReader() throws IOException {
		properties = new Properties();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src" + File.separator + "test"
				+ File.separator + "resources" + File.separator + "config" + File.separator + "config.properties"));
		properties.load(bufferedReader);
		bufferedReader.close();
	}

	public Browser getBrowserName() {
		String browserName = null;
		browserName = properties.getProperty("browser");

		if (browserName == null || browserName.equalsIgnoreCase("Chrome")) {
			return Browser.CHROME;
		} else if (browserName.equalsIgnoreCase("MSEDGE")) {
			return Browser.MSEDGE;
		} else if (browserName.equalsIgnoreCase("FIREFOX")) {
			return Browser.FIREFOX;
		} else {
			throw new RuntimeException("Undefined Browser Name : " + browserName);
		}

	}

	public int getImplicitWait() {
		int implicitWaitInSeconds = Integer.parseInt(properties.getProperty("ImplicitWait"));
		return implicitWaitInSeconds;
	}

	public EnvironmentType getEnironmentType() {
		String environmentType = null;
		environmentType = properties.getProperty("environmentType");

		if (environmentType == null || environmentType.equalsIgnoreCase("LOCAL")) {
			return EnvironmentType.LOCAL;
		} else if (environmentType.equalsIgnoreCase("REMOTE")) {
			return EnvironmentType.REMOTE;
		} else {
			throw new RuntimeException("Undefined Environment Type : " + environmentType);
		}
	}

	public String getApplicationURL() throws MalformedURLException {
		String applicationURL = properties.getProperty("APPLICATION_URL").trim();
		if (applicationURL == null) {
			throw new RuntimeException("Unexpected Application URL " + applicationURL);
		}
		URL appURL = new URL(applicationURL);
		return appURL.toString();
	}
}
