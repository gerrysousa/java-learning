package com.patterns.learn.behavioralpatterns.chain.processplus.service;

import com.patterns.learn.behavioralpatterns.chain.processplus.steps.CheckPassword;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.CreateMap;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.GetUserByEmail;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.GetUserToken;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.GetUsers;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.ProcessStep;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.SaveUser;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.ValidateMandatoryField;
import com.patterns.learn.behavioralpatterns.chain.processplus.steps.ValidateToken;

public class ServicesCatalog {
	
	public static ProcessStep saveUserProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.name"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new SaveUser());
	
	public static ProcessStep loginProcess = buildChain(
			new CreateMap("input"),
			new ValidateMandatoryField("input.email"),
			new ValidateMandatoryField("input.password"),
			new GetUserByEmail(),
			new CheckPassword(),
			new GetUserToken());
	
	public static ProcessStep getUsersProcess = buildChain(
			new ValidateToken(),
			new GetUsers());
	
	private static ProcessStep buildChain(ProcessStep... steps) {
		for(int index = 0; index < steps.length -1; index++) {
			ProcessStep currentProcess = steps[index];
			currentProcess.setNextStep(steps[index + 1]);
		}
		return steps[0];
	}
}
