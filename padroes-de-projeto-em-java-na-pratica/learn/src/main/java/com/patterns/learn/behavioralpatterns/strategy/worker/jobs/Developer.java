package com.patterns.learn.behavioralpatterns.strategy.worker.jobs;

import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.transportation.CarStrategy;
import com.patterns.learn.behavioralpatterns.strategy.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
