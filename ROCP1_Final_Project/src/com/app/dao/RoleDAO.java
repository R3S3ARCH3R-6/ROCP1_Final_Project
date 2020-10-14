package com.app.dao;

import java.util.List;
import com.app.exception.BusinessException;
import com.app.models.Role;
//import com.app.models.User;

public interface RoleDAO {
	//public int addRole(Role role) throws BusinessException;
	
	//admin only
	//public int updateRole(int roleId) throws BusinessException;
	//public int deleteRole(int roleId) throws BusinessException;
	
	//employee and Admin functions
	//public List<Role> getAllRoles() throws BusinessException;
	public Role getRoleById(int roleId) throws BusinessException;
	public List<Role> getRoleByTitle(String role) throws BusinessException;

}
