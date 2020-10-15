package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.exception.BusinessException;
import com.app.models.User;
import com.app.service.UserService;

public class UserServiceImpl implements UserService {
	@Override
	public boolean isValidUser(User user) throws BusinessException{
		boolean b = false;
		if((user.getUserId()+"").matches("[0-9]{1,4}")){
			b = true;
		}else{
			b = false;
		}
		return b;
	}
}
