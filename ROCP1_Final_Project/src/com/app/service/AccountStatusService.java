package com.app.service;

import com.app.exception.BusinessException;
import com.app.models.AccountStatus;

public interface AccountStatusService {
	public boolean isValidAccountStatus(AccountStatus status) throws BusinessException;
}
