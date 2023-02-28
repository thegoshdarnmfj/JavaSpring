package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service("fakeDao")
public class PersonService {
	private final PersonDao personDao;
	
	@Autowired
	PersonService(@Qualifier("fakeDao") PersonDao personDao){
		this.personDao = personDao;
	}
	
	public int addPerson(Person person) {
			return personDao.addPerson(person.getId(), person.getName());
	}

}
