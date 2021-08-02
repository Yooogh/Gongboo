package com.consolution.test.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Foo72 {
	private String name;

	public void setName(String name) {
		this.name = name;
	}
	public void doFoo72() {
		System.out.println("Foo72.doFoo()");
	}
	public Foo72() {
	System.out.println("Foo72");
	}
	@PostConstruct
	public void start() {
	System.out.println("Foo72.start");
	}
	@PreDestroy
	public void stop() {
	System.out.println("Foo72.stop()");
	}
}
