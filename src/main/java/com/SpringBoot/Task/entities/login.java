package com.SpringBoot.Task.entities;

public class login {
	
	  private String username;
	private String password;

	public login(String username, String password) {
			super();
			this.setUsername(username);
			this.setPassword(password);
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

	

}
