package org.indiansher.springbootlambda;

import java.util.HashMap;
import java.util.Map;

public class DummyBean {

	private final String name;
	private final Map<String,String> map = new HashMap<>();

	public DummyBean(String name) {
		this.name = name;
		System.out.println("Creating DummyBean:" + name);
	}

}
