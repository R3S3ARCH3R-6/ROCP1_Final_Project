package com.app.service;

import com.app.exception.BusinessException;
import com.app.models.AccountType;

public interface AccountTypeService {
	public boolean isValidAccountType(AccountType type) throws BusinessException;
}
