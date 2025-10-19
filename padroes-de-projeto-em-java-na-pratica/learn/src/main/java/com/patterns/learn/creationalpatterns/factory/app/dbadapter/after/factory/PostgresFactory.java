package com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.factory;

import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db.DB;
import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
