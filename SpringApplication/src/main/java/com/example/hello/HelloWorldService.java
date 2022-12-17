package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class HelloWorldService {
@Autowired
HelloWorld2 helloWorld;

public HelloWorld2 getHelloWorld() {
	return helloWorld;
}

public void setHelloWorld(HelloWorld2 helloWorld) {
	this.helloWorld = helloWorld;
}

public void hello() {
		helloWorld.hello();
	}
	
}
