package com.sample.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sample.model.Person;

public class DAO {
	
	JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		System.out.println("Connection Establised");
		this.jdbc = jdbc;
	}

	public void save(Person person){
		
		String sql = "INSERT INTO person(name,age) value(?,?)";
		jdbc.update(sql,person.getName(),person.getAge());
		
	}
	
}
