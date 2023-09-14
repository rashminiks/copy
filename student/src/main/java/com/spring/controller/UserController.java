package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.entity.User;
import com.spring.service.UserService;

@RestController
@CrossOrigin(origins="*")  
public class UserController {
	
@Autowired(required = true)
private UserService userService;

@PostMapping("register")
public String saveUser(@RequestBody User user) {
	 userService.saveUser(user);
	 return "user saved";
	
}
}
