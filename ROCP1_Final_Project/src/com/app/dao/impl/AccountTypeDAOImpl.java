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
	
	@Override
	public boolean isValidAccountType(AccountType type){
		boolean b = false;
		try(Connection connection = MySqlConnection.getConnection()){
			String sql = "select account_type from bank where type=?";
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, type.getRole());
			
			ResultSet resultSet=preparedStatement.executeQuery();
			if(resultSet.next()) {
				b=true;
			}else {
				throw new BusinessException("Invalid Role Credentials");
			}
			
		}catch(ClassNotFoundException | SQLException e){
			//System.out.println(e); //this line you should take it off before going live(production)
			throw new BusinessException("Internal error occured... Kindly contact SYSADMIN.....");
		}
		return b;
	}
	
}
