package com.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.dao.AccountTypeDAO;
import com.app.dao.dbutils.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.models.AccountType;

public class AccountTypeDAOImpl implements AccountTypeDAO{
	
	@Override
	public boolean isValidAccountType(AccountType type) throws BusinessException{
		boolean b = false;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select typeId from account_type where typeId=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, type.getType());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Type");
			}
			
		}catch(ClassNotFoundException | SQLException e){
			//System.out.println(e); //this line you should take it off before going live(production)
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN.....");
		}
		return b;
	}

	@Override
	public List<AccountType> getAllAccountTypes() throws BusinessException {
		List<AccountType> accountTypeList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select typeId,type from account_type";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				AccountType accountType=new AccountType();
				accountType.setTypeId(resultSet.getInt("typeId"));
				accountType.setType(resultSet.getString("type"));
				accountTypeList.add(accountType);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(accountTypeList.size()==0) {
			throw new BusinessException("No account_types as of now in the Database");
		}
		return accountTypeList;
	}

	@Override
	public List<AccountType> getAccountTypeByTitle(String type) throws BusinessException {
		List<AccountType> accountTypeList=new ArrayList<>();
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select typeId,type from account_type where type=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				AccountType accountType=new AccountType();
				accountType.setTypeId(resultSet.getInt("typeId"));
				accountType.setType(type);
				accountTypeList.add(accountType);
			}
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		if(accountTypeList.size()==0) {
			throw new BusinessException("No account_types as of now in the Database for type " +type);
		}
		return accountTypeList;
	}

	@Override
	public AccountType getAccountTypeById(int typeId) throws BusinessException {
		AccountType accountType = null;
		try(Connection connection=MySqlConnection.getConnection()){
			accountType = new AccountType();
			String sql="select typeId, type from account_type where typeId=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setLong(1, typeId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				accountType=new AccountType();
				accountType.setTypeId(typeId);
				accountType.setType(resultSet.getString("type"));
			}else{
				throw new BusinessException("No customers with typeId " + typeId); 
			}

		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}

		return accountType;
	}
	
	
	
}
