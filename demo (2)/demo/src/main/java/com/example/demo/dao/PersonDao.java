package com.example.demo.dao;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
@Repository
public interface PersonDao {

	public int insertPerson (Person person);
	
	public default void addPerson(String name) {
		UUID id = UUID.randomUUID();
		insertPerson(new Person(name, id));
	}
	
}
