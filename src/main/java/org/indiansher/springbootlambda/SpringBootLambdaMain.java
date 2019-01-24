package org.indiansher.springbootlambda;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

@SpringBootConfiguration
public class SpringBootLambdaMain implements CommandLineRunner{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Before Starting Spring boot APP");
		SpringApplication.run(SpringBootLambdaMain.class, args).close();
		System.out.println("Spring boot APP finished");
	}
	
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World");
	}

}
