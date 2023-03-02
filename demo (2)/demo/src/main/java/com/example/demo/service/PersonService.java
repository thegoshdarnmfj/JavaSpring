package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.example.demo.dao.PersonDao;
import com.example.demo.model.Person;

@Service("fakeDao")
public class PersonService {
	private final PersonDao personDao;
	
	@Autowired
	PersonService(@Qualifier("fakeDao") PersonDao personDao){
		this.personDao = personDao;
	}
	
	
	public int insertPerson(Person person){
		personDao.insertPerson(person);
		return 0;
	}
	
	public List<Person> getAllPeople(){
		return personDao.selectAllPeople();
	}
	public Optional<Person> selectPersonById(UUID id) {
		return personDao.selectPersonById(id);
	}
	
	public int deletePersonById(UUID id) {
		return personDao.deletePersonById(id);
	}
	
	public int updatePersonByID(UUID id, Person person) {
		return personDao.updatePersonByID(id, person);
	}

}