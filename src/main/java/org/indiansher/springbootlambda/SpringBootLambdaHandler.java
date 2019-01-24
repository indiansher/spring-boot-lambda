package org.indiansher.springbootlambda;

import org.springframework.boot.SpringApplication;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class SpringBootLambdaHandler implements RequestHandler<Object, Void> {
	
	@Override
	public Void handleRequest(Object input, Context context) {
		System.out.println("In handleRequest");
		System.out.println("HELOOOOOOOOOOOOOOOOO");
		String[] args = {};
		SpringApplication.run(SpringBootLambdaMain.class, args).close();
		return null;
	}

}
