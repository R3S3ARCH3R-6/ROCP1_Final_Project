package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.models.Account;

public interface AccountService {
	public List<Account> getAllAccounts() throws BusinessException;
	public Account getAccountById(int accountId) throws BusinessException;
	
	public boolean isValidAccount(Account account) throws BusinessException;
}
