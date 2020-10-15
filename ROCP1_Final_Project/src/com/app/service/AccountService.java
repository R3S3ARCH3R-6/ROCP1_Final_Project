package com.app.service;

import com.app.exception.BusinessException;
import com.app.models.Account;

public interface AccountService {
	public boolean isValidAccount(Account account) throws BusinessException;
}
