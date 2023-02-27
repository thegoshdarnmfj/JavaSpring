package com.example.demo.dao;

import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
	public int addPerson(UUID id, String name);
	
	public default void insertPerson (Person person) {
		addPerson(UUID.randomUUID(), person.getName());
	}
	
}
