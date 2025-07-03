package com.orangeHrm.ui.baseLayer;

import java.time.Duration;

import org.testng.annotations.Test;

import com.orangeHrm.ui.utilityLayer.DriverFactory;
import com.orangeHrm.ui.utilityLayer.WebDriverImpl;

public class BaseClass extends DriverFactory {

	WebDriverImpl webdriver;

	@Test
	public void abc() {
		setDriver("incognito");

		webdriver = new WebDriverImpl();

		webdriver.maximize();

		webdriver.implicitlyWait(Duration.ofSeconds(30));

		webdriver.pageLoadTimeOut(Duration.ofSeconds(30));

		webdriver.deleteAllCookies();

		webdriver.get("https://www.google.com");

		//webdriver.quit();
	}

}
