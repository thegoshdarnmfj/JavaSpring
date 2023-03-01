package com.example.demo.dao;

import java.util.ArrayList;

import com.example.demo.model.Person;

public class PersonDaoFake implements PersonDao {
	private ArrayList<Person> personDB = new ArrayList<>();

	@Override
	public int insertPerson(Person person) {
		personDB.add(person);
		return 1;
	}

}
