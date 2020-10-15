package com.app.models;

import java.util.List;

public class User {

	private int userId; //primary key
	private String userName;	//not null, unique
	private String password; // not null
	private String firstName; // not null
	private String lastName; // not null
	private String email; // not null
	private Role role;
	//private int role;
	
	//potential inclusion to help (or make things difficult)
	//private List<Account> account;
	
	public User() {
		super();
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	//will need to adjust to make
	public Role getRole() {
		return role;
	}


	public void setRole(Role role) {
		this.role = role;
		//role.setRoleId(roleId);
		
		//this.role = role.setRoleId(roleId);
	}

	//alternate for Role
	/*public int getRoleId() {
		return role;
	}

	//alternate for Role
	public void setRoleId(int roleId) {
		this.role = roleId;
	}*/


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", firstName="
				+ firstName + ", lastName=" + lastName + ", email=" + email + ", role=" + role + "]";
	}
	
}
