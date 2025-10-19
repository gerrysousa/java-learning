package com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
