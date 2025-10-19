package com.patterns.learn.behavioralpatterns.strategy.worker.jobs;

import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.eat.VeggieFoodStrategy;
import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.transportation.BikeStrategy;
import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.work.DeveloperStrategy;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new VeggieFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
