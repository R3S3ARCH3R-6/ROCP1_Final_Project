package com.app.dao.impl;

import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.dao.AccountDAO;
import com.app.dao.dbutils.MySqlConnection;
import com.app.exception.BusinessException;
import com.app.models.Account;
import com.app.models.AccountStatus;
import com.app.models.AccountType;
import com.app.models.User;

public class AccountDAOImpl implements AccountDAO {

	@Override
	public boolean isValidAccount(Account account) throws BusinessException{
		boolean b = false;
		try(Connection connection=MySqlConnection.getConnection()){
			String sql="select accountId from account where accountId=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, account.getAccountId());
			//preparedStatement.setString(2, account.));
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Account");
			}
			return b;
		}catch(ClassNotFoundException | SQLException e) {
			System.out.println(e); //this line you should take it off before going live(production)
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN.....");
		}

	}

	@Override
	public List<Account> getAllAccounts() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountById(int accountId) throws BusinessException {
		Account account = null;
		try(Connection connection=MySqlConnection.getConnection()){
			account = new Account();
			String sql="select accountId,balance,status,type from customer where id=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, accountId);
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				account=new Account();
				account.setAccountId(accountId);
				User user = new User();
				account.setUserId(user.getUserId());
				account.setBalance(resultSet.getDouble("balance"));
				//check this
				AccountStatus status = new AccountStatus();
				account.setStatus(status);
				AccountType type = new AccountType();
				account.setType(type);
			}else{
				throw new BusinessException("No accounts with ID " + accountId); 
			}

		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e); //for test
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN!!!!!....");
		}
		return account;
	}
	
	
}