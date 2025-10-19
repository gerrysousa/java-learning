package com.patterns.learn.creationalpatterns.abstractfactory.app.service.factory;

import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.CarRestApiService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.CarService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.UserRestApiService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.UserService;

public class RestAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserRestApiService();
	}

	@Override
	public CarService getCarService() {
		return new CarRestApiService();
	}

}
