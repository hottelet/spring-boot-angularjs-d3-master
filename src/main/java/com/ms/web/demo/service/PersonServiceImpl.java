/**
 * 
 */
package com.ms.web.demo.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.web.demo.dao.PersonDAO;
import com.ms.web.demo.model.Person;

/**
 * @author PV
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired private PersonDAO personDAO;
	/* (non-Javadoc)
	 * @see com.ms.web.demo.service.PersonService#findAll()
	 */
	@Override
	public Collection<Person> findAll() {
		// TODO Auto-generated method stub
		return personDAO.findAll();
	}
	@Override
	public Person findOne(Long id) {
		// TODO Auto-generated method stub
		return personDAO.findOne(id);
	}
	@Override
	public Person create(Person person) {
		if(person.getId()!=null){
			return null;
		}
		// TODO Auto-generated method stub
		return personDAO.save(person);
	}
	@Override
	public List<Person> findByFirstName(String firstName) {
		// TODO Auto-generated method stub
		return personDAO.findByFirstName(firstName);
	}

}
