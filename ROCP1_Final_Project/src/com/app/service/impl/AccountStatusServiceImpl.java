package com.app.service.impl;

import com.app.dao.AccountStatusDAO;
import com.app.dao.impl.AccountStatusDAOImpl;
import com.app.exception.BusinessException;
import com.app.models.AccountStatus;
import com.app.service.AccountStatusService;

public class AccountStatusServiceImpl implements AccountStatusService {
	
	private AccountStatusDAO dao = new AccountStatusDAOImpl();
	@Override
	public boolean isValidAccountStatus(AccountStatus status) throws BusinessException{
		boolean b = false;
		if(status!=null && ((status.getStatusId()+"")!=null) && status.getStatus()!=null 
				&& (status.getStatusId() +"").matches("[0-9]{1,4}")){
			b = dao.isValidAccountStatus(status);
		}else{
			throw new BusinessException("Invalid Account Status");
		}
		return b;
	}
}
