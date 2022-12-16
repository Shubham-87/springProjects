package com.example.javabasedconf;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	private static AnnotationConfigApplicationContext context;

	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee employee=context.getBean(Employee.class);
	    employee.setName("ABC");
	    Address address=new Address();
	    address.setCityName("Nag");
	    employee.setAddress(address);
	    System.out.println(employee.toString());

	}

}
