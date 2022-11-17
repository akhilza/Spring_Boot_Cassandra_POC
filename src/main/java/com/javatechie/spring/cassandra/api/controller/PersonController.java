package com.javatechie.spring.cassandra.api.controller;


import com.javatechie.spring.cassandra.api.model.Person;
import com.javatechie.spring.cassandra.api.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepo personRepo;

	@PostMapping("/saveData")
	public String save(@RequestBody Person person) {
		personRepo.save(person);
		return "success";
	}

	@GetMapping("/all")
	public List<Person> getALlPersons() {
		return personRepo.findAll();
	}

}
