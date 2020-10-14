package com.app.dao.impl;

import java.util.List;

import com.app.dao.AccountDAO;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.AccountStatus;
import com.app.models.AccountType;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public int addAccount(Account account) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateAccount(int accountId) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAccount(int accountId) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Account> getAllAccounts() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountById() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountStatuses(AccountStatus status) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> getAllAccountByType(AccountType type) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
