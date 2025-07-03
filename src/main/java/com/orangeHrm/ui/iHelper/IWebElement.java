package com.orangeHrm.ui.iHelper;

import org.openqa.selenium.WebElement;

public interface IWebElement {

	void click(WebElement wb);

	void submit(WebElement wb);

	void sendKeys(WebElement wb, String value);

	void clear(WebElement wb);

	String getCssValue(WebElement wb, String key);

	String getText(WebElement wb);

	String getAtribute(WebElement wb, String key);

	boolean isDisplayed(WebElement wb);

	boolean isEnabled(WebElement wb);

	boolean isSelected(WebElement wb);

}
