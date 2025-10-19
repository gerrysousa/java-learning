package com.patterns.learn.estructuralpatterns.bridge.backend.dao;

import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;

public class UserMongoDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mongo Database!");
	}
}
