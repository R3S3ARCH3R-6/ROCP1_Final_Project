package com.app.dao;

import java.util.List;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.AccountStatus;
import com.app.models.AccountType;

public interface AccountDAO {
	
	//Admin and authorized User only
	//public int addAccount(Account account) throws BusinessException;
	//public int updateAccount(int accountId) throws BusinessException;
	//public int deleteAccount(int accountId) throws BusinessException;
	
	//shared among all
	//public List<Account> getAllAccounts() throws BusinessException;
	//public Account getAccountById() throws BusinessException;
	
	//may need help here
	//public List<Account> getAllAccountStatuses(AccountStatus status) throws BusinessException;
	//public List<Account> getAllAccountByType(AccountType type) throws BusinessException;	
	
	public boolean isValidAccount(Account account) throws BusinessException;
}
