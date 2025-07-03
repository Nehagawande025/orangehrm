package com.orangeHrm.ui.iHelper;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public interface IWait {

	public Alert alertIsPresent();

	public WebElement visibilityOf(WebElement wb);

	public List<WebElement> visibilityOfAllElements(List<WebElement> lists);

	public WebElement elementToBeClickable(WebElement wb);

}
