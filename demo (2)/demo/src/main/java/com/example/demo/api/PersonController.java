package com.example.demo.api;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Person;
import com.example.demo.service.PersonService;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	PersonController(PersonService personService){
		this.personService = personService;
		
	}
	@PostMapping
	public void insertPerson(@RequestBody Person person) {
		personService.insertPerson(person);
	}
	
	@GetMapping
	public List<Person> getAllPeople() {
		return personService.getAllPeople();
	}
	
	public Person selectPersonById(UUID id) {
		return personService.selectPersonById(id).orElse(null);
	}
	
	public int deletePersonById(UUID id) {
		return personService.deletePersonById(id);
	}
	
	public int updatePersonByID(UUID id, Person person) {
		return personService.updatePersonByID(id, person);
	}
}
