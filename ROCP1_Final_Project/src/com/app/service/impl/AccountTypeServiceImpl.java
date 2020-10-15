package com.app.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.models.AccountType;
import com.app.service.AccountTypeService;

public class AccountTypeServiceImpl implements AccountTypeService {
	@Override
	public boolean isValidAccountType(AccountType type){
		boolean b = false;
		if(type.getType().equalsIgnoreCase("savings") || type.getType().equalsIgnoreCase("checking")){
			b = true;
		}else{
			b = false;
		}
		return b;
	}
}
