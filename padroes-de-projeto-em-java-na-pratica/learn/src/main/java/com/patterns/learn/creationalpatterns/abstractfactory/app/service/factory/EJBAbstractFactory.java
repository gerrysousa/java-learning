package com.patterns.learn.creationalpatterns.abstractfactory.app.service.factory;

import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.CarEJBService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.CarService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.UserEJBService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.UserService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

	@Override
	public UserService getUserService() {
		return new UserEJBService();
	}

	@Override
	public CarService getCarService() {
		return new CarEJBService();
	}

}



