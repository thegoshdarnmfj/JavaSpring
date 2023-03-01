package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;
@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	PersonController(PersonService personService){
		this.personService = personService;
		
	}
	@PostMapping
	public void insertPerson(Person person) {
		personService.insertPerson(person);
	}

}
