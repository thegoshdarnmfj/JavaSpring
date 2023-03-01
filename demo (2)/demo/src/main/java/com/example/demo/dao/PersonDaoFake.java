package com.example.demo.dao;

import java.util.ArrayList;

import com.example.demo.model.Person;

public class PersonDaoFake implements PersonDao {
	private ArrayList<Person> personDB;
	public PersonDaoFake() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insertPerson(Person person) {
		personDB.add(person);
		return 0;
	}

}
