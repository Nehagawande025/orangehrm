package com.orangeHrm.ui.utilityLayer;

import com.orangeHrm.ui.iHelper.IAlert;

public class AlertImpl implements IAlert {

	private WaitImpl wait = new WaitImpl();

	@Override
	public void accept() {

		wait.alertIsPresent().accept();
	}

	@Override
	public void dismiss() {
		wait.alertIsPresent().dismiss();
	}

	@Override
	public String getText() {

		return wait.alertIsPresent().getText();
	}

	@Override
	public void sendKeys(String value) {

		wait.alertIsPresent().sendKeys(value);
	}

}
