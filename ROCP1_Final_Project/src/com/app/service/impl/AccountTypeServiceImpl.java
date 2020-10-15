package com.app.service.impl;

import java.util.List;

import com.app.dao.AccountTypeDAO;
import com.app.dao.impl.AccountTypeDAOImpl;
import com.app.exception.BusinessException;
import com.app.models.AccountType;
import com.app.service.AccountTypeService;

public class AccountTypeServiceImpl implements AccountTypeService {
	
	private AccountTypeDAO dao = new AccountTypeDAOImpl(); 
	@Override
	public boolean isValidAccountType(AccountType type) throws BusinessException{
		boolean b = false;
		
		if(type!=null && type.getType()!=null && (type.getTypeId()+"")!=null 
				&& (type.getType().equalsIgnoreCase("savings") || 
				type.getType().equalsIgnoreCase("checking"))){
			b = dao.isValidAccountType(type);
		}else{
			throw new BusinessException("Invalid Account Type");
		}
		return b;
	}
	
	@Override
	public List<AccountType> getAllAccountTypes() throws BusinessException {
		List<AccountType> accountTypeList = null;
		accountTypeList = dao.getAllAccountTypes();
		return accountTypeList;
	}
	
	@Override
	public List<AccountType> getAccountTypeByTitle(String type) throws BusinessException {
		List<AccountType> accountTypeList = null;
		if(!isValidAccountType(type)){
			throw new BusinessException("Entered type " +type+ " is invlaid");
		}else{
			accountTypeList = dao.getAllAccountTypeByTitle();
		}
		
		return null;
	}

	@Override
	public AccountType getAccountTypeById(int typeId) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
