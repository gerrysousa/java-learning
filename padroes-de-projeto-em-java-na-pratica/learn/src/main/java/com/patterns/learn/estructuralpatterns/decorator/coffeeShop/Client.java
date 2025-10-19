package com.patterns.learn.estructuralpatterns.decorator.coffeeShop;

import com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.Drink;
import com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.Expresso;
import com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.Tea;
import com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.decorators.DoubleDrink;
import com.patterns.learn.estructuralpatterns.decorator.coffeeShop.model.decorators.Milk;

public class Client {
	
	public static void order(String name, Drink drink) {
		System.out.println("Ordering a " + name);
		drink.serve();
		System.out.println(drink.getPrice());
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		order("Expresso", new Expresso());
		order("Tea", new Tea());
		order("Lungo", new DoubleDrink(new Expresso()));
		order("Cafe Au Lait", new Milk(new Expresso()));
		order("English Tea", new Milk(new Tea()));
	}
}
