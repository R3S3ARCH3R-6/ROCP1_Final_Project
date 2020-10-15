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
}