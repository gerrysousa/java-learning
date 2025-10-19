package com.patterns.learn.creationalpatterns.abstractfactory.apple.factory.abstractFactory;

import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.certificate.BrazilianCertificate;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.certificate.Certificate;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.packing.BrazilianPacking;
import com.patterns.learn.creationalpatterns.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
