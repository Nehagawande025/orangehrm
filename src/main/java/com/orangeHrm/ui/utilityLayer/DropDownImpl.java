package com.orangeHrm.ui.utilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.orangeHrm.ui.baseLayer.BaseClass;
import com.orangeHrm.ui.iHelper.IDropDown;

public class DropDownImpl extends BaseClass implements IDropDown {

	private WaitImpl wait = new WaitImpl();
	private WebElementImpl webelement = new WebElementImpl();

	@Override
	public void selectByVisibleText(WebElement wb, String visibleValue) {

		new Select(wait.visibilityOf(wb)).selectByVisibleText(visibleValue);

	}

	@Override
	public void selectByValue(WebElement wb, String value) {

		new Select(wait.visibilityOf(wb)).selectByValue(value);
	}

	@Override
	public void selectByIndex(WebElement wb, int index) {

		new Select(wait.visibilityOf(wb)).selectByIndex(index);
	}

	@Override
	public void getOptions(WebElement wb) {

		List<WebElement> listsValues = new Select(wait.visibilityOf(wb)).getOptions();

		for (WebElement value : listsValues) {
			String actualValue = webelement.getText(value);
			System.out.println(actualValue);
		}

	}

	@Override
	public void selectValue(List<WebElement> listsValues, String expectedValue) {

		for (WebElement value : wait.visibilityOfAllElements(listsValues)) 
		{

			if (webelement.getText(value).equalsIgnoreCase(expectedValue)) 
			{
				webelement.click(value);
				break;
			}
		}

	}

}
