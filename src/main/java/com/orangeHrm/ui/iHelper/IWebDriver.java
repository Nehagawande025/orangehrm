package com.orangeHrm.ui.iHelper;

import java.time.Duration;

import org.openqa.selenium.WindowType;

public interface IWebDriver {

	void get(String openUrl);

	String getTitle();

	String getCurrentUrl();

	void close();

	void quit();

	void back();

	void forward();

	void refresh();

	void implicitlyWait(Duration d);

	void pageLoadTimeOut(Duration d);

	void maximize();

	void minimize();

	void fullScreen();

	void newWindow(WindowType windowType);

	void deleteAllCookies();

}
