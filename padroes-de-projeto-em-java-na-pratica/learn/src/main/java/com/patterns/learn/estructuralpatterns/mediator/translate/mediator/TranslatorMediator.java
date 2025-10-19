package com.patterns.learn.estructuralpatterns.mediator.translate.mediator;

import com.patterns.learn.estructuralpatterns.mediator.translate.model.User;
import com.patterns.learn.estructuralpatterns.mediator.translate.services.Translator;

public class TranslatorMediator extends Mediator {

	private Translator translator = new Translator();

	protected String getMessage(String message, User to, User from) {
		return translator.getTranslation(from.getLanguage(), to.getLanguage(), message);
	}
}
