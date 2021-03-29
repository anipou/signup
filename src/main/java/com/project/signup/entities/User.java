package com.project.signup.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO) 
	private long id;
	private String username;
	private String email;
	private String password;
	
	public User( String username, String email, String password) {
		super();
		
		this.username = username; 
		this.email = email;
		this.password = password;
	}
	public User() { 
		super();
		
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username; 
	} 
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [ username=" + username + ", email=" + email + ", password=" + password + "]";
	}
	
	

}
