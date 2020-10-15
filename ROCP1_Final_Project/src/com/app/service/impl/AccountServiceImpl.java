package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

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
	
	@Override
	public List<Account> getAllAccounts() throws BusinessException {
		List<Account> accountList=null;
		accountList=dao.getAllAccounts();
		return accountList;
	}
	
	@Override
	public Account getAccountById(int accountId) throws BusinessException {
		Account account = null;
		//this is code based off the previous methods
		if(isValidId(accountId)){
			account = dao.getAccountById(accountId);
		}else{
			throw new BusinessException("Entered ID " + accountId + " is Invalid ...");
		}
		return account;
	}
	
	private boolean isValidId(int accountId){
		boolean b = false;
		if((accountId+"").matches("[0-9]{1, 4}")){
			b = true;
		}
		return b;
	}
}
