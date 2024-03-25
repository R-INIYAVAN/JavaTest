package com.hexaware.model;

public class User {
	private int UserId;
	private String Username;
	private String Password;
	private String Role;
	
	public User() {
		System.out.println("Calling User Constraint...");
	}
	
	public User(int UserId,String Username,String Password,String Role) {
		this.UserId = UserId;
		this.Username = Username;
		this.Password = Password;
		this.Role = Role;
	}
	
	public void setUserId(int UserId) {
		this.UserId = UserId;
	}
	
	public int getUserId() {
		return UserId;
	}
	
	public void setUsername(String Username) {
		this.Username = Username;
	}
	
	public String getUsername() {
		return Username;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setRole(String Role) {
		this.Role = Role;
	}
	
	public String getRole() {
		return Role;
	}
	
	
}
