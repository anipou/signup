package com.project.signup.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.signup.dao.UserDao;
import com.project.signup.entities.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {

	}

	@Override
	public List<User> getUsers() {

		return userDao.findAll();
	}

	@Override
	public User getUser(long userId) {

		return userDao.getOne(userId);

	}

	@Override
	public User addUser(User user) {

		userDao.save(user);
		return user;
	}

	@Override
	public String getCoursesList() {
		String url = "http://localhost:9090/courses";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		System.out.println("Result:" + result);
		return result;  

	}

}
