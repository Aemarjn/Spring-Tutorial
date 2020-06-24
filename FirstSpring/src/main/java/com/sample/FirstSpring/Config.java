package com.sample.FirstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.sample.FirstSpring")
public class Config {
	
	@Bean
	public Address getAddress(){
		return new Address();
	}
	
	@Bean
	public Person getPerson(){
		return new Person();
	}

}
