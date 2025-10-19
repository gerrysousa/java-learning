package com.patterns.learn.creationalpatterns.factory.apple.after.factory;

import com.patterns.learn.creationalpatterns.factory.apple.after.model.IPhone;
import com.patterns.learn.creationalpatterns.factory.apple.after.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneX();
	}

}
