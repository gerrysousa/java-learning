package com.patterns.learn.behavioralpatterns.chain.processplus.service;

import com.patterns.learn.behavioralpatterns.chain.processplus.steps.ProcessStep;

public class GenericService {
	
	public static Object run(ProcessStep startProcess, ProcessContext initialContext) {
		try {
			ProcessContext result = startProcess.execute(initialContext);
			return result.getProcessResult();
		} catch (Exception e) {
			return "Error: " + e.getMessage();
		}
	}
}
