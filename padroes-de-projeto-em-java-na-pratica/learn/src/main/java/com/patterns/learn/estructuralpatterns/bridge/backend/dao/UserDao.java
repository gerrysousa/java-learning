package com.patterns.learn.estructuralpatterns.bridge.backend.dao;

import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;

public interface UserDao {
	void save(User user);
}
