package com.SpringBoot.Task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.Task.entities.Users;
import com.SpringBoot.Task.entities.login;
import com.SpringBoot.Task.services.UserService;

@RestController
public class MyController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/api/home")
	public String home() {
		return "This is Home";
		
	}
	
	
	//Get User
	
	@ResponseStatus(code=HttpStatus.OK)
	@GetMapping("/api/users")
	public List<Users> getUsers()
	{
		return this.userService.getUsers();
		
	}
	
	
	//Get User ID
	
	
	@GetMapping("/api/users/{userid}")
	 public Users getUser(@PathVariable String userid) {
		return this.userService.getUser(Long.parseLong(userid)); 
		 
		 
	 }
	
	
	// Check Password
	
	@PostMapping(path="/api/users/login", consumes = "application/json")
	public ResponseEntity<Users> checkPassword(@RequestBody login log){
		return this.userService.checkPassword(log);
		
	}
	
	
	
}
