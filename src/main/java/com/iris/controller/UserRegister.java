package com.iris.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iris.model.User;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserRegister {
	
	@RequestMapping(value = "/registerform", method = RequestMethod.POST, consumes = {"application/json"})//,headers="Accept=application/json")
	//consumes = {"application/json"}, produces = {"application/json"}
	public void   test(@RequestBody User user) {
       
		 System.out.println(user.getFirstName());
		 System.out.println(user.getLastName());
		 System.out.println(user.getUsername());
		 System.out.println(user.getPassword());

		 //System.out.println(password);
		System.out.println("hello world...");
	   
	}
}
