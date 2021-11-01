package com.SpringBoot.Task.services;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.SpringBoot.Task.entities.Users;
import com.SpringBoot.Task.entities.login;

public interface UserService {

	public List<Users> getUsers();
	
	public Users getUser(long userid);
	
	public ResponseEntity<Users> checkPassword(login log);
}
