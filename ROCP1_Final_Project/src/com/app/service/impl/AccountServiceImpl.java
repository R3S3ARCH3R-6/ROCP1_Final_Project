package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	@Override
	public boolean isValidAccount(Account account) throws BusinessException{
		boolean b = false;
		if((account.getAccountId()+"").matches("[0-9]{1,4}")){
			b = true;
		}else{
			b = false;
		}
		return b;
	}
}
