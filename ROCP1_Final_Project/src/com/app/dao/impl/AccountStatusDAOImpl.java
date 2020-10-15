package com.app.dao.impl;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.AccountStatusDAO;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.AccountStatus;

public class AccountStatusDAOImpl implements AccountStatusDAO {

	@Override
	public boolean isValidAccountStatus(AccountStatus status) throws BusinessException{
		boolean b = false;
		//
		return b;
	}

}
