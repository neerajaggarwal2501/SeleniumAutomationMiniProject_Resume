package framework;

import java.io.IOException;

import framework.managers.DriverManager;
import framework.managers.PageObjectManager;

public class FrameWork {
	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public FrameWork() throws IOException {
		webDriverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}

	public DriverManager getDriverManager() {
		return webDriverManager;
	}

	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
}