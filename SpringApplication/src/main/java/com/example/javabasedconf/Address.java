package com.example.javabasedconf;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Address [cityName=" + cityName + "]";
	}
	
}
