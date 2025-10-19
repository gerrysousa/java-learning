package com.patterns.learn.behavioralpatterns.strategy.calc.after;

import com.patterns.learn.behavioralpatterns.strategy.calc.after.strategies.AdditionOperation;
import com.patterns.learn.behavioralpatterns.strategy.calc.after.strategies.DivisionOperation;
import com.patterns.learn.behavioralpatterns.strategy.calc.after.strategies.MultiplicationOperation;
import com.patterns.learn.behavioralpatterns.strategy.calc.after.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
