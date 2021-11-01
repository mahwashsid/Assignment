package com.SpringBoot.Task.services;

import com.SpringBoot.Task.entities.Users;
import com.SpringBoot.Task.entities.login;


import java.util.ArrayList;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service


public class UserServiceImpl implements UserService {

	
List<Users>	list;
//Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

public UserServiceImpl() {
	list = new ArrayList<>();
	list.add(new Users(123,"Mahwash","Mah111","D$V$L08"));
	list.add(new Users(143,"Manali","yeon23","mana23"));
	list.add(new Users(345,"Devy","purple1","QRE198"));
	
	
}
	
	@Override
	public List<Users> getUsers(){
		return list;
	}
	
	
	
	
@Override
	public Users getUser(long userid) {
		Users c= null;
		for(Users users:list) {
			if(users.getId()==userid) {
				c = users;
				break;
			}
		}
		return c;
	}
	
public ResponseEntity<Users> checkPassword(login log) {
	 ResponseEntity<Users> match = null;
	 
	 for(Users users:list) {
		System.out.println("Check1" + users.getUsername().equalsIgnoreCase(log.getUsername().toString()));
			if ( users.getUsername().equalsIgnoreCase(log.getUsername().toString())) {
				System.out.println("Check2" + match);
				if(log.getPassword().equalsIgnoreCase("D$V$L08")) {
				
					return new ResponseEntity<Users>(users,HttpStatus.OK);
				}
				else {
					return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
					
				}
							}	
			else {
				return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
				
			}
				
			};
		

return null;
}}
