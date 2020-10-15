package com.app.service;

import com.app.exception.BusinessException;
import com.app.models.User;

public interface UserService {
	public boolean isValidUser(User user) throws BusinessException;
}
