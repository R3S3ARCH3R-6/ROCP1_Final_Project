package com.app.dao.impl;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.AccountDAO;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.AccountStatus;
import com.app.models.AccountType;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public boolean isValidAccount(Account account) throws BusinessException{
		boolean b = false;
		//SQL code
		return b;
	}

}
