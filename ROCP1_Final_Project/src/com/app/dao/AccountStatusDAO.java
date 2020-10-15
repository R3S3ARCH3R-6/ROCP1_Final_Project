package com.app.dao;

import java.util.List;

import com.app.exception.BusinessException;
import com.app.models.AccountStatus;

public interface AccountStatusDAO {
	//public int addStatus(AccountStatus status) throws BusinessException;
	
	//admin only
	//public int updateStatus(int statusId) throws BusinessException;
	//public int deleteStatus(int statusId) throws BusinessException;
	
	//employee and Admin functions
//	public List<AccountStatus> getAllStatuses() throws BusinessException;
//	public AccountStatus getStatusById(int statusId) throws BusinessException;
//	public List<AccountStatus> getStatusByType(String status) throws BusinessException;

	public boolean isValidAccountStatus(AccountStatus status) throws BusinessException;
}
