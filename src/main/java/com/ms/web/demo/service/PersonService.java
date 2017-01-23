package com.ms.web.demo.service;

import java.util.Collection;
import java.util.List;

import com.ms.web.demo.model.Person;

public interface PersonService {
	
	Collection<Person> findAll();
	
	Person findOne(Long id);
	
	Person create(Person person);
	
	List<Person> findByFirstName(String firstName);

}
