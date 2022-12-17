package com.example.javabasedconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.example.*"})
@PropertySource(value = {"classpath:demo.properties"})
//@PropertySource(value = "D:\\Master_Workspace\\DevelopementTools\\demo.properties")
public class AppConfig {

	@Bean
	public Employee employee() {
		return new Employee();
	}
	
	/*
	 * @Bean public Address address() { return new Address(); }
	 */
}
