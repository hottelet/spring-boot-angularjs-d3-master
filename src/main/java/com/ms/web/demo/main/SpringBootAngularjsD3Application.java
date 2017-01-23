package com.ms.web.demo.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.web.demo.model.Person;
import com.ms.web.demo.service.PersonService;

 
/**
 * @author PV
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.ms.*")
@EnableJpaRepositories("com.ms.*")
@EntityScan("com.ms.*")
public class SpringBootAngularjsD3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularjsD3Application.class, args);
	}
}



