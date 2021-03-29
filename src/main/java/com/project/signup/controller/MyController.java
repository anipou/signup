package com.project.signup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.signup.entities.User;
import com.project.signup.services.UserService;


@RestController
public class MyController {
	
	@Autowired // auto dependency injection
	private UserService userService;
	@GetMapping(value = "/connectUSerAPI")
	private String getUser() {
		return this.userService.getCoursesList();
		
	}

	// to map this page in API
	@GetMapping("/home")
	public String home() {

		return "Welcome to the API world ";
	}

	// get the courses using collection
	@GetMapping("/users")
	public List<User> getUsers() {
		return this.userService.getUsers();
	}

	@GetMapping("/user/{userId}")
	public User getUser(@PathVariable String userId) {
		return this.userService.getUser(Long.parseLong(userId));

	}

	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return this.userService.addUser(user);

	}
}
