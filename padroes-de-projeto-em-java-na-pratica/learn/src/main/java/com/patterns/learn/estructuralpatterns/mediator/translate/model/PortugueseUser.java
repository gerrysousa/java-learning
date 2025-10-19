package com.patterns.learn.estructuralpatterns.mediator.translate.model;

import com.patterns.learn.estructuralpatterns.mediator.translate.mediator.Mediator;

public final class PortugueseUser extends User {

	public PortugueseUser(String name, Mediator mediator) {
		super(name, mediator, Language.PORTUGUESE);
	}
	
}
