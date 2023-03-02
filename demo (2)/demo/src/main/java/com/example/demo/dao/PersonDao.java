package com.example.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.Person;

public interface PersonDao {
	
	public int insertPerson (Person person);
	
	public default void addPerson(String name) {
		UUID id = UUID.randomUUID();
		insertPerson(new Person(name, id));
	}
	
	public List<Person> selectAllPeople();

	public int deletePersonById(UUID id);
	
	public int updatePersonByID(UUID id, Person person);
	
	public Optional<Person> selectPersonById(UUID id);
	
}
