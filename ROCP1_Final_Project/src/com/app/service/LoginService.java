package com.app.service;

import com.app.exception.BusinessException;
import com.app.models.User;

public interface LoginService {

	public boolean isValidUserCredentials(User user) throws BusinessException;
	
}
