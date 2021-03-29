package com.project.signup.services;

import java.util.List;

import com.project.signup.entities.User;

public interface UserService {
	//For Loose Coupling
public List<User> getUsers();

public User getUser(long userId);

public User addUser(User user);

public String getCoursesList();  
	


}
