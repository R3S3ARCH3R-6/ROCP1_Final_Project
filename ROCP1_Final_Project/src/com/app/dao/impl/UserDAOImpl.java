package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.UserDAO;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.User;

public class UserDAOImpl implements UserDAO {

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
