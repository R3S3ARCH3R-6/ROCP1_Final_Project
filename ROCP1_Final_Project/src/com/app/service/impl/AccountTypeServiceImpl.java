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
		
		if(!isValidAccountTypeName(type)){
			throw new BusinessException("Entered type " +type+ " is invlaid");
		}else{
			accountTypeList = dao.getAccountTypeByTitle(type);
		}
		
		return null;
	}

	private boolean isValidAccountTypeName(String typeName){
		boolean b = false;
		if(typeName.equalsIgnoreCase("savings") || 
				typeName.equalsIgnoreCase("checking")){
			b =true;
		}
		return b;
	}
	
	@Override
	public AccountType getAccountTypeById(int typeId) throws BusinessException {
		AccountType accountType = null;
		//this is code based off the previous methods
		if(isValidId(typeId)){
			accountType = dao.getAccountTypeById(typeId);
		}else{
			throw new BusinessException("Entered ID " + typeId + " is Invalid ...");
		}
		return accountType;
	}
	
	private boolean isValidId(int accountTypeId){
		boolean b = false;
		if((accountTypeId+"").matches("[0-9]{1, 5}")){
			b = true;
		}
		return b;
	}
}
