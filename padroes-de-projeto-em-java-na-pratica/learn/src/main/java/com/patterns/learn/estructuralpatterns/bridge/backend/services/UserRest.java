package com.patterns.learn.estructuralpatterns.bridge.backend.services;

import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
