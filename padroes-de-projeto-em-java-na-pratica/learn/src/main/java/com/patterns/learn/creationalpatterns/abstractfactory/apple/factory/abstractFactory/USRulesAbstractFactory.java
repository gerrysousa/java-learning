package com.patterns.learn.creationalpatterns.abstractfactory.apple.factory.abstractFactory;

import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.certificate.Certificate;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.certificate.USCertificate;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.packing.Packing;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.packing.USPacking;

public class USRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new USCertificate();
	}

	public Packing getPacking() {
		return new USPacking();
	}

}
