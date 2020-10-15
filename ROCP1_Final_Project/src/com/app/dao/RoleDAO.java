package com.app.dao;

import java.util.List;
import com.app.exception.BusinessException;
import com.app.models.Role;


public interface RoleDAO {
	
	//public Role getRoleById(int roleId) throws BusinessException;
	//public List<Role> getRoleByTitle(String role) throws BusinessException;

	public boolean isValidRole(Role role) throws BusinessException;
	
}
