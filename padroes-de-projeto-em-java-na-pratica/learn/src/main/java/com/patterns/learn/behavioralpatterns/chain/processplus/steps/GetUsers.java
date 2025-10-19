package com.patterns.learn.behavioralpatterns.chain.processplus.steps;

import com.patterns.learn.behavioralpatterns.chain.processplus.repository.UserRepository;
import com.patterns.learn.behavioralpatterns.chain.processplus.service.ProcessContext;

public class GetUsers extends ProcessStep {
	
	public GetUsers(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object users = UserRepository.getInstance().getUsers();
		context.put("users", users);
		return next(context, users);
	}

}
