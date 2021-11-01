package com.SpringBoot.Task.entities;

public class Users {
   public Users(long id, String user, String username, String password) {
		super();
		this.id = id;
		this.user = user;
		this.username = username;
		this.password = password;
	}
private long id;
   private String user;
   public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
private String username;
   private String password;
public Users(long id, String username, String password) {
	super();
	this.id = id;
	this.username = username;
	this.password = password;
}
public Users() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Users [id=" + id + ", user=" + user + ", username=" + username + ", password=" + password + "]";
}
   
   
   
   
   
   
}
