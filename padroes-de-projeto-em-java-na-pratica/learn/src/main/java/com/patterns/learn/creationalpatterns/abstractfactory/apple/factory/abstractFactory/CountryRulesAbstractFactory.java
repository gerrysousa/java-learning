package com.patterns.learn.creationalpatterns.abstractfactory.apple.factory.abstractFactory;

import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.certificate.Certificate;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
