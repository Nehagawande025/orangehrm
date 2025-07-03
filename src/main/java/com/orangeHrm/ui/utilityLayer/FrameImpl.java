package com.orangeHrm.ui.utilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orangeHrm.ui.baseLayer.BaseClass;
import com.orangeHrm.ui.iHelper.IFrames;

public class FrameImpl extends BaseClass implements IFrames {

	@Override
	public void frame(int index) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(index));
	}

	@Override
	public void frame(String IdOrName) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(IdOrName));
	}

	@Override
	public void frame(WebElement framewb) {
		new WebDriverWait(getDriver(), Duration.ofSeconds(30))
				.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(framewb));
	}

	@Override
	public void parentFrame() {
		getDriver().switchTo().parentFrame();

	}

	@Override
	public void defaultContent() {
		getDriver().switchTo().defaultContent();
	}

}
