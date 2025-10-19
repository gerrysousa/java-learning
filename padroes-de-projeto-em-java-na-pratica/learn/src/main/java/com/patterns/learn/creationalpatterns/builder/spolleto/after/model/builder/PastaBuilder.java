package com.patterns.learn.creationalpatterns.builder.spolleto.after.model.builder;

import com.patterns.learn.creationalpatterns.builder.spolleto.after.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {

	public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}
