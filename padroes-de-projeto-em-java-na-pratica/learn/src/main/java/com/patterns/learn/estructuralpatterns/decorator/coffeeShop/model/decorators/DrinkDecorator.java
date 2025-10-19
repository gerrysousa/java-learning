package com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.decorators;

import com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.Drink;

public abstract class DrinkDecorator implements Drink {
	protected Drink drink;
	
	public DrinkDecorator(Drink drink) {
		this.drink = drink;
	}
}