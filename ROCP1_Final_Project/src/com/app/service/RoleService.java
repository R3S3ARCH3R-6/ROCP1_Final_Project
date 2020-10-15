package com.app.service;

import com.app.exception.BusinessException;
import com.app.models.Role;

public interface RoleService {

	public boolean isValidRole(Role role) throws BusinessException;
	
}
