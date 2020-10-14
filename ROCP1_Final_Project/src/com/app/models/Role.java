package com.app.models;

public class Role {

	private int roleId; // primary key
	private String role; // not null, unique
		//"role's" values:  Admin, Employee, Standard, and Premium
	
	public Role() {
		super();
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", role=" + role + "]";
	}
}
