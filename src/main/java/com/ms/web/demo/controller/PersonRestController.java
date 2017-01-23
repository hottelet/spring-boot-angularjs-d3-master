package com.ms.web.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.web.demo.model.Person;
import com.ms.web.demo.service.PersonService;

@RestController
class PersonRestController{

	@Autowired private PersonService personService;
	
	@RequestMapping("/")
	public String entry(){
		personService.create(new Person("Mantu","Singh",25));
		personService.create(new Person("Rishu","Singh",10));
		personService.create(new Person("Rakesh","Singh",15));
		personService.create(new Person("Subhash","Singh",30));
		personService.create(new Person("Amit","Singh",20));
		personService.create(new Person("Akash","Singh",30));
		personService.create(new Person("Rahul","Singh",18));
		personService.create(new Person("Vikash","Singh",25));
		return "Spring Boot AngularJS D3.js Demo";
	}
	
	@RequestMapping("/persns")
	public  List<Person> persons(){
		return (List<Person>) personService.findAll();
	}
	
}