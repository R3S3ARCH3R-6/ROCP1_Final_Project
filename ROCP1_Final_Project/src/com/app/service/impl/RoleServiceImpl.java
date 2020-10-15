package com.app.service.impl;

import com.app.models.Role;
import com.app.dao.RoleDAO;
import com.app.dao.impl.RoleDAOImpl;
import com.app.exception.BusinessException;
import com.app.service.RoleService;

public class RoleServiceImpl implements RoleService{

	private RoleDAO dao = new RoleDAOImpl();
	@Override
	public boolean isValidRole(Role role) throws BusinessException{
		boolean b = false;
		if(role!=null && role.getRole()!=null && (role.getRoleId()+"")!=null 
				&& (role.getRoleId()+"").matches("[0-9]{1,4}") && 
				(role.getRole().equalsIgnoreCase("administrator") || 
						role.getRole().equalsIgnoreCase("employee") ||
						role.getRole().equalsIgnoreCase("customer"))) {
			b=dao.isValidRole(role);
			
		}else {
			throw new BusinessException("Invalid Role");
		}
		return b;
	}
}
