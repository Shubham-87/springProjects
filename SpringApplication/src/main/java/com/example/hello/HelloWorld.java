package com.example.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	private static ClassPathXmlApplicationContext applicationContext;

	public static void main(String[] args) {
	
		applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorldService helloWorld=(HelloWorldService) applicationContext.getBean("helloWorldService");
		
		helloWorld.hello();
	}
}
