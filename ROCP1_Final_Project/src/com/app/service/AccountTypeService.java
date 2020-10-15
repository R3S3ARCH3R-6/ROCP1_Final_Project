package com.app.service;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.models.AccountType;

public interface AccountTypeService {
	public boolean isValidAccountType(AccountType type) throws BusinessException;
	
	public List<AccountType> getAllAccountTypes() throws BusinessException;
	public List<AccountType> getAccountTypeByTitle(String type) throws BusinessException;
	public AccountType getAccountTypeById(int typeId) throws BusinessException;

}
