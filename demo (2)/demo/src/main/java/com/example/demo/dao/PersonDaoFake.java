package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
@Repository("fakeDao")
public class PersonDaoFake implements PersonDao {
	private ArrayList<Person> personDB = new ArrayList<>();

	@Override
	public int insertPerson(Person person) {
		personDB.add(person);
		return 1;
	}

	@Override
	public List<Person> selectAllPeople() {
		return personDB;
	}

	@Override
	public int deletePersonById(UUID id) {
		personDB.remove(selectPersonById(id)); //RETURN AND FIX
		return 0;
	}

	@Override
	public int updatePersonByID(UUID id, Person person) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		return personDB.stream()
				.filter(person -> person.getId().equals(id))
		        .findFirst();
	}
	
	


}
