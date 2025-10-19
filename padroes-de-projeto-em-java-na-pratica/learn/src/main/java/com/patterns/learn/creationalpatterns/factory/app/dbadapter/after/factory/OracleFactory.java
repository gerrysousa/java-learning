package com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.factory;

import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db.DB;
import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db.OracleDB;

public class OracleFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new OracleDB();
	}

}
