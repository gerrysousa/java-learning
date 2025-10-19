package com.patterns.learn.estructuralpatterns.adapter.hexagonal.core.ports;

import java.util.List;

import com.patterns.learn.estructuralpatterns.adapter.hexagonal.core.model.User;

public interface UserRepository {
	void save(User user);
	List<User> getAll();
}
