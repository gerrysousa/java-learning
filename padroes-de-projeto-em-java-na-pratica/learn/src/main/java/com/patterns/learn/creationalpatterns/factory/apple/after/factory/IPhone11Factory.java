package com.patterns.learn.creationalpatterns.factory.apple.after.factory;

import com.patterns.learn.creationalpatterns.factory.apple.after.model.IPhone;
import com.patterns.learn.creationalpatterns.factory.apple.after.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhone11();
	}

}
