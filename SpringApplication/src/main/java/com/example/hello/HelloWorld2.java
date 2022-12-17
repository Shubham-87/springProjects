package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class HelloWorld2 {

	@Autowired
	Util util;
	
	void hello() {
		util.show();
		System.out.println("Hello Spring!");
	}
	public Util getUtil() {
		return util;
	}

	public void setUtil(Util util) {
		this.util = util;
	}

}
