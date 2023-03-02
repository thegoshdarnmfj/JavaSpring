package com.example.demo.dao;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.model.*;

@Repository
public class PersonDaoFake implements PersonDao{

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
		Optional<Person> personMaybe = selectPersonById(id);
		if (personMaybe.isEmpty()) {
			return 0;
		}
		personDB.remove(personMaybe.get());
		return 0;
	}

	@Override
	public int updatePersonByID(UUID id, Person person) {
		return selectPersonById(id)
				.map(p -> {
					int indexOfPersonToDelete = personDB.indexOf(person);
					if (indexOfPersonToDelete >= 0) {
						personDB.set(indexOfPersonToDelete, person);
						return 1;
					}
					return 0;			
		})
		.orElse(0);
	}

	@Override
	public Optional<Person> selectPersonById(UUID id) {
		return personDB.stream()
				.filter(person -> person.getId().equals(id))
		        .findFirst();
	}
	
	


}
