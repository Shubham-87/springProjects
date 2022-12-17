package com.example.javabasedconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		Company company=context.getBean(Company.class);
	    System.out.println(company.toString());

	}

}
