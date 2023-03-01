package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

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


}
