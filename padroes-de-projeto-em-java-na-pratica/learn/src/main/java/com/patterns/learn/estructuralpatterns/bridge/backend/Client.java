package com.patterns.learn.estructuralpatterns.bridge.backend;

import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserMongoDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserMysqlDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserOracleDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.dao.UserPostgresDao;
import com.patterns.learn.estructuralpatterns.bridge.backend.model.User;
import com.patterns.learn.estructuralpatterns.bridge.backend.services.UserEJB;
import com.patterns.learn.estructuralpatterns.bridge.backend.services.UserRest;
import com.patterns.learn.estructuralpatterns.bridge.backend.services.UserService;
import com.patterns.learn.estructuralpatterns.bridge.backend.services.UserSoap;

public class Client {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
