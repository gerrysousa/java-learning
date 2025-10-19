package com.patterns.learn.estructuralpatterns.mediator.translate.model;

import com.patterns.learn.estructuralpatterns.mediator.translate.mediator.Mediator;

public class EnglishUser extends User {

	public EnglishUser(String name, Mediator mediator) {
		super(name, mediator, Language.ENGLISH);
	}
	
}
