package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloWorldService {

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
