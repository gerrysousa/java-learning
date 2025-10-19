package com.patterns.learn.behavioralpatterns.strategy.worker.jobs;

import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.transportation.AirplaneStrategy;
import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.work.PilotStrategy;

public class Pilot implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new AirplaneStrategy().move();
	}

	@Override
	public void work() {
		new PilotStrategy().work();
	}

}
