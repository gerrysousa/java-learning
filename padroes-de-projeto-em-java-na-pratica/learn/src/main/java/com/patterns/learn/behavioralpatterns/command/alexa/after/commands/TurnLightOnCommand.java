package com.patterns.learn.behavioralpatterns.command.alexa.after.commands;

import com.patterns.learn.behavioralpatterns.command.alexa.after.lights.GenericLight;

public class TurnLightOnCommand implements Command {
	private GenericLight light;
	
	
	public TurnLightOnCommand(GenericLight light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.turnOn();
	}
}
