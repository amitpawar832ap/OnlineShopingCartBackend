package com.iris.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iris.model.User;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RegisterController {
	
	 @RequestMapping(value = "/register", method = RequestMethod.POST)
	 public void demo(@RequestBody User user) {
		 System.out.println(user.getFirstName());
	 }

}
