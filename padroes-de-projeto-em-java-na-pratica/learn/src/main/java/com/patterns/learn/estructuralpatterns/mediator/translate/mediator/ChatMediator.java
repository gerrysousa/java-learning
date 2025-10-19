package com.patterns.learn.estructuralpatterns.mediator.translate.mediator;

import com.patterns.learn.estructuralpatterns.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
