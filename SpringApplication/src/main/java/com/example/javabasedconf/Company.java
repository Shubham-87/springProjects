package com.example.javabasedconf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Company {
	
	public static final String NAME="XXX";
	@Value("${name}")
	public String name;
	private Address address;
	public Company(Address address) {
		address.setCityName("Pune");
		this.address=address;
	}
	@Override
	public String toString() {
		return "Company [Name="+name+",address=" + address + "]";
	}
	
	
}
