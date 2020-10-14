package com.app.login.service;

import com.app.exception.BusinessException;
import com.app.models.User;

public interface LoginService {

	public boolean isValidUserCredentials(User user) throws BusinessException;
	
}
