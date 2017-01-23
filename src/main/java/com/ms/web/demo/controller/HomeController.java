package com.ms.web.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
    public String home() {
        return "home";
    }
	
	@RequestMapping("/demo")
    public String demo() {
        return "demo";
    }
	
	
	@RequestMapping("/persons")
    public String persons() {
        return "persons";
    }
}
