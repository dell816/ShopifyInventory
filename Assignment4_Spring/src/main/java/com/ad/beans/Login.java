package com.ad.beans;

// Login Class
public class Login {
	
	//Fields
	private int userId;
	private String username;
	private String password;
	
	//Constructors
	public Login() {
		
	}
	public Login(int userId, String username, String password) {

		this.userId = userId;
		this.username = username;
		this.password = password;
	}
	
	//Setting Getters & Setters
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	
	//toString() Method 
	@Override
	public String toString() {
		return "Login [userId=" + userId + ", username=" + username + ", password=" + password + "]";
	}
	
}
