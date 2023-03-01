package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {

	public int insertPerson (Person person);
	
	public default void addPerson(String name, UUID id) {
		insertPerson(new Person(name, id));
	}
	
}
