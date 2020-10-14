package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.app.dao.AccountTypeDAO;
import com.app.dao.dbutils.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.models.AccountType;

public class AccountTypeDAOImpl implements AccountTypeDAO{

	private AccountTypeDAO dao = new AccountTypeDAOImpl();  
	
	@Override
	public int addAccountType(AccountType type) throws BusinessException {
		int c = 0;
		if(!isValidType(type.getType())) {
			throw new BusinessException("Entered type "+type.getType()+" is Invalid");
		}else {
			//code here for DAO
			c=dao.addAccountType(type);
		}
		return c;
		
	}

	private boolean isValidType(String typeName){
		boolean b = false;
		if(typeName.equalsIgnoreCase("savings") || typeName.equalsIgnoreCase("checking")){
			b = true;
		}else{
			b = false;
		}
		return b;
	}
	
	
	@Override
	public int updateAccountType(int typeId) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteAccountType(int typeId) throws BusinessException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<AccountType> getAllAccountTypes() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountType getAccountTypeById(int typeId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountType> getAccountTypeByTitle(String type) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
