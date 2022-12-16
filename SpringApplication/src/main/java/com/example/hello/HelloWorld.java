package com.example.hello;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorld {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		HelloWorldService helloWorld=applicationContext.getBean(HelloWorldService.class);
		
		helloWorld.hello();
	}
}
