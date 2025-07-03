package com.orangeHrm.ui.iHelper;

public interface IAlert {

	void accept();

	void dismiss();

	String getText();

	void sendKeys(String value);

}
