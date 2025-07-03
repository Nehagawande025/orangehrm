package com.orangeHrm.ui.iHelper;

import org.openqa.selenium.WebElement;

public interface IFrames {

	void frame(int index);

	void frame(String IdOrName);

	void frame(WebElement framewb);

	void parentFrame();

	void defaultContent();

}
