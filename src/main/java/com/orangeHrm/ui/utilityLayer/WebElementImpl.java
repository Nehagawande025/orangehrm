package com.orangeHrm.ui.utilityLayer;

import org.openqa.selenium.WebElement;

import com.orangeHrm.ui.baseLayer.BaseClass;
import com.orangeHrm.ui.iHelper.IWebElement;

public class WebElementImpl extends BaseClass implements IWebElement {

	private WaitImpl wait = new WaitImpl();

	@Override
	public void click(WebElement wb) {

		wait.elementToBeClickable(wb).click();
	}

	@Override
	public void submit(WebElement wb) {

		wait.elementToBeClickable(wb).submit();
	}

	@Override
	public void sendKeys(WebElement wb, String value) {

		wait.visibilityOf(wb).sendKeys(value);
	}

	@Override
	public void clear(WebElement wb) {

		wait.visibilityOf(wb).clear();
	}

	@Override
	public String getCssValue(WebElement wb, String key) {

		return wait.visibilityOf(wb).getCssValue(key);
	}

	@Override
	public String getText(WebElement wb) {

		return wait.visibilityOf(wb).getText();
	}

	@Override
	public String getAtribute(WebElement wb, String key) {
		return wait.visibilityOf(wb).getAttribute(key);
	}

	@Override
	public boolean isDisplayed(WebElement wb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled(WebElement wb) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isSelected(WebElement wb) {
		// TODO Auto-generated method stub
		return false;
	}

}
