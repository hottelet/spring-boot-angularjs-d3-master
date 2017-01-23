/**
 * 
 */
package com.ms.web.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.ms.web.demo.model.Person;

/**
 * @author PV
 *
 */
@Repository
public interface PersonDAO extends JpaRepository<Person, Long>{
    List<Person> findByFirstName(String firstName);
}
