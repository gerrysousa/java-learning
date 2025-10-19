package com.patterns.learn.estructuralpatterns.bridge.backend.services;

import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
