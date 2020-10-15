package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.AccountDAO;
import com.app.dao.impl.AccountDAOImpl;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	private AccountDAO dao = new AccountDAOImpl();
	@Override
	public boolean isValidAccount(Account account) throws BusinessException{
		boolean b = false;
		if(account!=null && ((account.getAccountId()+"")!=null) && ((account.getBalance()+"")!=null) 
				&& ((account.getUserId()+"")!=null) && (account.getAccountId()+"").matches("[0-9]{1,4}")){
			b = dao.isValidAccount(account);
		}else{
			throw new BusinessException("Invalid Account");
		}
		return b;
	}
}
