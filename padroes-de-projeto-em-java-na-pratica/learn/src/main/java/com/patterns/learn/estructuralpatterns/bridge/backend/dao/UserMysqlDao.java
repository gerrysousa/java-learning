package com.patterns.learn.estructuralpatterns.bridge.backend.dao;

import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;

public class UserMysqlDao implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("Saving the user in the Mysql Database!");
	}
}
