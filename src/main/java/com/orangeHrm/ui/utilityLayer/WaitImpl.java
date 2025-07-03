package com.orangeHrm.ui.utilityLayer;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrm.ui.baseLayer.BaseClass;
import com.orangeHrm.ui.iHelper.IWait;

public class WaitImpl extends BaseClass implements IWait {

	@Override
	public Alert alertIsPresent() {
//		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		return alert;

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.alertIsPresent());

	}

	@Override
	public WebElement visibilityOf(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}

	@Override
	public List<WebElement> visibilityOfAllElements(List<WebElement> lists) {
		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.visibilityOfAllElements(lists));
	}

	@Override
	public WebElement elementToBeClickable(WebElement wb) {

		return new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.elementToBeClickable(wb));
	}

}
