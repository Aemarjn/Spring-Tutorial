package com.sample.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

public class Person {
	
	private int id;
	
	@NotEmpty(message="* Name should not empty")
	private String name;
	
	@Min(value=1,message="* Age should be greaterthen 1")
	@Max(value=150,message="* Age should be lessthan 150")
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
