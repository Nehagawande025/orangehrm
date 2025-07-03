package com.orangeHrm.ui.utilityLayer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import com.orangeHrm.ui.baseLayer.BaseClass;
import com.orangeHrm.ui.iHelper.IWindowHandle;

public class WindowHandleImpl extends BaseClass implements IWindowHandle {

	@Override
	public void switchToWindow(Set<String> sets, int windowIndexPosition) {

		ArrayList<String> allArrayWindow = new ArrayList<String>();

		Iterator<String> it = sets.iterator();

		while (it.hasNext()) {
			allArrayWindow.add(it.next());
		}

		getDriver().switchTo().window(allArrayWindow.get(windowIndexPosition));
	}

}
