package com.patterns.learn.creationalpatterns.abstractfactory.apple.factory;

import com.patterns.learn.creationalpatterns.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.iphone.IPhone;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.iphone.IPhoneX;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.iphone.IPhoneXSMax;

public class IPhoneXFactory extends IPhoneFactory {

	public IPhoneXFactory(CountryRulesAbstractFactory rules) {
		super(rules);
	}

	public IPhone createIPhone(String level) {
		if(level.equals("standard")) {
			return new IPhoneX(rules);
		} else if(level.equals("highEnd")) {
			return new IPhoneXSMax(rules);
		} else return null;
	}

}
