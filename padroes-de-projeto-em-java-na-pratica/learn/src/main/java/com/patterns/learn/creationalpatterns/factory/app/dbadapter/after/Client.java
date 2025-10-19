package com.patterns.learn.creationalpatterns.factory.app.dbadapter.after;

import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db.DB;
import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.factory.OracleFactory;

public class Client {

	public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
