package com.app.daos;

import com.app.exception.BusinessException;
import com.app.models.User;

public interface LoginDAO {
	
	public boolean isValidUserCredentials(User user) throws BusinessException;

}
