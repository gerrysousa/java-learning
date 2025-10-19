package com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.factory;

import com.patterns.learn.creationalpatterns.factory.app.dbadapter.after.db.DB;

public interface DBFactory {
	DB getDatabase();
}
