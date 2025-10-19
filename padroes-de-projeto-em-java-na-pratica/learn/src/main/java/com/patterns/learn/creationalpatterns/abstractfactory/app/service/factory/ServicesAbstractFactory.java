package com.patterns.learn.creationalpatterns.abstractfactory.app.service.factory;

import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.CarService;
import com.patterns.learn.creationalpatterns.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
