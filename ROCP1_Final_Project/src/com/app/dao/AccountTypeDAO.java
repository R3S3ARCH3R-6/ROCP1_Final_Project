package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.models.AccountType;

public interface AccountTypeDAO {
	//public int addAccountType(AccountType type) throws BusinessException;
	
	//admin and correct users only
	//public int updateAccountType(int typeId) throws BusinessException;
	//public int deleteAccountType(int typeId) throws BusinessException;
	
	//employee and Admin functions
	public List<AccountType> getAllAccountTypes() throws BusinessException;
	public List<AccountType> getAccountTypeByTitle(String type) throws BusinessException;

	public boolean isValidAccountType(AccountType type) throws BusinessException;
	public AccountType getAccountTypeById(int typeId) throws BusinessException;
}
