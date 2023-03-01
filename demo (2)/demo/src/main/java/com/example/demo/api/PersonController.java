package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	PersonController(PersonService personService){
		this.personService = personService;
		
	}
	
	public void insertPerson(Person person) {
		personService.insertPerson(person);
	}

}
