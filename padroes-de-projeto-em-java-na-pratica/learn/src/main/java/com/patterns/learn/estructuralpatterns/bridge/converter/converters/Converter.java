package com.patterns.learn.estructuralpatterns.bridge.converter.converters;

import com.patterns.learn.estructuralpatterns.bridge.converter.employees.Employee;

public interface Converter {
	String getEmployeeFormated(Employee emp);
}
