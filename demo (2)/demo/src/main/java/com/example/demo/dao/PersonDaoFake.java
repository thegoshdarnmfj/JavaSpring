package com.example.demo.dao;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.*;

@Repository
public class PersonDaoFake implements PersonDao{
	ArrayList<Person> people = new ArrayList<>();

	@Override
	public int addPerson(UUID id, String name) {
		people.add(new Person(id, name));
		return 1;
	}

}
