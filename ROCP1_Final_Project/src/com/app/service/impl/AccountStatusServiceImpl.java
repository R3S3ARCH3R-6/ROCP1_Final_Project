package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.exception.BusinessException;
import com.app.models.AccountStatus;
import com.app.service.AccountStatusService;

public class AccountStatusServiceImpl implements AccountStatusService {
	
	@Override
	public boolean isValidAccountStatus(AccountStatus status) throws BusinessException{
		boolean b = false;
		if((status.getStatusId() +"").matches("[0-9]{1,4}")){
			b = true;
		}else{
			b = false;
		}
		return b;
	}
}
