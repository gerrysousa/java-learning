package com.patterns.learn.estructuralpatterns.bridge.backend.services;

import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
