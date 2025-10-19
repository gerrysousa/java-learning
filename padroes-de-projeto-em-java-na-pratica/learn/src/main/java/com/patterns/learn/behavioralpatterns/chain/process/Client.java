package com.patterns.learn.behavioralpatterns.chain.process;

import com.patterns.learn.behavioralpatterns.chain.process.service.GenericService;
import com.patterns.learn.behavioralpatterns.chain.process.service.ProcessContext;
import com.patterns.learn.behavioralpatterns.chain.process.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		ProcessContext ctx = new ProcessContext();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		ctx.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
	}
}
