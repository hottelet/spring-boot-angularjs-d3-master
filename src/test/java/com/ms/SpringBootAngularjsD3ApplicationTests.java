package com.ms;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ms.web.demo.main.SpringBootAngularjsD3Application;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootAngularjsD3Application.class)
@WebAppConfiguration
public class SpringBootAngularjsD3ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
